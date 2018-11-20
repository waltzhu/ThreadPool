package product_consumer.A;

public class producer extends Thread{
    private int num;
    private storage storage;
    
   

	public   producer(storage storage){
    	this.storage=storage;
    }
	
	public void run(){
		try {
			this.produce(num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void produce(int num) throws Exception{
		this.storage.produce(num);
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
