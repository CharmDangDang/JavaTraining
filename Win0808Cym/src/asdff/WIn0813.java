package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WIn0813 extends JFrame {

	JPanel cenp;

	public WIn0813() throws HeadlessException {
		super();
		Container cp = getContentPane();

		cenp = new JPanel();
		SouthPane sp = new SouthPane();
		cp.add(cenp, BorderLayout.CENTER);
		cp.add(sp, BorderLayout.SOUTH);

		setSize(300, 300);
		setVisible(true);
	}

	class SouthPane extends JPanel {

		/*
		 * @Override public void actionPerformed(ActionEvent e) { String
		 * comm=e.getActionCommand(); switch(comm){
		 * 
		 * case "RED" : cenp.setBackground(Color.RED); break; case "GREEN"
		 * :cenp.setBackground(Color.GREEN); break; case "BLUE" :
		 * cenp.setBackground(Color.BLUE); break;
		 */
		// }

		public SouthPane() {

			MyListener listener = new MyListener(cenp);
			JButton red = new JButton("RED");
			red.setForeground(Color.RED);
			red.addActionListener(listener);
			JButton gre = new JButton("GREEN");
			gre.setForeground(Color.GREEN);
			gre.addActionListener(listener);
			JButton blu = new JButton("BLUE");
			blu.setForeground(Color.BLUE);
			blu.addActionListener(listener);
			add(red);
			add(gre);
			add(blu);
			setBackground(new Color(255, 160, 160));
		}

	}

	public static void main(String[] args) {
		new WIn0813();
	}
}

class MyListener implements ActionListener {
	JPanel pane;

	public MyListener(JPanel pane) { // 생성자로 날아온 변수 pane을 이 클래스에서 다 쓰고싶으면 클래스 바로밑에
		this.pane = pane; // 변수로 지정해주고 this.으로 이식한다.

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed");
		String comm = e.getActionCommand();
		switch (comm) {

		case "RED":
			pane.setBackground(Color.RED);
			break;
		case "GREEN":
			pane.setBackground(Color.GREEN);
			break;
		case "BLUE":
			pane.setBackground(Color.BLUE);
			break;
		}

	}
}