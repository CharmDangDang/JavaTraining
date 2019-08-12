package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorChooserUI;

public class WinStart2 extends JFrame {	
	
	public WinStart2(){
		Container cp=getContentPane(); //super();
		JLabel lbl=new JLabel("ICE BORN",JLabel.CENTER);
		lbl.setBackground(Color.cyan); lbl.setOpaque(true);
		
		JButton btn1=new JButton("확인");
		JButton btn2=new JButton("취소");
		
		JPanel panel=new JPanel();
		panel.add(btn1);
		panel.add(btn2);
		panel.setBackground(Color.cyan);
		
		cp.add(lbl,BorderLayout.NORTH);
		cp.add(panel,BorderLayout.SOUTH);
		
		setSize(300,400);
		setVisible(true);
		
		
	}
public static void main(String[] args) {
		new WinStart2();
	}

}
