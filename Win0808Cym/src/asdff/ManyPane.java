package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Scrollable;

public class ManyPane extends JFrame {
	
public ManyPane() throws HeadlessException {
		super("�������� �г��� ���� ������");
		Container cp =getContentPane();
		Random rd=new Random();
		JPanel jpTop=new JPanel(); jpTop.setBackground(Color.GRAY);
		JPanel jpMid=new JPanel(); jpMid.setBackground(Color.WHITE);
		JPanel jpBot=new JPanel(); jpBot.setBackground(Color.YELLOW);
		System.out.println(fsafsafds);
		
		
		String[] jbt = {"����","�ݱ�","������"};
		JButton[] jbtRL = new JButton[3];
		JButton jbtBot = new JButton("Word Input");
		
		for(int i = 0 ; i < jbt.length ; i++) {
			jpTop.add(jbtRL[i] = new JButton(jbt[i]));		
		}
		
		
		
		JTextField xnr = new JTextField(16);
		
		jbtRL[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
			});

			
		

		jpBot.add(jbtBot);
		jpBot.add(xnr);
		cp.add(jpTop,BorderLayout.NORTH);
		cp.add(jpMid,BorderLayout.CENTER);	
		cp.add(jpBot,BorderLayout.SOUTH);
		setSize(560,560);
		setVisible(true);
		Cp.add(top,borerLayout.) �˙��մϴ�
		������ �� �������� �������Ⱑ ��� �����ϳ׿�
		
		
}
	public static void main(String[] args) {
		 new ManyPane();

	}

	

}
