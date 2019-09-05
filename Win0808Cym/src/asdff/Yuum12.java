package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Yuum12 extends JFrame {
	public toppan topp;
	public Yuum12(){
		super();
	Container container = getContentPane();
	setLayout(null);
	//패널 생성과 정리
	topp = new toppan();
	//topp.setLayout(null);
//	JPanel bopp = new JPanel();
//	bopp.setBounds(0, 700, 400, 100);
//	bopp.setBackground(Color.LIGHT_GRAY);
//	bopp.setLayout(new FlowLayout());
//	//centp cenp = new centp();
//	cenp.setBounds(0, 100, 400, 600);
//	cenp.setBackground(Color.DARK_GRAY);
	//텍스트 필드 생성과 정리
	
	//라벨 생성과 정리
	JLabel fruit[]=new JLabel[4];
	fruit[0].setBounds(0, 20, 50, 80);
	topp.add(fruit[0]);
//	fruit[0].setText("체리 :");
//	fruit[1].setText("복숭아 :");
//	fruit[2].setText("배 :");
//	fruit[3].setText("바나나 :");
	//텍필과 라벨 붙이기
//	int i , j , x= 0 ,y;
//	for(j = 0 ; j < 4; j++ ,x+=50) {
//		fruit[j].setBounds(x, 20, 50, 80);
//		topp.add(fruit[j]);}
//	for(i= 0 ; i == j; i++) {
//		jtf[i].setSize(30,10);
//		topp.add(jtf[i]);
		
	//패널 붙이기
	add(topp);
//	add(bopp);
//	add(cenp);
	//사이즈와 비져블
	setSize(400,800);	
	setVisible(true);
	
	
	}
class toppan extends JPanel {
	

	public toppan () {
		int i , j ;
	setLayout(new FlowLayout());
	setBackground(Color.LIGHT_GRAY);
	setBounds(0, 0, 400, 100);
	JTextField jtf[] = new JTextField[4];
	JLabel fruit[]=new JLabel[4];
	for(j=0;j<fruit.length;j++) {
		fruit[j] = new JLabel(" 라라 ");
		topp.add(fruit[j]);
	
	
	for(i=0;i==j;i++) 
	jtf[i] = new JTextField("0", 5);
	  topp.add(jtf[i]);
	
	}
}

}
class centp extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	}
}
	
	
	public static void main(String[] args) {
		new Yuum12();

	}

}
