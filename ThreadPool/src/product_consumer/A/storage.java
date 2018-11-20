package product_consumer.A;

import java.util.LinkedList;

import product_consumer.product;

public class storage {
   private final int MAX_SIZE=100;//仓库最大容量
   
   private final LinkedList<product> productList=new LinkedList<product>();//仓库生产线
   
   public void produce(int num) throws Exception{
	 synchronized (productList) {
		   while((productList.size()+num)>this.MAX_SIZE){
			   System.out.println("~~~~~~~"+Thread.currentThread().getName()+"生产满了-当前容量："+this.productList.size()+"无法再生产："+num);
			   productList.wait();
		   }
		   for(int i=0;i<num;i++){
			   productList.add(new product());
		   }
		   System.out.println("~~~~~~~"+Thread.currentThread().getName()+"生产完毕-当前容量："+this.productList.size()+"增量生产："+num);
		   productList.notifyAll();
		}  
   }
   
   public void consume(int num) throws Exception{ 
	   synchronized (productList) {
		   while(productList.size()<num){
			   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"消费不够-当前容量："+this.productList.size()+"无法再消费："+num);
			   productList.wait();
		   }
		   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"准备消费："+num);
		   for(int i=0;i<num;i++){
			   productList.remove();
		   }
		   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"消费完毕-当前容量："+this.productList.size()+"增量消费："+num);
		   productList.notifyAll();
	   }
   }

public int getMAX_SIZE() {
	return MAX_SIZE;
}

public LinkedList<product> getProductList() {
	return productList;
}
  
   
   
   
}
