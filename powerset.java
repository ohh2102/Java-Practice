import java.util.ArrayList;
import java.util.Arrays;

public class powerset{
	
	public static ArrayList<int []> powerset(ArrayList<int []> set){
		
	
		if (set.size()==1 && set.get(0).length==1){
			int []array=new int[set.get(0).length];
			array=set.get(0);
			ArrayList<int []> power=new ArrayList<int []>();
			power.add(array);
			return power;
		}
		else if(set.size()>1 || set.get(0).length>1){
			ArrayList<int []> call_on=new ArrayList<int []>();
			for (int i=0; i<set.size()-1;i++){
				call_on.add(set.get(i));
			}
			int to_add=set.get(set.size()-1)[0];
			
			ArrayList<int []>initial=new ArrayList<int []>();
			initial=powerset(call_on);
			ArrayList<int []>return_value=new ArrayList<int []>();
			for(int i=0; i<initial.size(); i++){
				return_value.add(initial.get(i));
			}
			for(int i=0; i<initial.size(); i++){
				
				int []narray=new int[initial.get(i).length+1];
				for (int j=0;j<initial.get(i).length; j++){
					narray[j]=initial.get(i)[j];
				}
				narray[initial.get(i).length]=to_add;
				return_value.add(narray);
				
			}
			return return_value;
			
		}
		else{
			System.out.println(set.size());
			System.out.println(set.get(0).length);
			return set;
		}
		
		
		
		
		
	}
	
public static void main(String args[]){
	ArrayList<int []> test=new ArrayList<int []>();
	int []tarray=new int[3];
	tarray[0]=1;
	tarray[2]=2;
	tarray[1]=3;
	test.add(tarray);
	ArrayList<int []> Answer=new ArrayList<int []>();
	Answer=powerset(test);
	for (int i=0; i<Answer.size(); i++){
	System.out.println(Arrays.toString(Answer.get(i)));}
}
	
	
	
	
}