package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class suupYEJE extends JFrame {
	
	public suupYEJE()  {
		super("¿¬½À");
		Container cp=getContentPane();
		cp.setLayout(null);
		
		JLabel lbl=new JLabel("ICE BORN",JLabel.CENTER);
		lbl.setBackground(Color.WHITE); lbl.setOpaque(true);
		lbl.setSize(300,20);
		JPanel panel1=new JPanel();
		panel1.setBackground(Color.GRAY);
		panel1.setSize(300,50);
		panel1.setLocation(0,20);
		
		JPanel panel2=new JPanel();
		panel2.setBackground(Color.pink);
		panel2.setSize(300,400);
		panel2.setLocation(0,70);
		panel2.setLayout(null);

		JButton btn1=new JButton("RED");
		JButton btn2=new JButton("GREEN");
		JButton btn3=new JButton("BLUE");
		panel1.add(btn1);
		panel1.add(btn2);
		panel1.add(btn3);
		
		JLabel lb1=new JLabel("Hello");
		JLabel lb2=new JLabel("JAVA");
		JLabel lb3=new JLabel("LOVE");
		panel2.add(lb1);
		panel2.add(lb2);
		panel2.add(lb3);
		lb1.setSize(80,20);
		lb2.setSize(80,20);
		lb3.setSize(80,20);
		lb1.setLocation(50,100);
		lb2.setLocation(150,200);
		lb3.setLocation(80,200);
		cp.add(panel1);	
		cp.add(panel2);
		cp.add(lbl);
		
		
		setSize(300,400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new suupYEJE();
		
	}

	
}
class NorthPane extends JPanel{
	NorthPane(){
		JButton btnred=new JButton("RED");
		JButton btngrn=new JButton("GREEN");
		JButton btnblu=new JButton("BLUE");
		this.add(btnred);
		add(btngrn);
		add(btnblu);
		
}