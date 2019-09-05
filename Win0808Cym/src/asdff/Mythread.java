package asdff;

public class Mythread extends Thread {

	public Mythread(String name) {
		super(name);
		
	}

	@Override
	public void run() {
	for(int i=0 ; i<10; i++){
		try {
			Thread.sleep(1000);
			System.out.println("½º·¹µå "+ i);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		
			
		}
		
	}}

}
