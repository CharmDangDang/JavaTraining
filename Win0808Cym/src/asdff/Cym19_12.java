package asdff;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public  class Cym19_12 extends JFrame implements ActionListener {
	JLabel result;
	ImageIcon i1,i2;
		public Cym19_12()  {
		super("����� ��� ���� �� ���ֳ�");
		
		result = new JLabel();
		i1 = new ImageIcon("C:\\Users\\Administrator\\Downloads\\1.jpg");
		i2 = new ImageIcon("C:\\Users\\Administrator\\Downloads\\2.jpg");
		JButton apple = new JButton("���");
		JButton pear = new JButton("��");
		Container  ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(apple);
		ct.add(pear);
		ct.add(result);
		apple.addActionListener(this);
		pear.addActionListener(this);
//		setTitle("jlabel test");
		setSize(400,350);
		setVisible(true);		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="���") {
			result.setText("���ִ� ����׿�");
			result.setIcon(i1);
			
		}else{
			result.setText("���ִ� ��׿�");
			result.setIcon(i2);
		}
	}
	
	
	public static void main(String[] args) {
		new Cym19_12();

	}

}
