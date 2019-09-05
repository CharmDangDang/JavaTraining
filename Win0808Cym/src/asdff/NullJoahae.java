package asdff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

public class NullJoahae extends JFrame {
		Container ct ;
		JLabel label = new JLabel("Hello");
		JLabel imagelabel = new JLabel();
	public NullJoahae() {
		setTitle("제이컬러추저");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ct = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie",Font.ITALIC,30));
		ct.add(label,BorderLayout.NORTH);
		ct.add(imagelabel,BorderLayout.CENTER);
		createMenu();
		setSize(300,200);
		setVisible(true);
	}
	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem colorMenuItem = new JMenuItem("Color");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem shItem = new JMenuItem("Close");
		JMenu fileMenu = new JMenu("Text");
		JMenu ffileMenu = new JMenu("File");
		
		
		colorMenuItem.addActionListener(new MenuActionListener());
		openItem.addActionListener(new MenuActionListener());
		shItem.addActionListener(new MenuActionListener());
		ffileMenu.add(openItem);
		ffileMenu.add(shItem);
		fileMenu.add(colorMenuItem);
		mb.add(ffileMenu);
		mb.add(fileMenu);
		setJMenuBar(mb);
	}
class MenuActionListener implements ActionListener{
	JColorChooser chooser = new JColorChooser();
	JFileChooser fchooser = new JFileChooser();
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("Color")) {
			Color selectedColor = chooser.showDialog(null, "Color", Color.YELLOW);
				
			if(selectedColor != null)
			label.setForeground(selectedColor);
		}
		else if (cmd.equals("Close")) {
		  int result =  JOptionPane.showConfirmDialog(null, "종료할꺼?","Confirm",JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.YES_OPTION)
		       System.exit(0);
			else if(result == JOptionPane.NO_OPTION)
				return;
			else
				return;
		}
		
		
			
		FileNameExtensionFilter filter = new 
				FileNameExtensionFilter("JPG or GIF","jpg","gif");
		fchooser.setFileFilter(filter);
		int ret = fchooser.showOpenDialog(null);
		if(ret != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "파일을 선택안했네. ","경고",JOptionPane.WARNING_MESSAGE);
			return;
		}
		String filePath = fchooser.getSelectedFile().getPath();
		imagelabel.setIcon(new ImageIcon(filePath));
		pack();
	}
}
	public static void main(String[] args) {
		new NullJoahae();

	}

}
