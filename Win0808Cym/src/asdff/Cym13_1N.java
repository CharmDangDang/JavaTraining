package asdff;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Timer extends Thread {  //스레드를 상속받아서 
	JLabel timerlabel;
	
	public Timer(JLabel timerlabel) {
		this.timerlabel = timerlabel;
	}
	
	public void run() {   // run을 오버라이딩 함 
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
		setTitle("Thereadtimer 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
	JLabel timerlabel = new JLabel();
	timerlabel.setFont(new Font("Gothic",Font.ITALIC,80 ));
	
	Timer th = new Timer(timerlabel); //타이머의 인스턴스 생성 
	c.add(timerlabel);
	
	setSize(300,150);
	setVisible(true);
	
	th.start();  // 타이머에 있는 start함수로 실행
	
	}

	public static void main(String[] arg) {
		new Cym13_1N();
	}

}
