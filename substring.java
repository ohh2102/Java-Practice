public class substring {
	
	public static void substring(String sub, String supers){
		for (int i=0; i<=supers.length()-sub.length();i++){
			String start="";
			System.out.println(i);
			for(int j=i; j<sub.length()+i;j++){
				start=start+supers.charAt(j);
				
			}
			System.out.println(start);
			if (start.equals(sub)){
				System.out.println(start);
				System.out.println("We have found it at "+i);
				break;
			}
			else{continue;}
			
		}
		
		System.out.println("We could not find it");
		
		
		
		
		
	}
	
	
	
	
	
public static void main(String args[]){
	String sub=";ab";
	String supers="dkladakabcsdk;ab";
	substring(sub, supers);
	
	
	
}
	
	
	
	
	
	
}