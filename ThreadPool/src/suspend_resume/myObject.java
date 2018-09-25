package suspend_resume;

public class myObject {
   
	private String username="1";
	private String password="1";
	
	public void setValue(String username, String password){
		this.username=username;
		if(Thread.currentThread().getName().equals("a")){
			System.out.println("线程a被暂停了......");
			Thread.currentThread().suspend();
		}
		this.password=password;
	}
	
	public void printValue(){
		System.out.println(this.username+"*********"+this.password);
	}
	
}
