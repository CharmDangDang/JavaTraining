package asdff;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

public class Bookread implements Serializable{

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("wemadeit.dat");
			ois = new ObjectInputStream(fis);	
			FileReader frr = new FileReader("wemadeit.dat");
			ArrayList<Jokbook> boboook = (ArrayList) ois.readObject();
			Jokbook jok = new Jokbook(null, 0, null, null);	
			Jokbook jok1 = new Jokbook(null, 0, null, null);	
			Jokbook jok2= new Jokbook(null, 0, null, null);
		
			int j;
			while((j=frr.read()) !=-1 ) {
			;
			}
			frr.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
				fis.close();
				ois.close();
				}catch ( IOException e) {
				
				}
			}
			
			}
		}




