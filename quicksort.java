import java.util.*;


public class quicksort{
	
	
	public static ArrayList<Integer> quicksort(ArrayList<Integer> A){
		
		int len=A.size();
		ArrayList<Integer> more=new ArrayList<Integer>();
		ArrayList<Integer> less=new ArrayList<Integer>();
		ArrayList<Integer> pivots=new ArrayList<Integer>();
		ArrayList<Integer> ans=new ArrayList<Integer>();
		System.out.println(A.size());
		if (len==1){
			ans.add(A.get(0));
			return ans;
		}
		else{
			int pivot=A.get(0);
			for (int i=0; i<len; i++){
				if(A.get(i)<pivot){
					more.add(A.get(i));
				}
				else if(A.get(i)>pivot){
					less.add(A.get(i));
				}
				else{
					pivots.add(A.get(i));
				}
			}
			if(less.size()>0){
			less=quicksort(less);}
			if(more.size()>0){
			more=quicksort(more);}
			
			
			
			for(int i=0; i<less.size(); i++){
				ans.add(less.get(i));
			}
			
			for(int i=0; i<pivots.size(); i++){
				ans.add(pivots.get(i));
				
			}
			
			for(int i=0; i<more.size(); i++){
				ans.add(more.get(i));
				
			}
			
			
			return ans;
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	public static void main(String args[]){
		ArrayList<Integer> sort=new ArrayList<Integer>();
		sort.add(4);
		sort.add(2);
		sort.add(5);
		sort.add(3);
		sort.add(2);
		System.out.print(sort.size());
		ArrayList<Integer> A=quicksort(sort);
		for (int i=0; i<A.size();i++){
		System.out.print(A.get(i));
		}
		
	}
	
	
}