import java.util.Arrays;


public class arraytest {
	
	int []set;
	
	arraytest(){
		set=new int[0];
	}
	
	arraytest(int n){
		set=new int[n];
	}
	
	arraytest(int []n){
		System.out.println(n.length);
		set=new int[n.length];
		for (int i=0; i<n.length; i++){
			set[i]=n[i];
		}
		
	}
	
	public void array_switch(int []n){
		set=new int[n.length];
		for (int i=0; i<n.length; i++){
			set[i]=n[i];
		}
		
	}
	
	public void print(){
		System.out.println(Arrays.toString(set));
	}
	
	
	public static void main(String args[]){
		int []arr={1,2,3};
		arraytest test=new arraytest(arr);
		test.print();
		int []arr2={1,2,3,5};
		test.array_switch(arr2);
		test.print();
		
	}
	
	
	
	
	
}