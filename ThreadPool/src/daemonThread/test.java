package daemonThread;

/*
 * ˵����m1���ػ��̣߳������߳�-���ػ��̣߳�sleep˯��ʱ�� m1Ҳ�Զ��˳���
 */
public class test {
    public static void main(String[] args) { 
    	try{
			myThread1 m1=new myThread1();
			m1.setDaemon(true);//���Ϊ�ػ��߳�
			m1.start();
			Thread.sleep(5000);
			System.out.println("���뿪��thread1���󣬲��ڴ�ӡ�ˣ���ֹͣ��......");
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	 
	}
}
