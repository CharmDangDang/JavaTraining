package asdff;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyTUU extends JFrame {

	public KeyTUU() {
		super();
		JPanel contentpane = new JPanel();
		JLabel la = new JLabel();
		
		keycodex(){
			setTitle("Ű�ڵ� ���� : f1Ű �ʷϻ� , %Ű�� �����");
			
			setContentPane(contentpane);
			contentpane.addKeyListener(new MYkeylistener());
			contentpane.add(la);
			setSize(300,150);
			setVisible(true);
			contentpane.requestFocus();
		}
	
	class MYkeylistener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode())+"Ű�� �Է� �Ǿ���");
			
			if(e.getKeyChar()=='%')
				contentpane.setBackground(Color.YELLOW);
			else if(e.getKeyCode()==KeyEvent.VK_F1)
				contentpane.setBackground(Color.GREEN);
			
		}
			}
	}
	


	public static void main(String[] args) {
		new KeyTUU();

	}

}
