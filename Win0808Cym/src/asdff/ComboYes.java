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
		//�⺻ �ʼ� ��� ���� 
		Container ct =getContentPane();
		String city[] = {"����","��õ","�뱸","�λ�","����"};
		String seogoo[] = {"������","������","������","���ϱ�","������"};
		String ingoo[] = {"������","������","����Ȧ��","����","�ϱ�"};
		String daegoo[] = {"������1","������2","������3","������4","������5"};
		String boogoo[] = {"������6","������7","������8","������9","������10"};
		String jejugoo[] = {"������11","������12","������13","������14","������15"};
		
		//���̶� ����
		JLabel explain = new JLabel("     ");
		explain.setBounds(15, 245, 250, 100);
		explain.setBackground(Color.PINK);
		explain.setFont(new Font("tjfaud",Font.BOLD,30));
		explain.setOpaque(true);
		//���̸���Ʈ ����
		JList dongnae = new JList();
		dongnae.setFont(new Font("dongnae",Font.PLAIN ,18));
		dongnae.setBounds(150, 10, 110, 200);
		dongnae.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				JList<String> selected=(JList<String>)e.getSource();
						
		
				explain.setText("���� �𸣰ڴ٤�"+selected.getSelectedValue());
			
				
			}
		});
		
		//�޺��ڽ� ����
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
		//���̱� ����
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
