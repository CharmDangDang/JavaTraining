package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calcc extends JFrame {
	

	public Calcc()  {
		Container cp=getContentPane();
		GridLayout gd = new GridLayout(4,4,10,5);
		
		JPanel jpTop = new JPanel();
		jpTop.setBackground(Color.GRAY);
		
		JPanel jpMid = new JPanel();
		jpMid.setBackground(Color.WHITE);
		jpMid.setLayout(gd);
		
		JPanel jpBot = new JPanel();
		jpBot.setBackground(Color.YELLOW);
		
		JTextField jtfTop = new JTextField(16);
		
		JTextField jtfBot = new JTextField(16);
		
		String jbSuu[] = {"0","1","2","3","4","5","6","7","8","9","CE","계산","+","-","X","/"};
		JButton jbt[] = new JButton[16];
		
		
		JLabel jbTop = new JLabel("수식 입력",JLabel.RIGHT);
		jbTop.setFont(new Font("jbTop", Font.PLAIN,30));
		JLabel jbBot = new JLabel("계산 결과",JLabel.CENTER);
		jbBot.setFont(new Font("jbBot",Font.PLAIN,30));
		
		
		for (int i = 0; i < jbSuu.length; i++) { 

            jpMid.add(jbt[i] = new JButton(jbSuu[i])); 
            jbt[i].setFont(new Font("jbt", Font.PLAIN,30));
		}
		for (int a =12; a< 16; a++) {
			jbt[a].setBackground(Color.CYAN);
		}
		
		cp.add(jpTop,BorderLayout.NORTH);
		jpTop.add(jbTop);
		jpTop.add(jtfTop);
		cp.add(jpMid,BorderLayout.CENTER);
		 
		
			
			
		cp.add(jpBot,BorderLayout.SOUTH);
		jpBot.add(jbBot);
		jpBot.add(jtfBot);
		
		setSize(560,560);
		setVisible(true);
	}

	public static void main(String[] args) {
			new Calcc();
	}

}
