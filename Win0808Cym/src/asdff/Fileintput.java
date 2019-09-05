package asdff;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Fileintput {

	public static void main(String[] args) throws Exception {
		Scanner stdin =new Scanner(System.in);
				System.out.println("입력 파일명을 입력하세요 : ");
		String s = stdin.next();
		FileInputStream fis = new FileInputStream(s);
		DataInputStream dis = new DataInputStream(fis);
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println("오늘의 날짜와 시간은 : "+ldt);
		System.out.println(dis.readBoolean());
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		System.out.println(dis.readFloat());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readShort());
		fis.close();
																		
	}

}
