/**
 * Implement an algorithm to find the nth to last element of a singly linked list.
 * @author abhkumar
 *
 */
public class KthFromEndAndDeleteNode {

	public static void main(String []args){
		LinkedList ll = new LinkedList("1");
		ll.insert("1");
		ll.insert("2");
		ll.insert("3");
		ll.insert("4");
		ll.insert("5");
		ll.insert("6");
		ll.insert("7");
		
		findPosition(ll.head, 2);
		
		
	}
	
	public static void findPosition(Node head, int pos){
		
		if(head == null || pos <1 ){
			return;
		}
		Node current = head;
		Node runner = current;
		int cnt = 0;

		while (runner != null) {
			runner = runner.next;
			if (cnt < pos) {
				cnt++;
			} else {
				current = current.next;
			}
		}
		System.out.println(current);
	}
	
/**
 * Implement an algorithm to delete a node in the middle of a single linked list, given
 *only access to that node.
 *EXAMPLE
 *Input: the node ‘c’ from the linked list a->b->c->d->e
 *Result: nothing is returned, but the new linked list looks like a->b->d->e
 * @param head
 * @param val
 */
	
	public static void deleteNode(Node head,String val){
		Node current = head;
		while(current.next != null){
			if(current.next.data == val){
				current.next = current.next.next;
			}
			current = current.next;
			System.out.println(current);
		}
	}
}
