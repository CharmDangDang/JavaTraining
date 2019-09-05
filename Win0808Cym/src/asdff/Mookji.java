package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mookji extends JFrame implements ActionListener{
	
	JLabel result;
	JLabel comresult;
	ImageIcon[] jlb;
	public Mookji(){
		super();
		Random rd = new Random();
		Container  ct = getContentPane();
	String[] dkanro = {"가위","바위","보"};
		JPanel upjpl = new JPanel();
		JPanel dojpl = new JPanel();
		dojpl.setBackground(Color.BLUE);
		
		upjpl.setSize(300,300);
		upjpl.setBackground(Color.PINK);
		jlb = new ImageIcon[3];
		result = new JLabel();
		result.setSize(200,200);
		result.setBackground(Color.CYAN);
		comresult = new JLabel();
		result.setOpaque(true);
		JButton[] jb = new JButton[3];
		
		
		jlb[0] = new ImageIcon("C:\\Users\\Administrator\\Downloads\\gawi.jpg");
		jlb[1] = new ImageIcon("C:\\Users\\Administrator\\Downloads\\bawi.jpg");
		jlb[2] = new ImageIcon("C:\\Users\\Administrator\\Downloads\\bo.jpg");
		
		
		upjpl.setLayout(new FlowLayout());
		dojpl.setLayout(new FlowLayout());
		
		
		for(int i =0 ; i<jb.length ; i++) {
			
			//jb[i].setSize(50,50);
			jb[i]=new JButton (dkanro[i],jlb[i]);
			//add(jb[i]);
			upjpl.add(jb[i]);
			
		}
		dojpl.add(comresult);
		dojpl.add(result);
		add(dojpl,BorderLayout.CENTER);
		add(upjpl,BorderLayout.NORTH);
		setSize(600,600);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	String	pcbang=e.getActionCommand();
		switch(pcbang) {
		case "가위" : result = new JLabel(jlb[0]); break;
		case "바위" : result = new JLabel(jlb[1]); break;
		case "보" : result = new JLabel(jlb[2]); break;
		
		}
	}    
	
	
	public static void main(String[] args) {
		new Mookji();

	}

}
