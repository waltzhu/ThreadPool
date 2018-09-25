package yeild;

/*
 * 1.注释掉yield ,用时4毫秒
 * 2.放开yield，用时3091毫秒
 */
public class testThread {
   public static void main(String[] args) {
	
	   mythread mt=new mythread();
	   mt.start();
}
}
