package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ekehwjs extends JFrame implements ActionListener{
	JTextField jt1; 
	JTextField jt2;
	JTextField jt3; 
	JTextField jt4;
	int[] arcAngle = new int[4];

	public Ekehwjs() throws HeadlessException {
		super();
		Container ct = getContentPane();
		
		//����г�
		JPanel jptop = new JPanel();
		jptop.setFont(new Font("WKwmd",Font.ITALIC,20));
		jptop.setBackground(Color.LIGHT_GRAY);
		
		//�ϴ�
		JPanel jpbot = new JPanel();
		jpbot.setBackground(Color.DARK_GRAY);
		//�̵��д�
		mimipan jpmid = new mimipan();
		//�ؽ�Ʈ �ʵ�
		jt1 = new JTextField(4);
		jt2 = new JTextField(4);
		jt3 = new JTextField(4);
		jt4 = new JTextField(4);
		//��
		JLabel jl1 = new JLabel("ü�� :");
		JLabel jl2 = new JLabel("������ :");
		JLabel jl3 = new JLabel(" �� :");
		JLabel jl4 = new JLabel("�ٳ��� :");
		//����гΰ� �� ���̱� 
		jptop.add(jl1); jptop.add(jt1); jptop.add(jl2); jptop.add(jt2);
		jptop.add(jl3); jptop.add(jt3); jptop.add(jl4); jptop.add(jt4);
		//�ϴ� ��ư 2��
		JButton jb1 =new JButton("����ϱ�");
		JButton jb2 =new JButton("�ٽ��Է�");
		//�ϴ��гΰ� ��ư ���̱�
		jpbot.add(jb1);	jpbot.add(jb2);
		//�̵� �� ����
		JLabel jlb1 = new JLabel("ü��");
		JLabel jlb2 = new JLabel("������");
		JLabel jlb3 = new JLabel(" �� ");
		JLabel jlb4 = new JLabel("�ٳ���");
		//�̵��ǳڿ� ���̱� 
		jpmid.add(jlb1); jpmid.add(jlb2); jpmid.add(jlb3); jpmid.add(jlb4);
		
		
	add(jpmid,BorderLayout.CENTER);
	add(jptop,BorderLayout.NORTH);	
	add(jpbot,BorderLayout.SOUTH);	
	setSize(400,600);
	setVisible(true);
		
	}

	class mimipan extends JPanel {
public void paintComponent(Graphics g) {
			super.paintComponent(g);
			setBackground(Color.ORANGE);
			
}
	}

		@Override
		public void actionPerformed(ActionEvent e){ //�ؽ�Ʈ�ʵ庯ȭ��
			JTextField jt1 = (JTextField)e.getSource();
			JTextField jt2 = (JTextField)e.getSource();
			JTextField jt3 = (JTextField)e.getSource();
			JTextField jt4 = (JTextField)e.getSource();
			int n1,n2,n3,n4;
				n1 = Integer.parseInt(jt1.getText());
				n2 = Integer.parseInt(jt2.getText());
				n3 = Integer.parseInt(jt3.getText());
				n4 = Integer.parseInt(jt4.getText());
				 			
			}
	public static void main(String[] args) {
		new Ekehwjs();

	}

}
