package asdff;

public class thread {

	public static void main(String[] args) {
		Mythread t = new Mythread();
		t.start();
		
	
		
		for(int i = 0 ; i<10 ; i++) {
			try {
				
			} catch (Exception e) {
				System.out.println(i);
			}.sleep(1000);
			
		}
	}

}
