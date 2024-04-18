package ex6_Item;

import java.awt.Frame;

import javax.swing.*;
public class Ex7_JImage {
	public static void main(String[] args) {
		Frame f = new Frame("테이블 만들기");
		f.setBounds(500,300,500,500);
		f.setLayout(null);
	

		ImageIcon back = new ImageIcon("src/images/simson1.png");
		JLabel jl_back = new JLabel(back);
		jl_back.setBounds(0,0,500,500);
		
		f.add(jl_back);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
}
