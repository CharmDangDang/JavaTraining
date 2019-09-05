package asdff;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class RandomThread extends Thread{
	Container contentPane;
	boolean flag=false;
	int jami;
	RandomThread th;
	JButton findo = new JButton("lava");
	Random rd = new Random();
	public RandomThread(Container contentPane) {
		
		this.contentPane = contentPane;
	}
	
	void finish() {
		flag = true;
	}
	
	public void run() {
		
		JLabel label, btn;
	
		while(true) {
			jami=rd.nextInt()%10;
			if (jami!=1) {
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			label = new JLabel("Java");
			label.setSize(80,30);
			label.setLocation(x,y);
			contentPane.add(label);
			contentPane.repaint();
			try {
				Thread.sleep(100);
				
				if(flag==true) {
					contentPane.removeAll();
					label = new JLabel("finish");
					label.setSize(80,30);
					label.setLocation(100,100);
					label.setForeground(Color.RED);
					label.setFont(new Font("galic",Font.ITALIC,80));
					contentPane.repaint();
					return;
					
				}
			}
			catch(InterruptedException e ) { return; }
			}
			else {
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			btn = new JLabel("lava");
			btn.setSize(80,30);
			btn.setLocation(x,y);
			contentPane.add(btn);
			contentPane.repaint();
			btn.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					Cym13_5n.th.finish();
				}	
			 });}
			}
		}
			
		
	}
 

public class Cym13_5n extends JFrame {
	static RandomThread th;
	
	public Cym13_5n(){
		super();
		setTitle("thread finish ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		
		setSize(300,200);
		setVisible(true);
		
		th= new RandomThread(c);
		th.start();
	}

	public static void main(String[] args) {
		new Cym13_5n();

	}

}
