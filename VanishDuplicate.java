/**
 * Write code to remove duplicates from an unsorted linked list.
 *FOLLOW UP
 *How would you solve this problem if a temporary buffer is not allowed?
 * @author abhkumar
 *
 */
public class VanishDuplicate {

	public static void main(String []args){
		LinkedList ll = new LinkedList("F");
		ll.insert("O");
		ll.insert("L");
		ll.insert("L");
		ll.insert("O");
		ll.insert("W");
		//ll.insert("W");
		ll.insert("U");
		//ll.insert("U");
		ll.insert("P");
		
		Node temp = ll.head;
		while(temp !=null){
			//System.out.println(temp);
			temp = temp.next;
		}
		//reverse(ll);
		removeDuplicate(ll);
	}
	
	public static void reverse(LinkedList orgList){
		Node head = orgList.head;
		Node temp = head.next;
		Node prev = null;
		Node curr = head;
		while(temp != null){
			curr.next = prev;
			prev = curr;
			curr = temp;
			temp = temp.next;
		}
		curr.next = prev;
		head = curr;		
		//System.out.println(head);
		temp = head;
		while(temp != null){
			System.out.println(temp);
			temp = temp.next;
		}
	}
	
	/**
	 * My Solution
	 * F-> O -> L -> L -> O -> W -> U -->U-> P-->NULL
	 */
	public static void removeDuplicate(LinkedList ll){
		Node current = ll.head;
		Node runner = current;
		Node prev = current;
		while (current.next != null) {
			runner = current.next;
			prev = current;
			while (runner != null && prev != null) {
				if (current.data == runner.data) {
					prev.next = runner.next;
					
				}
				prev = prev.next;
				runner = runner.next;
			}
			
			current = current.next;
			System.out.println("now current is : "+current);
		}
		Node temp = ll.head;
		while (temp != null) {
			System.out.println(temp);
			temp = temp.next;
		}	

	}
	
	/**
	 * Books solution
	 * * F-> O -> L -> L -> O -> W -> U -->U-> P-->NULL
	 * @param ll
	 */
	public static void removeDupli(LinkedList ll){
		Node head = ll.head;
		if (head == null)
			return;
		Node previous = head;
		Node current = previous.next;
		while (current != null) {
			Node runner = head;
			while (runner != current) { // Check for earlier dups
				if (runner.data == current.data) {
					Node tmp = current.next; // remove current
					previous.next = tmp;
					current = tmp; // update current to next node
					break; // all other dups have already been removed
				}
				runner = runner.next;
			}
			if (runner == current) { // current not updated - update now
				previous = current;
				current = current.next;
			}
		}
	}
}

