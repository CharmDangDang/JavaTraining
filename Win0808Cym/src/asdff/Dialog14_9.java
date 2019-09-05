package asdff;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;





public class Dialog14_9 extends JFrame {

	Container ct;
	JLabel jlb = new JLabel();
	
	public Dialog14_9()  {
		setTitle("메뉴와 파일추저");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ct = getContentPane();
		ct.add(jlb);
		createMenu();
		
		setSize(300,200);
		setVisible(true);
	}
void createMenu() {
	JMenuBar jmb = new JMenuBar();
	JMenu filemenu = new JMenu("File");
	JMenuItem openitem = new JMenuItem("Open");
	openitem.addActionListener(new OpenActionListener());
	filemenu.add(openitem);
	jmb.add(filemenu);
	this.setJMenuBar(jmb);
}
class OpenActionListener implements ActionListener {
	JFileChooser chooser;
	OpenActionListener() {
	chooser = new JFileChooser();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG or GIF","jpg","gif");
		chooser.setFileFilter(filter);
		int ret = chooser.showOpenDialog(null);
		if(ret != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "파일을 선택안했네. ","경고",JOptionPane.WARNING_MESSAGE);
			
			return;
	}
	String filePath = chooser.getSelectedFile().getPath();
	jlb.setIcon(new ImageIcon(filePath));
	pack();
		
}

}

	
	public static void main(String[] args) {
		new Dialog14_9();
	}

}
