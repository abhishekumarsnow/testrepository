
public class LinkedList {

	String data;
	Node head;
	Node tail;
	
	public LinkedList(String info) {
		head = new Node(info);
		tail = head;
		tail.next = null;
	}
	
	public void insert(String info){
		Node temp = new Node(info);
		tail.next = temp;
		tail = temp;
		tail.next = null;
	}
}

class Node{
	Node next;
	String data;
	
	Node(String info){
		data = info;
	}
	
	public String toString(){
		return data;
	}
}
