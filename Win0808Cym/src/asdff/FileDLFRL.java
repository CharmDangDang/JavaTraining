package asdff;

import java.io.FileReader;
import java.util.Scanner;

public class FileDLFRL {

	public static void main(String[] args) throws Exception{
		Scanner stdin = new Scanner(System.in);
				System.out.println("�о� ���� ���ϸ��� �Է��ϼ��� : ");
		String s = stdin.next();
		FileReader fr = new FileReader(s);
		int i;
		while((i = fr.read())!=-1) {
			System.out.print((char)i);
		}
		f
		fr.close();

	}

}
