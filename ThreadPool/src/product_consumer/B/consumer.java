package product_consumer.B;

public class consumer extends Thread{
	 private int num;
	 private storage storage;
	 
	 public   consumer(storage storage){
		 this.storage=storage;
	 }
	 
	 public void run()  {
		 try {
			this.consume(num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	 
	 public void consume(int num) throws Exception{
		 this.storage.consume(num);
	 }
	 
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public storage getStorage() {
		return storage;
	}
	public void setStorage(storage storage) {
		this.storage = storage;
	}
	 
	 
	 
	
}
