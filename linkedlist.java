public class linkedlist <Type> {
	Node head;
	Node tail;
	
	linkedlist(){
		head=null;
		tail=null;
	}
	
	linkedlist(Type key){
		head=new Node(key, null, null);
	}
	
	public void add_to_list(Type key){
		tail=head.add_node(key);
	}
	
	public void print(){
		head.printf();
		tail.printb();
	}
	
	public class Node{
		Node prev;
		Node next;
		Type key;
		
		Node(){
			prev=null;
			next=null;
		}
		
		Node(Type key){
			this.key=key;
		}
		Node(Type key, Node next, Node prev){
			this.key=key;
			this.next=next;
			this.prev=prev;
		}
		
		public Node add_node(Type key){
			if (next==null){
				next=new Node(key, null, this);
				return next;
			}
			else{
				return next.add_node(key);
			}
			
		}
		
		public void printf(){
			Node to_print=this;
			while(to_print!=null){
				System.out.println(to_print.key);
				to_print=to_print.next;
			}
			
			
		}
		public void printb(){
			Node to_print=this;
			while(to_print!=null){
				System.out.println(to_print.key);
				to_print=to_print.prev;
			}
			
			
		}
		
		
		
		
		
	}
	
	
	public static void main( String []args){
		linkedlist<Integer> test=new linkedlist<Integer>(10);
		test.add_to_list(6);
		test.add_to_list(6);
		test.add_to_list(3);
		test.print();
	}
	
	
	
}