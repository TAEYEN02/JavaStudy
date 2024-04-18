package ex5_JText;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Ex1_JText {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		JLabel lb1 = new JLabel("이름");
		JLabel lb2 = new JLabel("나이");
		JLabel lb3 = new JLabel("비밀번호");
		
		JTextField tf = new JTextField(20);
		JTextArea ta = new JTextArea(7,20);
		JPasswordField pf = new  JPasswordField(20);
		
		f.add(lb1);
		f.add(tf);
		f.add(lb2);
		f.add(ta);
		f.add(lb3);
		f.add(pf);
		
		f.setBounds(400,400,305,250);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		
	}
}
