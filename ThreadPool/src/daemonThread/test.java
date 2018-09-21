package daemonThread;

/*
 * 说明：m1是守护线程，当主线程-非守护线程，sleep睡眠时， m1也自动退出了
 */
public class test {
    public static void main(String[] args) { 
    	try{
			myThread1 m1=new myThread1();
			m1.setDaemon(true);//标记为守护线程
			m1.start();
			Thread.sleep(5000);
			System.out.println("我离开了thread1对象，不在打印了，我停止了......");
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	 
	}
}
