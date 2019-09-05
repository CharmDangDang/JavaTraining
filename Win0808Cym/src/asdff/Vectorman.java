package asdff;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Vectorman {
	
	public static void  main(String[] arg) throws Exception{
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	
	try {
	fos=new FileOutputStream("object.dat");
	oos = new ObjectOutputStream(fos);
	Vector v=new Vector(); //<e> 지우면 이것저것 다 담겠다는 의도예요.
	Vector v1=new Vector();
	Vector v2=new Vector();
	Vector v3=new Vector();
	v1.addElement(new String("date 1"));
	v1.addElement(new String("date 2"));
	v1.addElement(new String("date 3"));

	v2.addElement(new String("date 4"));	
	v3.addElement(v2);
	v.addElement(v3);
	v.addElement(v1);

	oos.writeObject(v);
	oos.reset();
	System.out.println("저장 되었어용~~");
	} catch (Exception e) {
		
		
		e.printStackTrace();
		
		
	} finally {
		try {
		   fos.close();
		   oos.close();
		}	catch
			(Exception ee) {
			ee.printStackTrace();
		}		
	}
	}
	
	}


