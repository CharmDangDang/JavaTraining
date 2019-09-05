package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class KWKWMDsk extends JFrame implements ActionListener {
	Centerpane cp;
	JLabel msg;
	String city[] = { "인천", "서울" };
	String incheon[] = { "남동구", "부평구", "서구", "연수구" };
	String seoul[] = { "강북구", "강서구", "강남구", "강동구" };

	public KWKWMDsk() {
		super("collection");
		Container container = getContentPane();
		cp = new Centerpane();
		msg = new JLabel("You choose it");
		container.add(msg, BorderLayout.SOUTH);
		container.add(cp, BorderLayout.CENTER );
		setSize(200, 200);
		setVisible(true);
	}

	JList<String> gulist;

	class Centerpane extends JPanel {
	
	public Centerpane() {
			super();
			setBackground(Color.CYAN);
			JComboBox<String> citybox = new JComboBox<String>(city);
			citybox.addActionListener(KWKWMDsk.this);
			gulist= new JList<String>(incheon);
			add(citybox); add(gulist);
			gulist.addListSelectionListener(new ListSelectionListener() {
				
				@Override
				public void valueChanged(ListSelectionEvent e) {
					JList<String> list=(JList<String>)e.getSource();
					
					msg.setText("고르셧네"+list.getSelectedValue());
					
					
				}
			});
			
		}

	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox<String> city = (JComboBox<String>)e.getSource();
		int index =city.getSelectedIndex();
		switch(index) {
		case 0: gulist.removeAll();
		gulist.setListData(incheon); break;
		case 1: gulist.removeAll();
		gulist.setListData(seoul); break;
		
			
		}
	}

	public static void main(String[] args) {
		new KWKWMDsk();

	}

}
