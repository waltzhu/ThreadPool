package product_consumer.C;

import java.util.concurrent.LinkedBlockingQueue;

import product_consumer.product;

public class storage {
   private final int MAX_SIZE=100;//�ֿ��������
   
   private final LinkedBlockingQueue<product> productList=new LinkedBlockingQueue<product>();//�ֿ�������
   
 
   
   
   public void produce(int num) throws Exception{
	       
		   while(productList.size()==this.MAX_SIZE){//ע��������while��������if
			   System.out.println("~~~~~~~"+Thread.currentThread().getName()+"��������-��ǰ������"+this.productList.size()+"�޷���������"+num);
		   }
		   for(int i=0;i<num;i++){
			   productList.put(new product());
		   }
		   System.out.println("~~~~~~~"+Thread.currentThread().getName()+"�������-��ǰ������"+this.productList.size()+"����������"+num);
		    
		 
   }
   
   public void consume(int num) throws Exception{ 
	   
		   while(productList.size()<num){//ע��������while��������if
			   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"���Ѳ���-��ǰ������"+this.productList.size()+"�޷������ѣ�"+num);
			   
		   }
		   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"׼�����ѣ�"+num);
		   for(int i=0;i<num;i++){
			   productList.take();
		   }
		   System.out.println("$$$$$$$$"+Thread.currentThread().getName()+"�������-��ǰ������"+this.productList.size()+"�������ѣ�"+num);
		   
	   
   }

public int getMAX_SIZE() {
	return MAX_SIZE;
}

public LinkedBlockingQueue<product> getProductList() {
	return productList;
}
  
   
   
   
}
