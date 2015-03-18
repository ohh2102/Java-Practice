import java.util.Arrays;


public class mergesort {


public static int[] merge_sort(int A[]){
	if (A.length>1){
		int q=A.length/2;
		int[] Left= new int[q];
		for (int i=0; i<q;i++){
			Left[i]=A[i];
		}
		//System.out.print(Arrays.toString(Left));
		int[] Right= new int[A.length-q];
		for (int i=q; i<A.length;i++){
			Right[i-q]=A[i];
		}
		//System.out.print(Arrays.toString(Right));
		int[] Leftsort=merge_sort(Left);
		int[] Rightsort=merge_sort(Right);
		//System.out.print(Arrays.toString(merge(Leftsort, Rightsort)));
		return merge(Leftsort, Rightsort);
		
		
	}
	else{return A;
	}
	
	
	
}


public static int[] merge(int[] L, int[] R){
	int k=0;
	int i=0;
	int j=0;
	int []A=new int[L.length+R.length];
	System.out.print("Left \n");
	System.out.print(Arrays.toString(L)+"\n");
	System.out.print("Right \n");
	System.out.print(Arrays.toString(R)+"\n");
	
	while((i<L.length) && (j<R.length)){
		if (L[i]<R[j]){
			A[k]=L[i];
			k++;
			i++;
		}
		else {
			A[k]=R[j];
			k++;
			j++;
		}
	}
	while (i!=L.length){
		A[k]=L[i];
		k++;
		i++;
	}
	
	while(j!=R.length){
		A[k]=R[j];
		k++;
		j++;
		
	}
	System.out.print("Merged \n");
	System.out.print(Arrays.toString(A)+"\n");
	return A;
}



public static void main(String args[]){
	int[] sort=new int[] {4, 2, 5, 3, 2};
	int []A=merge_sort(sort);
	System.out.print(Arrays.toString(A));
	
	
	
}
}