package asdff;

import java.awt.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



class Cymgu_1 extends JFrame implements ActionListener  {
		
		private JLabel result = new JLabel();
		public ImageIcon i1,i2;	
		public Cymgu_1() {
			i1 = new ImageIcon("C:\\Users\\Administrator\\Downloads\\1.jpg");
			i2 = new ImageIcon("C:\\Users\\Administrator\\Downloads\\2.jpg");
			JButton apple = new JButton("사과");
			JButton pear = new JButton("배");
			Container  ct = getContentPane();
			ct.setLayout(new FlowLayout());
			ct.add(apple);
			ct.add(pear);
			ct.add(result);
			apple.addActionListener(this);
			pear.addActionListener(this);
			setTitle("jlabel test");
			setSize(400,350);
			setVisible(true);
		}
		public void actionPerformed(ActionEvent ae) {
			if(ae.getActionCommand()=="사과") {
				result.setText("맛있는 사과네용");
				result.setIcon(i1);
				
			}else{
				result.setText("맛있는 배네용");
				result.setIcon(i2);
			}
		}
		
	}
public class Cym19_1 {
	public static void main(String[] args) {
		new Cymgu_1();

	}

}
