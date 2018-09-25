package suspend_resume;


/*
 * 分析：
 * 线程1启动后，进入赋值方法，赋值了username,然后暂停
 * 线程2启动打印，因为password没有被赋值，所以结果如下：
 * --》线程a被暂停了......
   --》walt*********1
 */
public class testMain {

	public static void main(String[] args) throws Exception {
		
		final myObject mo=new myObject();
		
		Thread thread1=new Thread(){
			public void run(){
				mo.setValue("walt", "123456");
			};
		};
		thread1.setName("a");
		thread1.start();
		Thread.sleep(500);
		
		Thread thread2=new Thread(){
			public void run(){
				mo.printValue();
			};
		};
		thread2.start();
	}
}
