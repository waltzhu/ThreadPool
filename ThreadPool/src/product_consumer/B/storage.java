package product_consumer.B;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import product_consumer.product;

public class storage {
   private final int MAX_SIZE=100;//�ֿ��������
   
   private final LinkedList<product> productList=new LinkedList<product>();//�ֿ�������
   
   private final Lock lock=new ReentrantLock();
   
   private final Condition full=lock.newCondition();
   
   private final Condition empty=lock.newCondition();
   
   
   public void produce(int num) throws Exception{
	       lock.lock();
		   while((productList.size()+num)>this.MAX_SIZE){//ע��������while��������if
			   System.out.println("~~~~~~~"+Thread.currentThread().getName()+"��������-��ǰ������"+this.productList.size()+"�޷���������"+num);
			   full.await();
		   }
		   for(int i=0;i<num;i++){
			   productList.add(new product());
		   }
		   System.out.println("~~~~~~~"+Thread.currentThread().getName()+"�������-��ǰ������"+this.productList.size()+"����������"+num);
		   full.signalAll();
		   empty.signalAll();
		   lock.unlock();
		 
   }
   
   public void consume(int num) throws Exception{ 
	      lock.lock();
		   while(productList.size()<num){//ע��������while��������if
			   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"���Ѳ���-��ǰ������"+this.productList.size()+"�޷������ѣ�"+num);
			   empty.await();
		   }
		   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"׼�����ѣ�"+num);
		   for(int i=0;i<num;i++){
			   productList.remove();
		   }
		   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"�������-��ǰ������"+this.productList.size()+"�������ѣ�"+num);
		   full.signalAll();
		   empty.signalAll();
		   lock.unlock();
	   
   }

public int getMAX_SIZE() {
	return MAX_SIZE;
}

public LinkedList<product> getProductList() {
	return productList;
}
  
   
   
   
}
