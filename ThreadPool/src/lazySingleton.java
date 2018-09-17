
public class lazySingleton {

	public volatile static lazySingleton ls=null;
	
	private lazySingleton(){}
	
	
	public static lazySingleton  getLS(){
		if(ls==null){
			synchronized (lazySingleton.class) {
				if(ls==null){
					ls=new lazySingleton();
				}
			}
		}
        return ls;		
	} 
	
}
