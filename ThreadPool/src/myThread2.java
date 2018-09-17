
public class myThread2 extends Thread{

	@Override
	public void run() {
		super.run();
		System.out.println(lazySingleton.getLS().hashCode());
	}
   
	
	
}
