package asdff;

public class ExceptionStart {

	public static void main(String[] args) {
		Exceptionclass  pot = new Exceptionclass();
		int a= 30,b=20;
		
		try {
			pot.throwExcep(a, b);
		} catch (Myexception e) {
			// TODO Auto-generated catch block
			e.cymPrint();
		}
		

	}

}
