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
			setTitle("키코드 해제 : f1키 초록색 , %키는 노란색");
			
			setContentPane(contentpane);
			contentpane.addKeyListener(new MYkeylistener());
			contentpane.add(la);
			setSize(300,150);
			setVisible(true);
			contentpane.requestFocus();
		}
	
	class MYkeylistener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode())+"키가 입력 되었슴");
			
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
