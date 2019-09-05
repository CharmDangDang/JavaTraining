package asdff;

import java.awt.Container;
import java.awt.HeadlessException;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClinetYM extends JFrame {

	public ClinetYM() throws HeadlessException, IOException {
		int port = 9588;
		int times = 10;
		ServerSocket sersoc = new ServerSocket(port);
		OutputStream osm = new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				// TODO Auto-generated method stub
				
			}
		};	
		DataOutputStream dos = new DataOutputStream(osm);
		sersoc.accept();
		
		
		Container container = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jpl = new JPanel();
		JLabel label = new JLabel("점수 조회 서버 가동중");
		jpl.add(label);
		add(jpl);
		
		setSize(500,500);
		setVisible(true);
		
	}

	public static void main(String[] args) throws IOException {
		new ClinetYM();
		
	}

}
