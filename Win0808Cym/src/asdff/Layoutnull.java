package asdff;

import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layoutnull extends JFrame {
	
	
	public Layoutnull() throws HeadlessException {
		super("Null Layout");
		Container cp=getContentPane();
		cp.setLayout(null);
		JButton btn=new JButton("»Æ¿Œ");
		btn.setSize(70,30);
		btn.setLocation(200,150);
		
		
		cp.add(btn);
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Layoutnull();
		

	}

	

}
