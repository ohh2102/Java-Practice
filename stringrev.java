public class stringrev{
	
	public static String reverse(String entry){
		String ans="";
		for (int i=0; i<entry.length();i++){
			ans=ans+entry.charAt(entry.length()-1-i);	
		}
		return ans;
		
		
	}
	
	public static void main(String args[]){
		
		String entry="My name is omar";
		String ans=reverse(entry);
		System.out.println(ans);
		
	}
	
	
	
	
	
	
}