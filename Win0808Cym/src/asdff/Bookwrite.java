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
		
		//jok.setBooktitle("�ڹٶ� �����ΰ�? -��-");
		//jok1.setBooktitle("�ڹٶ� �����ΰ�? -��-");
		//jok2.setBooktitle("�ڹٶ� �����ΰ�? -��-");
		//jok2.setPricetag(38000);
		//jok2.setSn(01033776841);
		//jok2.setAuthor(" �� �� �� ");
		
		

		
		

		oos.writeObject(hw);
		oos.reset();
		System.out.println("���� �Ǿ����~~");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

