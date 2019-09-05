package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicSTART extends JFrame {
		int x=10,y=10;
		Random rd;
		boolean j = true ;
		int a[] = new int[3];
	public GraphicSTART() throws HeadlessException {
		super("±×·¡ÇÈ!!!");
		rd= new Random();
		Container container = getContentPane();
		Centerpane cp = new Centerpane();
		container.add(cp,BorderLayout.CENTER );
		
		
			
			
		
		
		setSize(500,500);
		setVisible(true);
		
	}

	class Centerpane extends JPanel{
		public Centerpane() {
			addMouseListener(new MouseAdapter() {
			
				
			
				
				@Override
				public void mousePressed(MouseEvent e) {
					x=e.getX(); y=e.getY();
					repaint();
					
				}
				
				
			});
			
		}

		@Override
		protected void paintComponent(Graphics g) {
			g.setColor(new Color(a[0]=rd.nextInt(255),a[1]=rd.nextInt(255),a[2]=rd.nextInt(255)));
			g.fillOval(x-10,y-10,20,20);
			
		}

		
	}
	
	public static void main(String[] args) {
		 new GraphicSTART();
	}

}
