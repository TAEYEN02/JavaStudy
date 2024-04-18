package ex6_Item;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Ex5_JTable {
	public static void main(String[] args) {
		JFrame f = new JFrame("테이블만들기");
		f.setLayout(new BorderLayout());
		
		String[] title = {"사번", "성명", "부서"};
		String[][] data = {{"1", "고애신", "총무과"}, {"2", "최유신", "인사과"}, {"3", "구동매", "전산과"}};
		JTable table = new JTable(data, title);
		
		//수직, 수평 스크롤바 설정하기 위한 상수
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane js = new JScrollPane(table,v,h);
		
		f.add(js, BorderLayout.CENTER);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(300,200,300,200);
		f.setVisible(true);
	}
}
