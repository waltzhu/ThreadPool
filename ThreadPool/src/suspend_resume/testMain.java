package suspend_resume;


/*
 * ������
 * �߳�1�����󣬽��븳ֵ��������ֵ��username,Ȼ����ͣ
 * �߳�2������ӡ����Ϊpasswordû�б���ֵ�����Խ�����£�
 * --���߳�a����ͣ��......
   --��walt*********1
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
