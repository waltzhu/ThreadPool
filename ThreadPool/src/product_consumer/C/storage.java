package product_consumer.C;

import java.util.concurrent.LinkedBlockingQueue;

import product_consumer.product;

public class storage {
   private final int MAX_SIZE=100;//仓库最大容量
   
   private final LinkedBlockingQueue<product> productList=new LinkedBlockingQueue<product>();//仓库生产线
   
 
   
   
   public void produce(int num) throws Exception{
	       
		   while(productList.size()==this.MAX_SIZE){//注意这里是while，不能是if
			   System.out.println("~~~~~~~"+Thread.currentThread().getName()+"生产满了-当前容量："+this.productList.size()+"无法再生产："+num);
		   }
		   for(int i=0;i<num;i++){
			   productList.put(new product());
		   }
		   System.out.println("~~~~~~~"+Thread.currentThread().getName()+"生产完毕-当前容量："+this.productList.size()+"增量生产："+num);
		    
		 
   }
   
   public void consume(int num) throws Exception{ 
	   
		   while(productList.size()<num){//注意这里是while，不能是if
			   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"消费不够-当前容量："+this.productList.size()+"无法再消费："+num);
			   
		   }
		   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"准备消费："+num);
		   for(int i=0;i<num;i++){
			   productList.take();
		   }
		   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"消费完毕-当前容量："+this.productList.size()+"增量消费："+num);
		   
	   
   }

public int getMAX_SIZE() {
	return MAX_SIZE;
}

public LinkedBlockingQueue<product> getProductList() {
	return productList;
}
  
   
   
   
}
