package asdff;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.sun.org.apache.xml.internal.serializer.ToStream;



class Box  implements Serializable {
	public int width;
	public int height;
	public int depth;
	public Box(int w, int h, int d) {
		width =w;
		height = h;
		depth = d;
	}
	
}
public class Objectwritetest1 {
	public static void main(String[] args) throws Exception {
		String s1 = "***박스의 가로,세로,높이***";
		Box mybox1 = new Box(10,20,30);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("kkkyoumin2.txt"));
		oos.writeObject(s1);
		oos.writeObject(mybox1);
		oos.writeDouble(123.456);
		oos.close();
		LocalDateTime ldt = LocalDateTime.now();
		//oos.writeBytes((ldt));
		System.out.println("오늘의 날짜와 시간은 : "+ldt);
		System.out.println("kkkyoumin2.txt 파일명으로 객체 파일을 생성하였다 입금하도록.");
		
		
	}

}
