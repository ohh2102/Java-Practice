
public class BST {
	
	Node head;
	BST(int val){
		head=new Node(val);
	}
	
	
	public class Node {
		int value;
		Node right=null;

		Node left=null;
		
		public Node(int val){
			value=val;
		}
		
	
		}
		
		
	public int BT_Max(Node node){
		if(node.right==null){
			return node.value;
		}
		else{
			return BT_Max(node.right);
		}
		
	}
	
	
	public void add(int val, Node node){
		if(val<node.value){
			if(node.left==null){node.left=new Node(val);}
			else{add(val, node.left);}	
		}
		
		else{
			if(node.right==null){node.right=new Node(val);}
			else{add(val, node.right);}		
		}
	
	}
	
	
public static void main(String args[])	{
	BST tree=new BST(5);
	tree.add(3, tree.head);
	tree.add(7, tree.head);
	tree.add(8, tree.head);
	tree.add(9, tree.head);
	tree.add(1, tree.head);
	int x;
	x=tree.BT_Max(tree.head);
	System.out.println(x);
}
	
	
	
	
	
	
}