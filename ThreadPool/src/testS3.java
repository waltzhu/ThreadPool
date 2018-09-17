
public class testS3 {

	
	public static void main(String[] args) {
		
	  	myThread3 m1=new myThread3();
    	myThread3 m2=new myThread3();
    	myThread3 m3=new myThread3();
    	m1.start();
    	m2.start();
    	m3.start();
	}
}
