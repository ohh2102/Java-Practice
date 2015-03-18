public class maxsubsum {
	
	public static int maxsum(int []array){
		int sum_end_here=0;
		int high_sum=0;
		for (int i: array){
		sum_end_here=max(0, sum_end_here+i);
		high_sum=max(high_sum, sum_end_here);
		
		}
		return high_sum;	
	}
	
	
	
	public static int max(int a, int b){
		if (a>b){return a;}
		else{return b;}	
	}
	
	public static void main(String [] args){
		int [] testarray={2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxsum(testarray));
		
		
		
		
	}
	
	
	
	
	
	
}