package threadPriority;

public class myThread1 extends Thread {

	@Override
	public void run() {
		 System.out.println("myThread1:"+this.getPriority());
		 myThread2 m2=new myThread2();
		 m2.start();
	}
     
}
