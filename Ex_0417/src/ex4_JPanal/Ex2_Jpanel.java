package ex4_JPanal;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex2_Jpanel {
	public static void main(String[] args) {
		JFrame f = new JFrame("배치관리자 예제");
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.yellow);
		
		p1.setLayout(new BorderLayout());
		
		p1.add("North",new JButton("위"));
		p1.add("West",new JButton("왼쪽"));
		p1.add("Center",new JButton("가운데"));
		p1.add("East",new JButton("오른쪽"));
		p1.add("South",new JButton("아래"));
		
		f.add(p1);
		f.setBounds(300, 300, 150, 200);
		f.setVisible(true);
		
	}
}
