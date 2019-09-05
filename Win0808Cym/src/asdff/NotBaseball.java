package asdff;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NotBaseball extends JFrame {

	
	Container ct = getContentPane();
	int pcnum[];
	JPanel jpl[];
	Random rd ;
	public NotBaseball()  {
		Scanner sc = new Scanner(System.in);
		rd = new Random();
		
		setLayout(new FlowLayout());
		int i ;
		for (i = 0 ; i<4; i++)
			pcnum[i] = rd.nextInt()/10;
			ct.add(jpl[i]);
			jpl[i].add(new JLabel(Integer.toString(pcnum[i])));
			
			
	}

	

	public static void main(String[] args) {
		new NotBaseball();

	}

}
