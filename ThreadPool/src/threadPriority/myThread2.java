package threadPriority;

public class myThread2 extends Thread {

	@Override
	public void run() {
		 System.out.println("myThread2:"+this.getPriority());
	}
     
}
