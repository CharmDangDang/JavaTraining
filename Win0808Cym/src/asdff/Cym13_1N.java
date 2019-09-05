package asdff;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Timer extends Thread {  //�����带 ��ӹ޾Ƽ� 
	JLabel timerlabel;
	
	public Timer(JLabel timerlabel) {
		this.timerlabel = timerlabel;
	}
	
	public void run() {   // run�� �������̵� �� 
		int n=0 ;
		while(true) {
			timerlabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}



public class Cym13_1N extends JFrame{
	

	
	public Cym13_1N() {
		super();
		setTitle("Thereadtimer ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
	JLabel timerlabel = new JLabel();
	timerlabel.setFont(new Font("Gothic",Font.ITALIC,80 ));
	
	Timer th = new Timer(timerlabel); //Ÿ�̸��� �ν��Ͻ� ���� 
	c.add(timerlabel);
	
	setSize(300,150);
	setVisible(true);
	
	th.start();  // Ÿ�̸ӿ� �ִ� start�Լ��� ����
	
	}

	public static void main(String[] arg) {
		new Cym13_1N();
	}

}
