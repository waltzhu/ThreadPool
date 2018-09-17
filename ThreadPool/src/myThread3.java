
public class myThread3 extends Thread{

	@Override
	public void run() {
		super.run();
		System.out.println(innerSingleton.getLS().hashCode());
	}
   
	
	
}
