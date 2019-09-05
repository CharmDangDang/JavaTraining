package asdff;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TimeTravel extends JFrame {
		int startnum = 0;
		JLabel jlb;
		TimerThread TT;
		boolean akarm = true;
	public TimeTravel()  {
		super();
		Container ct = getContentPane();
		jlb = new JLabel("0");
		jlb.setHorizontalAlignment(SwingConstants.CENTER);
		jlb.setBounds(130, 96, 240, 266);
		JPanel jpl = new JPanel();
		jlb.setToolTipText("Click this !!");
		jlb.setFont(new Font("metal",Font.BOLD,30));
		Mymouseadapter mydap = new Mymouseadapter();
		jlb.addMouseListener(mydap);
		jpl.setLayout(null);
		jpl.add(jlb);
		
		
		
		
		
		getContentPane().add(jpl);
		
		JLabel label = new JLabel("0을 누르시면 시작합니다.");
		label.setFont(new Font("굴림", Font.BOLD, 20));
		label.setBounds(133, 10, 237, 27);
		jpl.add(label);
		
		JButton button = new JButton("종료 버튼");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
					
		});
		button.setBounds(209, 416, 97, 23);
		jpl.add(button);
		setSize(500,500);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jlb.setFocusable(true);
		
	}
	

	class TimerThread extends Thread {

		public void run() {
			
			while(akarm) {
				jlb.setText(Integer.toString(startnum));
				startnum++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
			}
		
		}
		
		
	}
	
	class Mymouseadapter extends MouseAdapter {
	
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mousePressed(e);
			TT = new TimerThread();
				TT.start();
		}
	};
	public static void main(String[] args) {
		new TimeTravel();
			
	}
}
