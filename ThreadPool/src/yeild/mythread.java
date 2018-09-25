package yeild;

public class mythread extends Thread{
   
	
	public void run(){
		long stime=System.currentTimeMillis();
		int count=0;
		for(int i=0;i<10000000;i++){
			Thread.yield();
			count += (i+1);
		}
		long etime=System.currentTimeMillis();
		System.out.println(etime-stime);
	}
}
