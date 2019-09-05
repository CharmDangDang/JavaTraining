package asdff;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Suup10_1 extends JFrame {

	public Suup10_1()  {
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Mouse Event 테스트 버튼");
		btn.setBackground(Color.YELLOW);
		MYmouselistener listener = new MYmouselistener(); 
		btn.addMouseListener(listener);
		
		add(btn);
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Suup10_1();

	}

}

class MYmouselistener implements MouseListener {



	@Override
	public void mouseEntered(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.RED);	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.YELLOW);	
	
		
	}
	
		
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}