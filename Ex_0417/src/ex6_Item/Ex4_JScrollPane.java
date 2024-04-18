package ex6_Item;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Ex4_JScrollPane {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel jp = new  JPanel();
		jp.setLayout(new GridLayout(10,5));
		int cnt = 1;
		for(int i = 1; i<=10;i++) {
			for(int j=1; j<=5;j++) {
				jp.add(new JButton("버튼" +cnt));
			}
		}
		
		//스크롤바를 설정하기 위한 상수
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(jp,v,h);
		
		f.add(js,BorderLayout.CENTER);
		
		f.setBounds(400,400,305,250);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
