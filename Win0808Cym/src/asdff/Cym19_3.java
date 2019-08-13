package asdff;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Cym19_3 extends JFrame {

	public Cym19_3() throws HeadlessException {
		super();
		ImageIcon korea=new ImageIcon("C:\\Users\\Administrator\\Downloads\\1u.gif");
		ImageIcon usa=new ImageIcon("C:\\Users\\Administrator\\Downloads\\2u.gif");
		ImageIcon japan=new ImageIcon("C:\\Users\\Administrator\\Downloads\\3u.gif");
		JButton nat = new JButton(korea);
		nat.setSize(800,800);
		nat.setPressedIcon(usa);
		nat.setRolloverIcon(japan);
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(nat);
		setTitle("JButton test1");
		setSize(1000,1000);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Cym19_3();
	}

}
