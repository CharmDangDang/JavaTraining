package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dkuu extends JFrame {
	JLabel cela;
	int i;

	public Dkuu() {

		Container cp = getContentPane();	
		SouthPang jp1 = new SouthPang();
		cela = new JLabel("안녕하세요", JLabel.CENTER);
		/*
		 * cela.addMouseWheelListener(new MouseWheelListener() {
		 * 
		 * @Override public void mouseWheelMoved(MouseWheelEvent e) {
		 * if(e.getWheelRotation()<0) { FOnt font=cela.getFont(); int size=font.get }
		 * 
		 * } })
		 */
//		jp.add(jl);
	    cp.add(cela, BorderLayout.CENTER);
	    cp.add(jp1, BorderLayout.SOUTH);
//
//		f = new Font("fff", Font.PLAIN, 20);
		
		
		setSize(500, 500);
		setVisible(true);
	}

	class SouthPang extends JPanel {

		public SouthPang() {

			JButton jb = new JButton("커져라");
			jb.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					i += 5;

				}
			});
			JButton jb1 = new JButton("작아져라");
			jb1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					i -= 5;

				}
			});
			add(jb);
			add(jb1);
			setBackground(new Color(255, 160, 160));

		}

	}

	public static void main(String[] args) {
		new Dkuu();
	}

}
