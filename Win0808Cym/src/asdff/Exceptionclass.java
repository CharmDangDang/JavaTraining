package asdff;

public class Exceptionclass {
	public void throwExcep(int x,int y) throws Myexception {
		if ( x*y >100 )
			throw new Myexception();
		else
			System.out.println(x*y);
	}

}
