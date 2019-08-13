package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class ColorRGB extends JFrame implements AdjustmentListener{

	JScrollBar jcr,jcg,jcb;
	JLabel jlr,jlg,jlb;
		JPanel panel;
	JTextField jtr,jtg,jtb;
	int a, b, c ;
	
	public ColorRGB() throws HeadlessException {
		super();
		Container cp = getContentPane();
		setBackground(Color.GRAY);
		
		jlr = new JLabel();
		//jlr.setText(;"»¡°­ :"+jcr.getValue()); ¹Ù·Î ³Ö´Â°Ô ¾Æ´Ï´Ù ¤Ñ¤Ñ
		jlr.setBounds(360, 30, 100,30 );
		jlr.setFont(new Font("±¼¸²Ã¼",Font.PLAIN, 20));
		jcr= new JScrollBar(JScrollBar.HORIZONTAL,150,0,0,255);	
		jcr.setBounds(360, 80, 200,30 );
		
		jlg = new JLabel();
		jlg.setBounds(360, 130, 200,30 );
		jlg.setFont(new Font("±¼¸²Ã¼",Font.PLAIN, 20));
		jcg= new JScrollBar(JScrollBar.HORIZONTAL,150,0,0,255);
		jcg.setBounds(360, 180, 200,30 );
		
		jlb = new JLabel();
		jlb.setBounds(360, 230, 200,30 );
		jlb.setFont(new Font("±¼¸²Ã¼",Font.PLAIN, 20));
		jcb= new JScrollBar(JScrollBar.HORIZONTAL,150,0,0,255);
		jcb.setBounds(360, 280, 200,30 );
		
		jtr=  new JTextField("");
		jtr.setBounds(460, 30, 100, 30);
		jtr.setFont(new Font("±¼¸²Ã¼",Font.PLAIN, 20));
		jtg= new JTextField("");
		jtg.setBounds(460, 130, 100, 30);
		jtg.setFont(new Font("±¼¸²Ã¼",Font.PLAIN, 20));
		jtb= new JTextField("");
		jtb.setBounds(460, 230, 100, 30);
		jtb.setFont(new Font("±¼¸²Ã¼",Font.PLAIN, 20));
		
		
		
			

		panel = new JPanel();
		panel.setBounds(30, 30, 300, 300);
		panel.setBackground(Color.WHITE);
		cp.add(panel);
		cp.setLayout(null);
		cp.add(jlr);
		cp.add(jlg);
		cp.add(jlb);
		cp.add(jcr);
		cp.add(jcg);
		cp.add(jcb);
		cp.add(jtr);
		cp.add(jtg);
		cp.add(jtb);
		
		
		
		setSize(600,400);		
		setVisible(true);
		jcr.addAdjustmentListener(this);
		jcg.addAdjustmentListener(this);
		jcb.addAdjustmentListener(this);
		
	}

	@Override
	public  void adjustmentValueChanged(AdjustmentEvent e) {
		jtr.setText(jcr.getValue());
		jlr.setText("»¡°­ :"+jcr.getValue());
		jlg.setText("ÃÊ·Ï :"+jcg.getValue());
		jlb.setText("ÆÄ¶û :"+jcb.getValue());
	   panel.setBackground(new Color(jcr.getValue(), jcg.getValue(), jcb.getValue()));
	  }

	
	

	public static void main(String[] args) {
		    new ColorRGB();

	}

}
