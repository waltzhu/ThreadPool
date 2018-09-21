package daemonThread;

public class myThread1 extends Thread {

	private int i=0;
	
	@Override
	public void run() {
		try{
			while (true){
				i++;
				 System.out.println("i:"+i);
				 this.sleep(1000);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		 
		 
	}
     
}
