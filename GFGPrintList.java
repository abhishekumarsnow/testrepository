package NewRank;

public class GFGPrintList {

	public static void main(String []args){
		CustomLinkList ll = new CustomLinkList("2");
		ll.insert("3");
		ll.insert("4");
		ll.insert("5");
		ll.insert("6");
		
		print(ll.head);
		
		System.out.println("lengthsasa : "+findLengthRecursively(ll.head,0));
		modeifyHead(ll.head);
	}
	
	public static void print(Node head){
		Node temp = head;
		int count = 0;
		while(temp != null){
			System.out.println(temp);
			temp = temp.next;
			count++;
		}
		
	}
	
	public static int  findLengthRecursively(Node head, int count){
		if(head == null){
			return 0;
		}
		return 1+findLengthRecursively(head.next,count);
		
	}
	
	public static void modeifyHead(Node head){
		head = deleteHead(head);
		//print(head);
	}
	
	public static Node deleteHead(Node head){
		Node temp = head;
		temp = temp.next;
		head.next = null;
		head = temp;
		return head;
	}
	
	public static void swapNodes(Node x, Node y){
		
	}
}
