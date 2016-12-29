package sample;
/**
 * Code to partition the linklist around a value x, such that all nodes less than x come before all nodes
 * greater than or equal to x.
 * @author abhkumar
 *
 */
public class PartitionLink {

	public static void main(String []args){
		LinkList ll = new LinkList("1");
		ll.insert("4");
		ll.insert("6");
		ll.insert("9");
		ll.insert("5");
		System.out.println("hello");
		partition(ll,"6");
	}
	
	public static void partition(LinkList ll,String value){
		
		LinkList beforeValue = null;
		LinkList afterValue = null;
		
		Node head = ll.head;
		Node temp = head;
		
		while(temp != null){
			if (temp.data.compareTo(value) < 0) {
				if (beforeValue == null) {
					beforeValue = new LinkList(temp.data);
				} else {
					beforeValue.insert(temp.data);
				}
			} else {
				if(afterValue == null){
					afterValue = new LinkList(temp.data);
				}
				else{
					afterValue.insert(temp.data);
				}
			}
			temp = temp.next;
		}
		beforeValue.tail.next = afterValue.head;
		Node temp1 = beforeValue.head;
		while(temp1 != null){
			System.out.println(temp1);
			temp1 = temp1.next;
		}
	}

}
