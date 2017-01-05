
/**
 * Not Working Solution but algorithm is correct
 * @author abhkumar
 *
 */
public class AddTwoList {

	public static void main(String []args){
		
		SumLink link = new SumLink();
		link.insert(1);
		link.insert(2);
		link.insert(4);
		link.insert(6);
		
		printList(link.head);

	}
	
	
	public static SumLink recursively(SumLink temp1, SumLink temp2, int carry){
		if(temp1 == null || temp2 == null){	
			return null;
		}
		SumLink result = new SumLink();
		
		int value = carry;
		if(temp1 != null){
			value = value+carry;
		}
		
		if(temp2 != null){
			value = value+carry;
		}
		
		result.data = value%10;
		
		if(temp1 !=null || temp2 != null){
		SumLink res = recursively(result, temp1.next, temp2.next, carry = value>9?1:0);
		result.insert(res);
		}
		return result;
		}

	
	public static void printList(NodeValue temp){
		while(temp != null){
			System.out.println(temp);
			temp = temp.next;
		}
	}
	
}

class SumLink{
	
	NodeValue head;
	NodeValue tail;
	int data;
	NodeValue next;
	
	
	SumLink(){
		
	}
	
	public void insert(int data){
		if(head == null){
			head = new NodeValue(data);
			tail = head;
		}
		else{
			NodeValue temp = new NodeValue(data);
			tail.next = temp;
			tail = temp;
		}
		tail.next = null;
	}
}

class NodeValue{
	int data;
	NodeValue next;
	
	public NodeValue(int data) {
		this.data = data;
	}
	
	public String toString(){
		return Integer.toString(data);	
	}
}
