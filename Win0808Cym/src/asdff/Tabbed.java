package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Tabbed extends JFrame {

	Container ct = getContentPane();
	public Tabbed()  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����� �ܼ�����
		JTabbedPane pane = createTabbedPane();			// ���� ����
		ct.add(pane,BorderLayout.CENTER);						//���� ����	
		
		setSize(1250,1250);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	public JTabbedPane createTabbedPane() {
	JTabbedPane pane = new JTabbedPane();
	pane.addTab("1�� �ù�", new JLabel(new ImageIcon("images/siba1.jpg")));
	pane.addTab("2�� �ù�", new JLabel(new ImageIcon("images/siba2.jpg")));
	pane.addTab("3���� ����", new MyPanel());
	return pane;
}
	class MyPanel extends JPanel {
		MyPanel() {
			this.setBackground(Color.CYAN);
		}
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			g.setColor(new Color(139,0,255));
			g.fillRect(10, 10, 100, 100);
			g.setColor(new Color(50,220,135));
			g.fillOval(110, 110,100, 100);
			g.setColor(Color.BLACK);
			g.drawString("�ùٰ� �Ϳ���?", 50, 50);
		}
	}
	public static void main(String[] args) {
		new Tabbed();

	}

}
