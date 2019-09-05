package asdff;

import java.awt.BorderLayout;
import java.awt.event.WindowListener;
import java.io.Serializable;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class HEll extends JFrame implements Serializable{
	

	public HEll()  {
		super("Hello Window!!!!!!");
		add(new JLabel(),BorderLayout.CENTER);
		addWindowListener(new MyListener());
		
	}

	class MyListener implements WindowAdapter{
		
		@override
		public void window
	}


}
