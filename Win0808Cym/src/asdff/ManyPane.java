package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ManyPane extends JFrame {
	
public ManyPane() throws HeadlessException {
		super("�������� �г��� ���� ������");
		Container cp =getContentPane();
		Random rd=new Random();
		JPanel jpTop=new JPanel(); jpTop.setBackground(Color.GRAY);
		JPanel jpMid=new JPanel(); jpMid.setBackground(Color.WHITE);
		JPanel jpBot=new JPanel(); jpBot.setBackground(Color.YELLOW);
		
		
		String[] jbt = {"����","�ݱ�","������"};
		JButton[] jbtRL = new JButton[3];
		JButton jbtBot = new JButton("Word Input");
		
		for(int i = 0 ; i < jbt.length ; i++) {
			jpTop.add(jbtRL[i] = new JButton(jbt[i]));		
		}
		
		
		
		JTextField Ekr = new JTextField(16);
		
		
		

		jpBot.add(jbtBot);
		jpBot.add(Ekr);
		cp.add(jpTop,BorderLayout.NORTH);
		cp.add(jpMid,BorderLayout.CENTER);	
		cp.add(jpBot,BorderLayout.SOUTH);
		setSize(560,560);
		setVisible(true);
		
}
	public static void main(String[] args) {
		 new ManyPane();

	}

	

}
