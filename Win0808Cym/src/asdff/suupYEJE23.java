package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class suupYEJE23 extends JFrame{
	
	public suupYEJE23()  {
		super("¿¬½À");
		Container cp=getContentPane();		
		NorthPane np = new NorthPane();
		CentPane ep = new CentPane();
		cp.add(np,BorderLayout.NORTH);
		cp.add(ep,BorderLayout.CENTER);
		setSize(300,400);
		setVisible(true);
	}
	
}	
public static void main(String[] args) {
		new suupYEJE23();
		
	}

	

class NorthPane extends JPanel{
	NorthPane(){
		JButton btnred=new JButton("RED"); 
		JButton btngrn=new JButton("GREEN");  
		JButton btnblu=new JButton("BLUE"); 
		add(btnred);
		add(btngrn);
		add(btnblu);
		setBackground(Color.GRAY);
	}	
}
class CentPane extends JPanel{
	CentPane() {	
		setLayout(null);
		
		JLabel hellol=new JLabel("Hello"); hellol.setSize(80,20);
		hellol.setLocation(100,20);
		JLabel lovel=new JLabel("LOVE"); lovel.setSize(80,20);
		lovel.setLocation(20,150);
		JLabel javal=new JLabel("JAVA"); javal.setSize(80,20); 
		javal.setLocation(200,120);
		add(hellol);
		add(lovel);
		add(javal);
		}
	
	
}
}