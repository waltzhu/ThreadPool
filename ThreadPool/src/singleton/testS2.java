package singleton;

public class testS2 {
    public static void main(String[] args) { 
		
    	myThread2 m1=new myThread2();
    	myThread2 m2=new myThread2();
    	myThread2 m3=new myThread2();
    	m1.start();
    	m2.start();
    	m3.start();
	}
}
