package asdff;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WinStart1 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Window");
		Container cp = frame.getContentPane();//�������� �����̳��� �Һ���
		cp.setLayout(new FlowLayout());
		Random rd=new Random();
		int lookit;
		lookit=rd.nextInt(499);
		for(int i = 1; i<500; i++) {
			JButton btn = new JButton("Ȯ��");
			cp.add(btn,BorderLayout.SOUTH);
		if(i%2==0)
				btn.setBackground(Color.WHITE);
				
				
		else if (i%5==0)
			btn.setBackground(Color.pink);
		   
		else 
			btn.setBackground(Color.black);
			
		if(i==lookit)
			btn.setBackground(Color.blue);
		    btn.setText("����");
		    
		}
		
		frame.setSize(1200,900);
		frame.setVisible(true);
		
		
	}

}
