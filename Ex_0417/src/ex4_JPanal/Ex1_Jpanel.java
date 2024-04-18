package ex4_JPanal;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex1_Jpanel {
	public static void main(String[] args) {
		JFrame f = new JFrame("배치관리자 예제");
		
		JPanel p1 = new  JPanel();
		p1.setBackground(Color.yellow);
		//p1.setLayout(new FlowLayout());
		p1.setLayout(new GridLayout(3,2));
		for(int i = 1; i<=5;i++) {
			p1.add(new JButton(""+i));
		}
		
		f.add(p1);
		
		f.setBounds(300, 300, 150, 200);
		f.setVisible(true);
		
	}
	
}
