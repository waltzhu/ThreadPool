package threadPriority;


public class testThreadPriority {

/*
 * ˵����
 * �߳̾��м̳��ԣ�ͨ��һ���߳�ȥ������һ���̣߳����ǵ����ȼ���һ���ġ�	
 */
	public static void main(String[] args) {
		
	   System.out.println("main:"+Thread.currentThread().getPriority());
	   myThread1 m1=new myThread1();
	   m1.start();
	   
	   /*�����
	    * main:5
		  myThread1:5
		  myThread2:5
	    */
	   
	   
	   System.out.println("main:"+Thread.currentThread().getPriority());
	   Thread.currentThread().setPriority(6);
	   System.out.println("main:"+Thread.currentThread().getPriority());
	   myThread1 m11=new myThread1();
	   m11.start();
	   
	   /*�����
	   main:5
	   main:6
	   myThread1:6
	   myThread2:6
	   */
	}
}
