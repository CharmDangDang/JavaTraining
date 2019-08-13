package asdff;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Cym19_2 extends JFrame implements ActionListener {
JTextField jtf;
JTextArea jta;	
JLabel jl;
	public Cym19_2() throws HeadlessException {
		super();
		
		Container cp = getContentPane();
		jl = new JLabel("입력하십시오");
		jtf = new JTextField(20);
		jta = new JTextArea(10,20);
		jta.setEditable(false);
		cp.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		p1.add(jtf);
		p1.add(jta);
		cp.add(p1);
		cp.add(jl);
		jtf.addActionListener(this);
		setTitle("JTextField,JTextArea Test1");
		setSize(500,300);
		setVisible(true);
	}
		public static void main(String[] args) {
		new Cym19_2();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(jta.getLineCount() <= jta.getRows()) {
			jta.append(e.getActionCommand()+"\n");
			jtf.setText("");
		}else {
			jl.setText("입력이 종료되었습니다.");
			jtf.setEditable(false);
			
		}
		
	}

}
