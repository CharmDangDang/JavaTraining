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
		
		//상단패널
		JPanel jptop = new JPanel();
		jptop.setFont(new Font("WKwmd",Font.ITALIC,20));
		jptop.setBackground(Color.LIGHT_GRAY);
		
		//하단
		JPanel jpbot = new JPanel();
		jpbot.setBackground(Color.DARK_GRAY);
		//미들패덜
		mimipan jpmid = new mimipan();
		//텍스트 필드
		jt1 = new JTextField(4);
		jt2 = new JTextField(4);
		jt3 = new JTextField(4);
		jt4 = new JTextField(4);
		//라벨
		JLabel jl1 = new JLabel("체리 :");
		JLabel jl2 = new JLabel("복숭아 :");
		JLabel jl3 = new JLabel(" 배 :");
		JLabel jl4 = new JLabel("바나나 :");
		//상단패널과 라벨 붙이기 
		jptop.add(jl1); jptop.add(jt1); jptop.add(jl2); jptop.add(jt2);
		jptop.add(jl3); jptop.add(jt3); jptop.add(jl4); jptop.add(jt4);
		//하단 버튼 2개
		JButton jb1 =new JButton("계산하기");
		JButton jb2 =new JButton("다시입력");
		//하단패널과 버튼 붙이기
		jpbot.add(jb1);	jpbot.add(jb2);
		//미들 라벨 생성
		JLabel jlb1 = new JLabel("체리");
		JLabel jlb2 = new JLabel("복숭아");
		JLabel jlb3 = new JLabel(" 배 ");
		JLabel jlb4 = new JLabel("바나나");
		//미들판넬에 붙이기 
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
		public void actionPerformed(ActionEvent e){ //텍스트필드변화시
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
