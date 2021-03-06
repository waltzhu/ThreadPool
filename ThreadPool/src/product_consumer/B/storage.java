package product_consumer.B;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import product_consumer.product;

public class storage {
   private final int MAX_SIZE=100;//仓库最大容量
   
   private final LinkedList<product> productList=new LinkedList<product>();//仓库生产线
   
   private final Lock lock=new ReentrantLock();
   
   private final Condition full=lock.newCondition();
   
   private final Condition empty=lock.newCondition();
   
   
   public void produce(int num) throws Exception{
	       lock.lock();
		   while((productList.size()+num)>this.MAX_SIZE){//注意这里是while，不能是if
			   System.out.println("~~~~~~~"+Thread.currentThread().getName()+"生产满了-当前容量："+this.productList.size()+"无法再生产："+num);
			   full.await();
		   }
		   for(int i=0;i<num;i++){
			   productList.add(new product());
		   }
		   System.out.println("~~~~~~~"+Thread.currentThread().getName()+"生产完毕-当前容量："+this.productList.size()+"增量生产："+num);
		   full.signalAll();
		   empty.signalAll();
		   lock.unlock();
		 
   }
   
   public void consume(int num) throws Exception{ 
	      lock.lock();
		   while(productList.size()<num){//注意这里是while，不能是if
			   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"消费不够-当前容量："+this.productList.size()+"无法再消费："+num);
			   empty.await();
		   }
		   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"准备消费："+num);
		   for(int i=0;i<num;i++){
			   productList.remove();
		   }
		   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"消费完毕-当前容量："+this.productList.size()+"增量消费："+num);
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
