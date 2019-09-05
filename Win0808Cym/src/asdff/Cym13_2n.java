package asdff;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable {
	JLabel sibal;
	
	public TimerRunnable(JLabel timerlabel) {
		this.sibal = timerlabel;
		
	}
	
	public void run() {
		int n = 0;
		while(true) {
			sibal.setText(Integer.toString(n));
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


public class Cym13_2n extends JFrame {

	public Cym13_2n() {
		super();
		setTitle("runnabletimer ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel timerlabel = new JLabel();
		timerlabel.setFont(new Font("Gothic",Font.ITALIC,80 ));
		TimerRunnable runnable = new TimerRunnable(timerlabel);
		
		Thread th = new Thread(runnable);
		
		c.add(timerlabel);
		
		setSize(300,150);
		setVisible(true);
		
		th.start();
	}

	public static void main(String[] args) {
		new Cym13_2n();

	}

}
