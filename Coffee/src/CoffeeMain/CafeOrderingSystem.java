package CoffeeMain;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.*;

public class CafeOrderingSystem {

	private JFrame frame;
	private JPanel mainPanel;
	private JPanel menuPanel;
	private Map<String, List<MenuItem>> menuItems;
	private List<String> orderList = new ArrayList<>();
	private JTextArea orderArea;
	private static int totalPrice = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CafeOrderingSystem window = new CafeOrderingSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		});
	}

	public CafeOrderingSystem() {
		initialize();
		createMenuItems();
	}

	private void initialize() {
		frame = new JFrame("카페 주문 시스템");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 784, 561);
		menuPanel = new JPanel();
		menuPanel.setBounds(0, 28, 524, 533);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);

		JPanel topPanel = createTopPanel();
		mainPanel.add(topPanel); // 맨 위 -> 북쪽에 위치

		mainPanel.add(menuPanel); // 중앙에 위치

		JPanel categoryPanel = createCategoryPanel();
		mainPanel.add(categoryPanel);

		orderArea = new JTextArea();
		orderArea.setBounds(536, 38, 236, 391);
		mainPanel.add(orderArea);
	}

	// TopPanel
	private JPanel createTopPanel() {
		JPanel topPanel = new JPanel(new GridLayout(1, 3));
		topPanel.setBounds(0, 0, 786, 28);

		JButton coffeeBtn = new JButton("커피");
		coffeeBtn.addActionListener(e -> showMenu("커피"));
		JButton teaAdeBtn = new JButton("차/에이드");
		teaAdeBtn.addActionListener(e -> showMenu("차/에이드"));
		JButton dessertBtn = new JButton("디저트");
		dessertBtn.addActionListener(e -> showMenu("디저트"));

		topPanel.add(coffeeBtn);
		topPanel.add(teaAdeBtn);
		topPanel.add(dessertBtn);

		return topPanel;
	}

	// CategoryPanel
	private JPanel createCategoryPanel() {
		JPanel categoryPanel = new JPanel();
		categoryPanel.setBounds(527, 443, 259, 118);

		JButton reviseBtn = new JButton("수정");
		reviseBtn.setBounds(12, 5, 119, 23);
		reviseBtn.addActionListener(e -> showOrder());
		JButton resetBtn = new JButton("초기화");
		resetBtn.setBounds(128, 5, 119, 23);
		resetBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				orderList.clear();
				totalPrice = 0;
				updateOrderArea();
			}
		});
		categoryPanel.setLayout(null);

		categoryPanel.add(reviseBtn);
		categoryPanel.add(resetBtn);

		JButton paymentButton = new JButton("주문하기(카드결제)");
		paymentButton.setBounds(12, 33, 235, 75);
		paymentButton.addActionListener(event -> {
			if (orderList.isEmpty()) {
				JOptionPane.showMessageDialog(frame, "주문 목록이 비어 있습니다.");
				return;
			}

			// 주문 내용과 타이머를 포함하는 패널 생성
			JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());

			// 주문 내용 표시
			StringBuilder sb = new StringBuilder("<html>결제할 주문:<br>");
			for (String item : orderList) {
				sb.append(item).append("<br>");
			}
			sb.append("<br>총 가격: ").append(totalPrice).append("<br></html>"); // 총 가격 출력
			JLabel orderLabel = new JLabel(sb.toString());
			panel.add(orderLabel, BorderLayout.CENTER);

			// 타이머 레이블 생성 및 추가
			JLabel timerLabel = new JLabel();
			panel.add(timerLabel, BorderLayout.SOUTH);

			// JOptionPane 인스턴스 생성
			JOptionPane optionPane = new JOptionPane(panel, JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);

			// JDialog 생성
			JDialog dialog = optionPane.createDialog(frame, "주문");

			// 타이머 스레드 생성 및 시작
			Thread timerThread = new Thread(() -> {
				for (int i = 30; i >= 0; i--) {
					final int secondsLeft = i;
					System.out.println(i);
					SwingUtilities.invokeLater(() -> timerLabel.setText("남은 시간: " + secondsLeft + "초")); // 레이블 업데이트
					if (i != 0) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
							System.out.println("인터럽트 받았습니다!");
							dialog.dispose(); // 대화 상자 닫기
							return; // 스레드 종료
						}
					}
				}
				SwingUtilities.invokeLater(() -> {
					JOptionPane.showMessageDialog(null, "30초 안에 선택하지 않아 대기화면으로 돌아갑니다.", "시간 초과",
							JOptionPane.INFORMATION_MESSAGE);
					dialog.dispose();
				});
			});
			timerThread.start();

			// 대화 상자에 패널 표시
			dialog.setVisible(true);

			// 사용자의 선택에 따른 결과 저장
			Object selectedValue = optionPane.getValue();
			int result;
			if (selectedValue == null) {
				result = JOptionPane.CLOSED_OPTION;
			} else {
				result = (int) ((Integer) selectedValue).intValue();
			}

			// 결제가 완료되었을 때
			if (result == JOptionPane.YES_OPTION) {
				// 타이머 스레드 인터럽트
				timerThread.interrupt();
				JOptionPane.showMessageDialog(frame, "결제가 완료되었습니다.");
				orderList.clear();
				totalPrice = 0;
				updateOrderArea();
			}
			// 결제를 취소했을 때
			else if (result == JOptionPane.NO_OPTION) {
				// 타이머 스레드 인터럽트
				timerThread.interrupt();
			}

		});
		categoryPanel.add(paymentButton);

		return categoryPanel;
	}

	private void showOrder() {
		if (orderList.isEmpty()) {
			JOptionPane.showMessageDialog(frame, "주문 목록이 비어 있습니다.");
			return;
		}

		List<String> coffeeOrders = new ArrayList<>();
		List<String> teaAdeOrders = new ArrayList<>();
		List<String> dessertOrders = new ArrayList<>();

		for (String order : orderList) {
			String[] splitOrder = order.split(" ");
			String category = getCategory(splitOrder[0]);
			switch (category) {
			case "커피":
				coffeeOrders.add(order);
				break;
			case "차/에이드":
				teaAdeOrders.add(order);
				break;
			case "디저트":
				dessertOrders.add(order);
				break;
			}
		}

		JCheckBox[] coffeeCheckBoxes = createCheckBoxArray(coffeeOrders);
		JCheckBox[] teaAdeCheckBoxes = createCheckBoxArray(teaAdeOrders);
		JCheckBox[] dessertCheckBoxes = createCheckBoxArray(dessertOrders);

		// 대화 상자에 카테고리와 메뉴들을 가로로 정렬하여 배치
		JPanel categoryPanel = new JPanel(new GridLayout(1, 3));
		categoryPanel.add(new JLabel("커피"));
		categoryPanel.add(new JLabel("차/에이드"));
		categoryPanel.add(new JLabel("디저트"));

		JPanel menuPanel = new JPanel(new GridLayout(1, 3));
		menuPanel.add(createMenuCheckBoxPanel(coffeeCheckBoxes));
		menuPanel.add(createMenuCheckBoxPanel(teaAdeCheckBoxes));
		menuPanel.add(createMenuCheckBoxPanel(dessertCheckBoxes));

		JPanel panel = new JPanel(new BorderLayout());
		panel.add(categoryPanel, BorderLayout.NORTH);
		panel.add(menuPanel, BorderLayout.CENTER);

		int result = JOptionPane.showConfirmDialog(frame, panel, "주문 수정", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE);

		if (result == JOptionPane.OK_OPTION) {
			int newTotalPrice = totalPrice;
			newTotalPrice -= processSelectedItems(coffeeCheckBoxes, coffeeOrders);
			newTotalPrice -= processSelectedItems(teaAdeCheckBoxes, teaAdeOrders);
			newTotalPrice -= processSelectedItems(dessertCheckBoxes, dessertOrders);

			totalPrice = newTotalPrice;
			updateOrderArea();
		}
	}

	private JPanel createMenuCheckBoxPanel(JCheckBox[] checkBoxes) {
		JPanel panel = new JPanel(new GridLayout(checkBoxes.length, 1));
		for (JCheckBox checkBox : checkBoxes) {
			panel.add(checkBox);
		}
		return panel;
	}

	private String getCategory(String itemName) {
		for (String category : menuItems.keySet()) {
			for (MenuItem item : menuItems.get(category)) {
				if (item.getName().equals(itemName)) {
					return category;
				}
			}
		}
		return null;
	}

	private JCheckBox[] createCheckBoxArray(List<String> orders) {
		JCheckBox[] checkBoxes = new JCheckBox[orders.size()];
		for (int i = 0; i < orders.size(); i++) {
			checkBoxes[i] = new JCheckBox(orders.get(i));
		}
		return checkBoxes;
	}

	private int processSelectedItems(JCheckBox[] checkBoxes, List<String> orders) {
		int totalPrice = 0;
		List<String> itemsToRemove = new ArrayList<>(); // orders 리스트가 orderList를 복사한 것이므로 orderList에 직접적으로 list를 만들어서
														// 제거
		for (int i = 0; i < checkBoxes.length; i++) {
			if (checkBoxes[i].isSelected()) {
				String[] splitOrder = orders.get(i).split(" "); // 주문 문자열을 공백으로 분할하여 메뉴 이름하고 가격분리
				String itemPrice = splitOrder[splitOrder.length - 1];
				int price = Integer.parseInt(itemPrice);// 가격 문자열을 정수로
				totalPrice += price;// 기격에 해당한 항목 가격 더함
				// 제거할 항목을 리스트에 추가
				itemsToRemove.add(orders.get(i));
			}
		}
		// 주문 목록에서 항목 제거
		orderList.removeAll(itemsToRemove);
		return totalPrice;
	}

	private void showMenu(String category) {
		menuPanel.removeAll();

		List<MenuItem> items = menuItems.get(category);
		if (items != null) {
			for (MenuItem item : items) {
				ImageIcon icon = new ImageIcon(item.getImagePath());
				Image image = icon.getImage();
				Image newimg = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);

				JButton button = new JButton(item.getName(), icon);
				button.addActionListener(e -> {
					if (category.equals("커피")) {
						JRadioButton hotRadio = new JRadioButton("HOT");
						JRadioButton iceRadio = new JRadioButton("ICE");

						ButtonGroup radioGroup = new ButtonGroup();
						radioGroup.add(hotRadio);
						radioGroup.add(iceRadio);

						JPanel radioPanel = new JPanel();
						radioPanel.add(hotRadio);
						radioPanel.add(iceRadio);

						JFrame newFrame = new JFrame(item.getName());
						newFrame.setSize(300, 250);

						JLabel label = new JLabel();
						newFrame.getContentPane().add(label, BorderLayout.CENTER);

						Thread timerThread = new Thread(() -> {
							for (int i = 30; i >= 0; i--) {
								System.out.println(i);
								label.setText("<html>이름: " + item.getName() + "<br>가격: " + item.getPrice()
										+ "<br><br>남은 시간: " + i + "</html>");
								if (i != 0) {
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e1) {
										System.out.println("인터럽트 받았습니다!");
										return; // 스레드 종료
									}
								}
							}
							JOptionPane.showMessageDialog(null, "30초 안에 선택하지 않아 대기화면으로 돌아갑니다.", "시간 초과",
									JOptionPane.INFORMATION_MESSAGE);
							newFrame.dispose();
						});

						timerThread.start();

						newFrame.getContentPane().add(label, BorderLayout.CENTER);

						JButton addButton = new JButton("추가하기");
						addButton.addActionListener(event -> {
							if (hotRadio.isSelected()) {

							} else if (iceRadio.isSelected()) {

							} else {
								JOptionPane.showMessageDialog(null, "옵션을 선택해 주세요.", "옵션 선택",
										JOptionPane.WARNING_MESSAGE);
								return;
							}

							String selectedOption = hotRadio.isSelected() ? "HOT" : "ICE";
							orderList.add(item.getName() + " " + selectedOption + " " + item.getPrice());
							totalPrice += item.getPrice();
							timerThread.interrupt();
							updateOrderArea();
							newFrame.dispose();
						});

						newFrame.getContentPane().add(radioPanel, BorderLayout.NORTH);
						newFrame.getContentPane().add(addButton, BorderLayout.SOUTH);

						newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

						newFrame.addWindowListener(new WindowAdapter() {
							@Override
							public void windowClosed(WindowEvent e) {
								timerThread.interrupt();
							}
						});

						newFrame.setLocationRelativeTo(null);
						newFrame.setVisible(true);

					} else {
						JFrame newFrame = new JFrame(item.getName());
						newFrame.setSize(300, 200);

						JLabel label = new JLabel();
						newFrame.getContentPane().add(label, BorderLayout.CENTER);

						Thread timerThread = new Thread(() -> {
							for (int i = 30; i >= 0; i--) {
								System.out.println(i);
								label.setText("<html>이름: " + item.getName() + "<br>가격: " + item.getPrice()
										+ "<br><br>남은 시간: " + i + "</html>");
								if (i != 0) {
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e1) {
										System.out.println("인터럽트 받았습니다!");
										return; // 스레드 종료
									}
								}
							}
							JOptionPane.showMessageDialog(null, "30초 안에 선택하지 않아 대기화면으로 돌아갑니다.", "시간 초과",
									JOptionPane.INFORMATION_MESSAGE);
							newFrame.dispose();
						});

						timerThread.start();

						newFrame.getContentPane().add(label, BorderLayout.CENTER);

						JButton addButton = new JButton("추가하기");
						addButton.addActionListener(event -> {
							orderList.add(item.getName() + " " + item.getPrice());
							totalPrice += item.getPrice();
							updateOrderArea();
							timerThread.interrupt();
							updateOrderArea();
							newFrame.dispose();
						});

						newFrame.getContentPane().add(addButton, BorderLayout.SOUTH);

						newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

						newFrame.addWindowListener(new WindowAdapter() {
							@Override
							public void windowClosed(WindowEvent e) {
								timerThread.interrupt();
							}
						});

						newFrame.setLocationRelativeTo(null);
						newFrame.setVisible(true);
					}
				});
				menuPanel.add(button);
			}
		}

		menuPanel.revalidate();
		menuPanel.repaint();

	}

	private void updateOrderArea() {
		StringBuilder sb = new StringBuilder("주문:\n");
		for (String item : orderList) {
			sb.append(item).append("\n");
		}
		sb.append("\n총 가격: ").append(totalPrice);
		orderArea.setText(sb.toString());
	}

	private void createMenuItems() {
		menuItems = new HashMap<>();

		// 커피 메뉴
		List<MenuItem> coffeeItems = new ArrayList<>();
		coffeeItems.add(new MenuItem("아메리카노", 3000, "D:/coffee.jpg"));
		coffeeItems.add(new MenuItem("카페라떼", 3500, "D:/cafelatee.jpg"));
		coffeeItems.add(new MenuItem("에스프레소", 4000, "D:/nespresso.jpg"));
		menuItems.put("커피", coffeeItems);

		// 차/에이드 메뉴
		List<MenuItem> teaAdeItems = new ArrayList<>();
		teaAdeItems.add(new MenuItem("복숭아에이드", 2500, "D:/peachAde.jpg"));
		teaAdeItems.add(new MenuItem("레몬에이드", 3000, "D:/lemon.jpg"));
		teaAdeItems.add(new MenuItem("홍차", 3000, "D:/redTea.jpg"));
		teaAdeItems.add(new MenuItem("유자차", 3000, "D:/yuja.jpg"));
		menuItems.put("차/에이드", teaAdeItems);

		// 디저트 메뉴
		List<MenuItem> dessertItems = new ArrayList<>();
		dessertItems.add(new MenuItem("딸기케익", 5000, "D:/strawberry.jpg"));
		dessertItems.add(new MenuItem("치즈케익", 5500, "D:/cheese.jpg"));
		menuItems.put("디저트", dessertItems);
	}
}