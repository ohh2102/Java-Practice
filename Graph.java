import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Graph{
	
	HashMap<Integer, Node> adjlist=new <Integer, Node>HashMap();
	Graph(int start){
		Node first_node=new Node(start);
		adjlist.put(start, first_node);
		
	}
	
	
	
	public void add_node(int next, int []nearby ){
		Node append=new Node(next);
		for (int i=0; i<nearby.length; i++){
			append.adj.add(nearby[i]);
			//ArrayList<Integer> ajusted= new ArrayList <Integer>(adjlist.get(nearby[i]).add(next));
			Node ajusted=new Node(adjlist.get(nearby[i]));
			ajusted.adj.add(next);
			adjlist.put(nearby[i], ajusted);
		}
		adjlist.put(next, append);
		
	}
	
	public void BFS(int find){
		boolean found_status=false;
		Set keys=adjlist.keySet();
		Iterator i=keys.iterator();
		ArrayList<Integer> queue=new ArrayList<Integer>();
		for (Map.Entry <Integer, Node> entry : adjlist.entrySet()){
			if(entry.getValue().color=="white" && found_status==false){
				Node newnode=new Node(entry.getValue());
				newnode.color="grey";
				
				adjlist.put(entry.getKey(), newnode);
				queue.add(entry.getKey());
				int distances=0;
				while(queue.size()>0){
					
					int key=queue.remove(0);
					System.out.println("At Queue point "+ key);
					System.out.println("Adj"+adjlist.get(key).adj.get(0));
					//
					for (Integer neighbor : adjlist.get(key).adj){
						if (adjlist.get(neighbor).color=="white"){
						//System.out.println("Neighbor is "+neighbor);
						if (neighbor==find){
					
							Node dist_update=new Node(adjlist.get(neighbor));
							dist_update.distance=adjlist.get(key).distance+1;
							adjlist.put(neighbor, dist_update);
							//adjlist.get(neighbor).I_Dis(distances);
							System.out.println("Node found");
							System.out.println(adjlist.get(neighbor).distance);
							found_status=true;
							break;
							}
						Node dist_update=new Node(adjlist.get(neighbor));
						dist_update.distance=adjlist.get(key).distance+1;
						adjlist.put(neighbor, dist_update);
						System.out.println("HERE 1");
						System.out.println(adjlist.get(key).distance);
						adjlist.get(neighbor).To_Grey();
						adjlist.put(neighbor, adjlist.get(neighbor));
						adjlist.get(neighbor).I_Dis(distances);
						adjlist.put(neighbor, adjlist.get(neighbor));
						queue.add(neighbor);
						
					}}
					
					if (found_status==true){break;}
					System.out.println("HERE 2");
						adjlist.get(key).To_Black();
						adjlist.put(key, adjlist.get(key));
						
						
						//System.out.println("Distance is ");
						
					
				}
				
				
			}
			
		}
	
		
	}
	
	
public static void DFS(int start, Graph graph, int dist ){
	
	Node update=new Node(graph.adjlist.get(start));
	update.color="Black";
	graph.adjlist.put(start, update);
	System.out.println("We are at "+start);
	System.out.println("Time took "+dist);
	for(Integer adjs: graph.adjlist.get(start).adj){
		if (graph.adjlist.get(adjs).color=="white"){
		DFS(adjs, graph, dist+1);}
		
	}
	
	
}
	
	
public static void main(String args[]){
	Graph testgraph=new Graph(4);
	int []kadj={4};
	
	
	testgraph.add_node(6, kadj);
	
	System.out.println(testgraph.adjlist.get(4).adj.get(0));
	
	int []jadj={4,6};
	
	testgraph.add_node(8, jadj);
	System.out.println(testgraph.adjlist.get(8).adj.get(0));
	System.out.println(testgraph.adjlist.get(8).adj.get(1));
	int []ladj={8};
	
	testgraph.add_node(10, ladj);
	int[] next={10};
	
	testgraph.add_node(11, next);
	testgraph.add_node(12, next);
	
	DFS(4,testgraph,0);
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}