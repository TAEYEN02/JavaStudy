package ex6_Item;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex1_JCheckBox {
	public static void main(String[] args) {
		JCheckBox jcb1,jcb2,jcb3;
		JRadioButton jrb1, jrb2, jrb3;
		JPanel jp1, jp2;
		JFrame f = new JFrame();
		
		JPanel p1 = new  JPanel();
		jp1 = new JPanel();
		jcb1 = new JCheckBox("음악감상", true);
		jcb2 = new JCheckBox("등산", true);
		jcb3 = new JCheckBox("조깅", false);
		
		p1.add(jcb1);
		p1.add(jcb2);
		p1.add(jcb3);
		
		f.add(p1,"North");
		
		JPanel p2 = new JPanel();
		jrb1 = new JRadioButton("자가", true);
		jrb2 = new JRadioButton("전세", false);
		jrb3 = new JRadioButton("월세", false);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		
		p2.add(jrb1);
		p2.add(jrb2);
		p2.add(jrb3);
		
		f.add(p2,"South");
		
		f.setBounds(400,400,305,250);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
	}
}
