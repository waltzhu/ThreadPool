package product_consumer.A;

import java.util.LinkedList;

import product_consumer.product;

public class storage {
   private final int MAX_SIZE=100;//�ֿ��������
   
   private final LinkedList<product> productList=new LinkedList<product>();//�ֿ�������
   
   public void produce(int num) throws Exception{
	 synchronized (productList) {
		   if((productList.size()+num)>this.MAX_SIZE){
			   this.productList.wait();
			   System.out.println("��������-��ǰ������"+this.productList.size()+"�޷���������"+num);
		   }
		   for(int i=0;i<num;i++){
			   productList.add(new product());
		   }
		   System.out.println("�������-��ǰ������"+this.productList.size()+"����������"+num);
		   this.productList.notifyAll();
		}  
   }
   
   public void consume(int num) throws Exception{ 
	   synchronized (productList) {
		   if((productList.size()+num)>this.MAX_SIZE){
			   this.productList.wait();
			   System.out.println("���Ѳ���-��ǰ������"+this.productList.size()+"�޷������ѣ�"+num);
		   }
		   for(int i=0;i<num;i++){
			   productList.remove();
		   }
		   System.out.println("�������-��ǰ������"+this.productList.size()+"�������ѣ�"+num);
		   this.productList.notifyAll();
	   }
   }

public int getMAX_SIZE() {
	return MAX_SIZE;
}

public LinkedList<product> getProductList() {
	return productList;
}
  
   
   
   
}
