import java.util.Arrays;


public class heap{
	
	int []array;
	int heapsize;
	heap(){
		heapsize=array.length;	
	}
	
	heap(int []arry){
		heapsize=arry.length;
		for(int i=heapsize;i>=1;i--){
			heapify(arry, i);
		}
		array=arry;
			
	}
	
	public void print(){
		System.out.println(Arrays.toString(array));
		
	}
	public static int [] add_node(int element, int [] arry){
		int []ans=new int[arry.length+1];
		for (int i=0; i<arry.length;i++){
			ans[i]=arry[i];
		}
		ans[ans.length-1]=element;
		max_up(ans, ans.length-1 );
		return ans;
		
		
	}
	
	public static void max_up( int [] arry, int start){
		int parent=(start+1)/2-1;
		if(parent>=0 && arry[parent]<arry[start]){
			int temp=arry[parent];
			arry[parent]=arry[start];
			arry[start]=temp;
			max_up(arry, parent);
			
		}
	
	}
	
	public static void heapify(int []arry, int i){
		int left=2*i-1;
		int right=left+1;
		int max;
		if (left<arry.length && arry[i-1]<arry[left]){
			max=left;
			
		}
		else{
			max=i-1;
		}
		
		if(right<arry.length && arry[i-1]<arry[right]){
			max=right;
		}
		if(max!=i-1){
			int temp=arry[max];
			arry[max]=arry[i-1];
			arry[i-1]=temp;
			heapify(arry, max);
		}
		
	}
	
public static void main(String args[]){
	int []testarray={20,50,100,4,25,10,30,80};
	heap testheap=new heap(testarray);
	testheap.print();
	testheap.array=add_node(120,testheap.array);
	testheap.print();
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}