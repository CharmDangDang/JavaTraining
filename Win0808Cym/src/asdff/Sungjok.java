package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sungjok extends JFrame {

	public Sungjok() {
		setTitle("����ó��");
		Container cp = getContentPane();
		
		Cpan ccp=new Cpan();
		Span ssp=new Span();
		
		cp.add(ccp,BorderLayout.CENTER);
		cp.add(ssp,BorderLayout.SOUTH);
		setSize(220,150);
		setVisible(true);
	}
		
	}
	class Cpan extends JPanel{
		Cpan(){
			setBackground(Color.CYAN);
			setLayout(new GridLayout(3,2,15,5));
			JLabel jl1=new JLabel("���� :",JLabel.CENTER);
			jf1=new JTextField(6);
			JLabel jl2=new JLabel("���� :",JLabel.CENTER);
			jf2=new JTextField(6);
			JLabel jl3=new JLabel("���� :",JLabel.CENTER);
			jf3=new JTextField(6);
			add(jl1);add(jf1);
			add(jl2);add(jf2);
			add(jl3);add(jf3);
			
		
		
		}
		JTextField jf1,jf2,jf3;
		JLabel result;
		
	
	class Span extends JPanel{
		Span(){
			setBackground(Color.GRAY);
			JButton jb1=new JButton("���");
			jb1.addActionListener(new Mylistener());
			result=new JLabel("��� :");
			JButton jb2=new JButton("�����");
			jb1.addActionListener(new Mylistener());
			add(jb1); add(result); add(jb2);
		}
		
	
	class Mylistener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		String comm=e.getActionCommand();
		if(comm.equalsIgnoreCase("���")) {
			try {
		
			int kor = Integer.parseInt(jf1.getText());
			int math = Integer.parseInt(jf2.getText());
			int eng = Integer.parseInt(jf3.getText());
			result.setText(""+(kor+math+eng));
		}catch(NumberFormatException ee) {
			jf1.setText("");
			jf2.setText("");
			jf3.setText("");
		}
		}else { 
			jf1.setText("");
			jf2.setText("");
			jf3.setText("");
			result.setText("��� :");
			
		}
				
			
		}
	}
	
	public static void main(String[] args) {
	new Sungjok();	
	
	}

	}}
	

