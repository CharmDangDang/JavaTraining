package asdff;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Fileoutput {

	public static void main(String[] args) throws Exception {
		Scanner stdin = new Scanner(System.in);
		System.out.println("출력할 파일명을 입력해주세용 : ");
		String s = stdin.next();
		FileOutputStream fos = new FileOutputStream(s);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(false);
		dos.writeByte(Byte.MAX_VALUE);
		dos.writeChar('김');
		dos.writeDouble(Double.MAX_VALUE);
		dos.writeFloat(Float.MAX_VALUE);
		dos.writeInt(Integer.MAX_VALUE);
		dos.writeLong(Long.MAX_VALUE);
		dos.writeShort(Short.MAX_VALUE);
		fos.close();
		System.out.println(s + "파일이 생성되었습니다.");
		
	}
}
