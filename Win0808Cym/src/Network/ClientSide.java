package Network;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ClientSide {

	public static void main(String[] args) {
		String server = args[0];
		int port = Integer.parseInt(arg[1]);
		Socket c = new Socket(server,port);
		InputStream is = c.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		for(int i=1;i<=10;i++) {
			int j = dis.readInt();
			System.out.println("�����κ��� ���� ������" + j + " ���");
		}
		c.close();
	}
}