import java.util.Stack;

public class PallindromeList {
	/**
	 * 1 -->2-->3-->2-->1
	 * 
	 * @param ll
	 * 
	 */
	public static void checkPallindrome(LinkedList ll) {
		Node temp1 = ll.head;
		Node temp2 = ll.head;
		Node temp3 = ll.head;

		Stack<String> s1 = new Stack<String>();
		boolean flag = false;
		while (temp1.next != null) {
			if (temp1.next.next != null) {
				temp1 = temp1.next.next;
			} else {
				temp1 = temp1.next;
			}
			temp2 = temp2.next;
		}

		while (temp2 != null) {
			s1.push(temp2.data);
			temp2 = temp2.next;
		}
		while (!s1.isEmpty() && temp3.next != null) {
			if (temp3.data != s1.peek()) {
				flag = false;
				break;
			} else {
				flag = true;
			}
			temp3 = temp3.next;
			s1.pop();
		}
		if (flag) {
			System.out.println("Pallindrome !!!!");
		} else {
			System.out.println("Not pallindrome !!!");
		}

	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList("1");
		ll.insert("2");
		ll.insert("3");
		ll.insert("3");
		ll.insert("2");
		ll.insert("1");

		checkPallindrome(ll);
	}
}
