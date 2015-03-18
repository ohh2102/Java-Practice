import java.util.ArrayList;



public class Node {
		int key;
		String color="white";
		int distance=0;
		ArrayList<Integer> adj=new ArrayList<Integer>();
		Node(int key){this.key=key;
		color="white";
		
		}	
		
		Node(){
			key=0;
		}
		Node(Node another){
			key=another.key;
			color=another.color;
			distance=another.distance;
			adj=another.adj;
			
		}
		public void To_Grey(){
			color="grey";
		}
		public void To_Black(){
			color="black";
		}
		public void I_Dis(int dist){
			distance=dist;
		}
		public void I_DisDFS(int distance){
			this.distance=distance;
		}
	}