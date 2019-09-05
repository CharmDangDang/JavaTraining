package asdff;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class Comewithme extends JFrame  {
		JLabel mychar;
		JLabel enemy;
		final int enemyMove = 5;
		int humanMove = 10;
		GamePanel gpan =new  GamePanel();
	public Comewithme()  {
		super();
		Container ct = getContentPane();
		
		mychar = new JLabel("HERO\u25CF");
		mychar.setForeground(Color.BLACK);
		//mychar.setBounds(114, 308, 51, 28);
		enemy = new JLabel("ENEMY\u25CF");
		enemy.setForeground(Color.RED);
		enemy.setBackground(Color.RED);
		//enemy.setBounds(308, 140, 65, 28);
		
		
		//setResizable(null);
		ct.add(gpan);
		
		
		
		setSize(500,500);
		setVisible(true);
		
	}	
	
	class GamePanel extends JPanel {
		public void movemove() {
			setLayout(null);
			mychar.setBounds(0, 0, 20, 10);
			enemy.setBounds(200, 200, 20, 10);
			setFocusable(true);
			//enemy.getParent().repaint();
			repaint();
			add(mychar);
			add(enemy);
			MonsterThread mtmove = new MonsterThread();
			mtmove.start();
			addKeyListener(new KeyAdapter() {
				

				@Override
				public void keyPressed(KeyEvent e) {
						int Keycode = e.getKeyCode();
						if(Integer.parseInt("q")==Keycode)
							System.exit(0);
						
						else {
							switch(Keycode) {
								case KeyEvent.VK_UP: mychar.setLocation(mychar.getX(), mychar.getY()-humanMove); break;
								case KeyEvent.VK_DOWN: mychar.setLocation(mychar.getX(), mychar.getY()+humanMove); break;
								case KeyEvent.VK_LEFT: mychar.setLocation(mychar.getX()-humanMove, mychar.getY()); break;
								case KeyEvent.VK_RIGHT: mychar.setLocation(mychar.getX()+humanMove, mychar.getY()); break;
									
							}	
						}
						
				}
		});
	  }
	}
		public class MonsterThread extends Thread {

			@Override
			public void run() {
				while(true) {
				if (mychar.getY() < enemy.getY())
					enemy.setLocation(enemy.getX(), enemy.getY()-enemyMove);
				else if(mychar.getY() > enemy.getY())
					enemy.setLocation(enemy.getX(), enemy.getY()+enemyMove);
				else if (mychar.getX() < enemy.getX())
					enemy.setLocation(enemy.getX()-enemyMove, enemy.getY());
				else if(mychar.getX() > enemy.getX())
					enemy.setLocation(enemy.getX()+enemyMove, enemy.getY());
				
			}
			
		}
		}
//		class enemymoving {
//			public move() {
//				if 
//			}
//		}

	public static void main(String[] args) {
		new Comewithme();

	}

}
