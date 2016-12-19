package practice2;

class LinkList
{
	public static void main(String []args){
		Link ll = new Link("1");
		ll.insert("2");
		ll.insert("3");
		ll.insert("4");
		ll.insert("5");
		
		Node obj = ll.head;
		Node current = ll.head;
		Node previous = null;
		while(current != null){
			Node temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
		obj = previous;
		
		
		while(obj != null){
			System.out.print(obj);
			obj=obj.next;
		}
	}
}

class Link{
	Node head;
	Node tail;
	public Link(String info){
		head = new Node(info);
		tail = head;
	}
	
	public void insert(String info){
		Node temp = new Node(info);
		tail.next = temp;
		tail = temp;
	}		
}

class Node{
	
	Node next;
	String data;
	public Node(String info){
		data = info;
	}
	
	public String toString(){
		return data;
	}
}
