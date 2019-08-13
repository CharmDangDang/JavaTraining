package asdff;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Cym18_6 extends JFrame {

	public Cym18_6() throws HeadlessException {
		super("예제라 이말이야");
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JRadioButton("자바"));
		cp.add(new JRadioButton("C"));
		cp.add(new JRadioButton("VisualBasic"));
		cp.add(new JRadioButton("JSP"));
		cp.add(new JRadioButton("PHP"));
		cp.add(new JButton("자바"));
		cp.add(new JButton("C"));
		cp.add(new JButton("VisualBasic"));
		cp.add(new JButton("JSP"));
		cp.add(new JButton("PHP"));
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	
		
		
	}
	public static void main(String[] args) {
		new Cym18_6();
		

	}

}
