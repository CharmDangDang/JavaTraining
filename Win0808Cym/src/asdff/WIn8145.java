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

public class WIn8145 extends JFrame {

	JPanel cenp;

	public WIn8145() {
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

			
			JButton red = new JButton("RED");
			red.setForeground(Color.RED);
			red.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					cenp.setBackground(Color.red);// TODO Auto-generated method stub
					
				}
			});
			JButton gre = new JButton("GREEN");
			gre.setForeground(Color.GREEN);
			gre.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					cenp.setBackground(Color.green);
				}
			});
			JButton blu = new JButton("BLUE");
			blu.setForeground(Color.BLUE);
			blu.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					cenp.setBackground(Color.blue);
				}
			});
			add(red);
			add(gre);
			add(blu);
			setBackground(new Color(255, 160, 160));
		}

	}

	public static void main(String[] args) {
		new WIn8145();
	


/*
 * class MyListener implements ActionListener { JPanel pane;
 * 
 * public MyListener(JPanel pane) { // �����ڷ� ���ƿ� ���� pane�� �� Ŭ�������� �� ��������� Ŭ����
 * �ٷιؿ� this.pane = pane; // ������ �������ְ� this.���� �̽��Ѵ�.
 * 
 * }
 * 
 * @Override public void actionPerformed(ActionEvent e) {
 * System.out.println("actionPerformed"); String comm = e.getActionCommand();
 * switch (comm) {
 * 
 * case "RED": pane.setBackground(Color.RED); break; case "GREEN":
 * pane.setBackground(Color.GREEN); break; case "BLUE":
 * pane.setBackground(Color.BLUE); break;
 */
		

	}
}