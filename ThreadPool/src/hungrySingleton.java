
public class hungrySingleton {

	public static hungrySingleton hs=new hungrySingleton();
	
	private hungrySingleton(){} //构造函数私有，防止外面调用
	
	public static hungrySingleton getHS(){
		return hs;
	}
}
