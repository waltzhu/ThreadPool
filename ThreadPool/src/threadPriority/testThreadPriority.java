package threadPriority;


public class testThreadPriority {

/*
 * 说明：
 * 线程具有继承性，通过一个线程去启动另一个线程，他们的优先级是一样的。	
 */
	public static void main(String[] args) {
		
	   System.out.println("main:"+Thread.currentThread().getPriority());
	   myThread1 m1=new myThread1();
	   m1.start();
	   
	   /*结果：
	    * main:5
		  myThread1:5
		  myThread2:5
	    */
	   
	   
	   System.out.println("main:"+Thread.currentThread().getPriority());
	   Thread.currentThread().setPriority(6);
	   System.out.println("main:"+Thread.currentThread().getPriority());
	   myThread1 m11=new myThread1();
	   m11.start();
	   
	   /*结果：
	   main:5
	   main:6
	   myThread1:6
	   myThread2:6
	   */
	}
}
