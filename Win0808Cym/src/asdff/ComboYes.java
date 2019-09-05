package asdff;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ComboYes extends JFrame implements ActionListener {

	public ComboYes()  {
		super();
		//扁夯 鞘荐 夸家 备开 
		Container ct =getContentPane();
		String city[] = {"辑匡","牢玫","措备","何魂","力林"};
		String seogoo[] = {"公郊备","公郊备","碍巢备","碍合备","碍辑备"};
		String ingoo[] = {"楷荐备","巢悼备","固眠圈备","辑备","合备"};
		String daegoo[] = {"公郊备1","公郊备2","公郊备3","公郊备4","公郊备5"};
		String boogoo[] = {"公郊备6","公郊备7","公郊备8","公郊备9","公郊备10"};
		String jejugoo[] = {"公郊备11","公郊备12","公郊备13","公郊备14","公郊备15"};
		
		//力捞扼骇 备开
		JLabel explain = new JLabel("     ");
		explain.setBounds(15, 245, 250, 100);
		explain.setBackground(Color.PINK);
		explain.setFont(new Font("tjfaud",Font.BOLD,30));
		explain.setOpaque(true);
		//力捞府胶飘 备开
		JList dongnae = new JList();
		dongnae.setFont(new Font("dongnae",Font.PLAIN ,18));
		dongnae.setBounds(150, 10, 110, 200);
		dongnae.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				JList<String> selected=(JList<String>)e.getSource();
						
		
				explain.setText("俊扼 葛福摆促た"+selected.getSelectedValue());
			
				
			}
		});
		
		//霓焊冠胶 备开
		JComboBox cities = new JComboBox(city);
		cities.setSize(200,200);
		cities.setFont(new Font("city",Font.ITALIC,30));
		cities.setBounds(10, 10, 100, 50);
		cities.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cities.getSelectedIndex();
				
				switch(index)
				{
				case 0 : dongnae.setListData(seogoo); break;
				case 1 : dongnae.setListData(ingoo); break;
				case 2 : dongnae.setListData(daegoo); break;
				case 3 : dongnae.setListData(boogoo); break;
				case 4 : dongnae.setListData(jejugoo); break;
				}
				
			}
		});
		//嘿捞扁 备开
		ct.setLayout(null);
		ct.add(dongnae);
		ct.add(cities);
		setSize(300,400);
		setVisible(true);
		ct.add(explain);
	}

	public static void main(String[] args) {
		new ComboYes();

	}

}
