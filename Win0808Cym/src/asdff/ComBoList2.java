import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ComBoList2 extends JFrame implements ActionListener{
	String city[]= {"인천","서울"};
    HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
    JLabel msg;
    
    public ComBoList2() {
		super("Collection");
		Container container=getContentPane();
		CenterPane cp=new CenterPane();
		
		msg=new JLabel("Choice:");
		container.add(cp,BorderLayout.CENTER);
		container.add(msg,BorderLayout.SOUTH);
		setSize(300,300);
		setVisible(true);
	}
	JList<String> guList;
	JComboBox<String> cityBox;
	ArrayList<String> vinchon,vseoul;
	class CenterPane extends JPanel{

		public CenterPane() {
			vinchon=new ArrayList<String>();
			vinchon.add("동구"); vinchon.add("서구");
			vinchon.add("남구"); vinchon.add("북구");
			hm.put(city[0],vinchon);
			vseoul=new ArrayList<String>();
			vseoul.add("용산"); vseoul.add("관악");
			vseoul.add("논현"); vseoul.add("강북");
			hm.put(city[1],vseoul);
			
			cityBox=new JComboBox<String>(city);
			cityBox.addActionListener(ComBoList2.this);
			guList=new JList(vinchon.toArray());
			guList.addListSelectionListener(new ListSelectionListener() {
				@Override
				public void valueChanged(ListSelectionEvent e) {
					JList list=(JList)e.getSource();
					msg.setText("Choice:"+list.getSelectedValue());
				}
			});
			add(cityBox);  add(guList);
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox<String> cbox=(JComboBox<String>)e.getSource();
		int index=cbox.getSelectedIndex();
		
		ArrayList<String> al=hm.get(city[index]);
		
		guList.removeAll();
		Object ob[]=al.toArray();
		String arr[]=new String[ob.length];
		for(int i=0;i<ob.length;i++) {
		     arr[i]=(String)ob[i];
		}
		guList.setListData(arr);
	}


	public static void main(String[] args) {
		new ComBoList2();
	}

}
