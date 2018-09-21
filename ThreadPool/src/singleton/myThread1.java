package singleton;

public class myThread1 extends Thread{

	@Override
	public void run() {
		super.run();
		System.out.println(hungrySingleton.getHS().hashCode());
	}
   
	
	
}
