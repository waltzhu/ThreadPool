
public class hungrySingleton {

	public static hungrySingleton hs=new hungrySingleton();
	
	private hungrySingleton(){} //���캯��˽�У���ֹ�������
	
	public static hungrySingleton getHS(){
		return hs;
	}
}
