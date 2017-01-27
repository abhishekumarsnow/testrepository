package NewRank;

public class CustomLinkList {

	Node head;
	Node tail;
	
	public CustomLinkList(String arg) {
		Node temp = new Node(arg);
		head = tail = temp;
		tail.next = null;
	}
	
	public void insert(String arg2){
		
		Node temp = new Node(arg2);
		tail.next = temp;
		tail = temp;
		tail.next = null;
		
	}
}

class Node{
	Node next;
	String param;
	public Node(String arg){
		param = arg;
	}
	
	public String toString(){
		return param;
	}
}

