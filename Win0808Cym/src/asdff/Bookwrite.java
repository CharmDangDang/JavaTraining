package asdff;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

public class Bookwrite {
	public static void main(String[] args) {
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	

	try {
		fos=new FileOutputStream("wemadeit.dat");
		oos = new ObjectOutputStream(fos);
		HEll hw = new HEll();
		ArrayList<Jokbook> bobook = new ArrayList();
		
		;
		
		//jok.setBooktitle("자바란 무엇인가? -상-");
		//jok1.setBooktitle("자바란 무엇인가? -중-");
		//jok2.setBooktitle("자바란 무엇인가? -하-");
		//jok2.setPricetag(38000);
		//jok2.setSn(01033776841);
		//jok2.setAuthor(" 전 완 기 ");
		
		

		
		

		oos.writeObject(hw);
		oos.reset();
		System.out.println("저장 되었어용~~");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

