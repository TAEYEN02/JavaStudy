package ex2_JFrame;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;


public class JFrameTest	extends JFrame {
	
	public JFrameTest() {
		setTitle("제목");
		setBounds(300,300,300,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		JButton jbtn1,jbtn2,jbtn3;
		
		JFrameTest f = new JFrameTest();
		
		jbtn1 = new JButton("1");
		jbtn1.setPreferredSize(new Dimension(100,100));
		jbtn2 = new JButton("2");
		jbtn2.setPreferredSize(new Dimension(100,100));
		jbtn3 = new JButton("3");
		jbtn3.setPreferredSize(new Dimension(100,100));
		
		f.add(jbtn1);
		f.add(jbtn2);
		f.add(jbtn3);
		
	}
}
