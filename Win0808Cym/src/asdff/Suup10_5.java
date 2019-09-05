package asdff;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Suup10_5 extends JFrame {

	public Suup10_5()  {
		super();
		Container container = getContentPane();
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("action");
		MYactionlistener listener = new MYactionlistener();
		btn.addActionListener(listener);
		
		add(btn);
		
		setSize(300,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Suup10_5();

	}

}

class MYactionlistener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
	
	
	if(b.getText().equals("action"))
		b.setText("¾×¼ð");
	else
		b.setText("ACTION");
	
	}
}

