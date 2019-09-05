package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Teachme extends JFrame implements ActionListener {
	

	ImageIcon[] img = {new ImageIcon("C:\\Users\\Administrator\\source\\repos\\JavaTraining\\Win0808Cym\\src\\images\\gawi.jpg"),
			new ImageIcon("C:\\Users\\Administrator\\source\\repos\\JavaTraining\\Win0808Cym\\src\\images\\bawi.jpg"),
			new ImageIcon("C:\\Users\\Administrator\\source\\repos\\JavaTraining\\Win0808Cym\\src\\images\\bo.jpg")
	};
	JButton gawi,bawi,bo;
	JLabel me,comp,result;
	cenpan1 cp1; cenpan2 cp2; cenpan3 cp3;
	public Teachme() {
		super("SRP");
		Random rd = new Random();
		Container  ct = getContentPane();
		
		northpan np = new northpan();
		
		cp1 = new cenpan1();
		cp1.setBackground(Color.YELLOW);
		cp2 = new cenpan2();
		cp2.setBackground(Color.BLUE);
		cp3 = new cenpan3();
		cp3.setBackground(Color.GREEN);
									
		
		ct.setLayout(new FlowLayout());
		ct.add(cp1); ct.add(cp2); ct.add(cp3);
		ct.add(np,BorderLayout.NORTH);
		setSize(400,300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn =(JButton)e.getSource();
		if (btn == gawi)
			cp1.setIcon(img[0]);
		else if ( btn == bawi)
			me.setIcon(img[1]);
		else 
			me.setIcon(img[2]);
		
	}
	
	class northpan extends JPanel {
		
		public northpan() {
			super();
			setBackground(new Color(180,180,180));
			gawi=new JButton(img[0]);
			gawi.addActionListener(Teachme.this);
			bawi=new JButton(img[1]);
			bawi.addActionListener(Teachme.this);
			bo=new JButton(img[2]);
			bo.addActionListener(Teachme.this);
			add(gawi);
			add(bawi);
			add(bo);
			
		}
	
	}
	
	
	class cenpan1 extends JPanel  {
		public cenpan1() {
			super();
			add(me);
			me=new JLabel("ME");
			
		void gawi {
			me.add(img[0]);
			}
	}

		public void setIcon(ImageIcon imageIcon) {
			cp1.setIcon(img[0]);
			
		}
	
	}
	class cenpan2 extends JPanel  {
		public cenpan2() {
			super();
			comp=new JLabel("COM");
			add(comp);

	}
	}
	class cenpan3 extends JPanel  {
		public cenpan3() {
			super();				
			result=new JLabel("REUSLT");
			add(result);
	}
	}
	public static void main(String[] args) {
		new Teachme();

	}

}
