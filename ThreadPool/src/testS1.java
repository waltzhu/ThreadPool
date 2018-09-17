
public class testS1 {
    public static void main(String[] args) { 
		
    	myThread1 m1=new myThread1();
    	myThread1 m2=new myThread1();
    	myThread1 m3=new myThread1();
    	m1.start();
    	m2.start();
    	m3.start();
	}
}
