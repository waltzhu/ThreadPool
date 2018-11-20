package product_consumer.A;

public class testA {
   public static void main(String[] args) {
	
	   // 仓库对象  
       storage storage = new storage();  
 
       // 生产者对象  
       producer p1 = new producer(storage);  
       producer p2 = new producer(storage);  
       producer p3 = new producer(storage);  
       producer p4 = new producer(storage);  
       producer p5 = new producer(storage);  
       producer p6 = new producer(storage);  
       producer p7 = new producer(storage); 
       // 消费者对象  
       consumer c1 = new consumer(storage);  
       consumer c2 = new consumer(storage);  
       consumer c3 = new consumer(storage);  
 
       // 设置生产者产品生产数量  
       p1.setNum(10);  
       p2.setNum(10);  
       p3.setNum(10);  
       p4.setNum(10);  
       p5.setNum(10);  
       p6.setNum(10);  
       p7.setNum(80);  
       
       // 设置消费者产品消费数量  
       c1.setNum(50);  
       c2.setNum(20);  
       c3.setNum(30);  
 
       // 线程开始执行  
       c1.start();  
       c2.start();  
       c3.start();
	   
       p1.start();  
       p2.start();  
       p3.start();  
       p4.start();  
       p5.start();  
       p6.start();  
       p7.start(); 
      
}
}
