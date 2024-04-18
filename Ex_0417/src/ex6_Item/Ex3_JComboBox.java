package ex6_Item;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Ex3_JComboBox {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(null);
		String[] title = {"c","java","python","kotlin","Js"};
		JComboBox<String> jcm1 = new JComboBox<>(title);
		jcm1.setBounds(50,50,100,30);
		f.add(jcm1);
		
		
		f.setBounds(400,400,305,250);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
