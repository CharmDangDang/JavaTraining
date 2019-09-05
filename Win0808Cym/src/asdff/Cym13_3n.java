package asdff;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
class flickeringlabel extends JLabel implements Runnable{
	public flickeringlabel(String text) {
		super(text);
		setOpaque(true);
		
		Thread th = new Thread(this);
		th.start();
	}
	public void run() {
		int n=0;
		while ( true) {
			if(n == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			
			
			if(n==0) n=1;
			else n= 0;
			
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
public class Cym13_3n extends JFrame {
	
	public Cym13_3n() {
		super();
		setTitle("flickeringlabel test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		flickeringlabel flabel = new flickeringlabel("±ôºý");
		JLabel label = new JLabel("¾È±ôºý¿©");
		flickeringlabel flabel2 = new flickeringlabel("¿©±âµµ ±ôºý¿©");
		
		c.add(flabel);
		c.add(label);
		c.add(flabel2);
		
		
		setSize(300,150);
		setVisible(true);
	
	}

	public static void main(String arg[]) {
		new Cym13_3n();
	}

}
