
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ggraph<keytype, valuetype>{
	
	
	HashMap<keytype, Newnode> adjlist=new HashMap<keytype, Newnode>();
	ggraph(keytype first_key, valuetype first_value){
		Newnode first_node=new Newnode(first_key, first_value);
		adjlist.put(first_key, first_node);
	}
	ggraph(keytype first_key){
		Newnode first_node=new Newnode(first_key);
		adjlist.put(first_key, first_node);
	}
	
	public class Newnode extends Node {
		keytype Newkey;
		valuetype value;
		ArrayList<keytype> adj=new ArrayList<keytype>();
		
		
		
		Newnode(keytype Newkey, valuetype value){
			this.Newkey=Newkey;
			this.value=value;}
		
		Newnode(keytype Newkey){
			this.Newkey=Newkey;
		}
		Newnode(Newnode another){
			Newkey=another.Newkey;
			value=another.value;
			color=another.color;
			distance=another.distance;
			adj=another.adj;
		}
		
	}
	
	public void add_node(keytype akey, valuetype avalue, keytype []locs ){
		
		Newnode node=new Newnode(akey, avalue);
		for(keytype keys: locs){
			node.adj.add(keys);
			Newnode to_add=new Newnode(adjlist.get(keys));
			to_add.adj.add(akey);
			adjlist.put(keys, to_add);
		}
		adjlist.put(akey, node);
		
	}
	
	public void add_nodes(keytype []akeys,valuetype avalues, keytype []locs){
		for(keytype keys: akeys){
			add_node(keys, avalues, locs);
		}
	}
	
	public void nearby(keytype start){
		System.out.println("Near "+start+" is");
		for(keytype keys: adjlist.get(start).adj){
			System.out.println(keys);
		}	
	}
	
	public void print_graph(){
		for(Map.Entry<keytype, Newnode> entry: adjlist.entrySet()){
			keytype key=entry.getKey();
			nearby(key);
		}		
	}
	
	
	
public static void main(String args[]){
	
	ggraph<Integer, Integer>test=new ggraph<Integer, Integer>(1,1);
	Integer []node2={1};
	test.add_node(2, 2, node2);
	Integer []node3={1,2};
	test.add_node(3, 3, node3);
	Integer []node4={3};
	test.add_node(4, 4, node4);
	Integer []node5={1, 4};
	test.add_node(5, 5, node5);
	test.print_graph();
	
	
	
	
	
	
}
	
	
	
	
	
	
	
}