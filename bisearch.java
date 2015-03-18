public class bisearch{
	
	public static boolean bisearch(int []space, int find){
		if (space.length>1){
		int half=space.length/2;
		if (space[half]>find){
			int []newhalf=new int[half];
			for(int i=0;i<half; i++){
				newhalf[i]=space[i];
			}
			return bisearch(newhalf, find);
		}
		
		else if(space[half]<find){
			int [] newhalf=new int[space.length-half];
			for (int i=half; i<space.length;i++){
				newhalf[i-half]=space[i];
			}
			return bisearch(newhalf, find);
			
			
		}
		
		}
		int half=space.length/2;
		if(space[half]==find){return true;}
		else{return false;}
		
		
		
		
	}
	
	public static void main(String args[]){
	int []test={1,3,6,8,12,13,19};
	if (bisearch(test,13)==true){
	System.out.println("true");}
	else{
		System.out.println("false");
	}
	
	}
	
	
	
	
}