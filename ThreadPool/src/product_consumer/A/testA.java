package product_consumer.A;

public class testA {
   public static void main(String[] args) {
	
	   // �ֿ����  
       storage storage = new storage();  
 
       // �����߶���  
       producer p1 = new producer(storage);  
       producer p2 = new producer(storage);  
       producer p3 = new producer(storage);  
       producer p4 = new producer(storage);  
       producer p5 = new producer(storage);  
       producer p6 = new producer(storage);  
       producer p7 = new producer(storage); 
       // �����߶���  
       consumer c1 = new consumer(storage);  
       consumer c2 = new consumer(storage);  
       consumer c3 = new consumer(storage);  
 
       // ���������߲�Ʒ��������  
       p1.setNum(10);  
       p2.setNum(10);  
       p3.setNum(10);  
       p4.setNum(10);  
       p5.setNum(10);  
       p6.setNum(10);  
       p7.setNum(80);  
       
       // ���������߲�Ʒ��������  
       c1.setNum(50);  
       c2.setNum(20);  
       c3.setNum(30);  
 
       // �߳̿�ʼִ��  
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
