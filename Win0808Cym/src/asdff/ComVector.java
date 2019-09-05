package asdff;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

public class ComVector {

	public static void main(String[] args) {
	FileInputStream fis = null;
	ObjectInputStream ois = null;
	
	try {
	fis = new FileInputStream("object.dat");
	ois = new ObjectInputStream(fis);	
	Vector v = (Vector) ois.readObject();
	Vector v1 = (Vector)v.get(0);
	Vector v3 = (Vector)v.get(1);
	//Vector v2 = (Vector)v3.get(0);
	
	System.out.println(v1.get(0));
	System.out.println(v1.get(1));
	System.out.println(v1.get(2));
	//System.out.println(v2.get(0));
	
	
	
	
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


