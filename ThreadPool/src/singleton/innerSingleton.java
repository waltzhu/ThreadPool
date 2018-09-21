package singleton;

public class innerSingleton {
	
	private static class innerSingle{
		private static innerSingleton ls=new innerSingleton();
	}
	
	private innerSingleton(){}
	
	
	public static innerSingleton  getLS(){
        return innerSingle.ls;		
	} 
	
}
