import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class sortbylist{
	
	ArrayList<Node> sorter=new<Node> ArrayList();
	String []values;
	sortbylist(int []ints, String[] list){
		
		for (int i=0; i<list.length;i++){
			Node to_add=new Node(ints[i], list[i]);
			sorter.add(to_add);}
		
		Collections.sort(sorter);
		values=new String[list.length];
		for (int i=0; i<list.length;i++){
			values[i]=sorter.get(i).value;}
		}
	public void print(){
		System.out.println(Arrays.toString(values));
		
	}
		
	
	
	public class Node implements Comparable <Node>{
		int key;
		String value;
		Node(int key, String value){
			this.key=key;
			this.value=value;
			
		}
		
		public int compareTo(Node another){
			if(another.key>key){return -1;}
			else if(another.key<key){return 1;}
			else{return 0;}
		}
		
		
	}
	
	public static void main(String []args){
		
		String []X = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
		int []Y = { 0,   1,   1,    0,   1,   2,   2,   0,   1};
		sortbylist test=new sortbylist(Y, X);
		test.print();
		
	}
	
	
	
	
	
	
	
	
}