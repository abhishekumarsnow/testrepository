import java.util.LinkedList;
import java.util.Queue;


public class LevelOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(1);
		node.left = new Node(3);
		node.right = new Node(2);
		node.left.left = new Node(4);
		node.right.left = new Node(2);
		printLevel(node);
		

	}
	
	public static void printLevel(Node root){
		Queue<Node> queue = new LinkedList<Node>();
		if(root == null){
			return;
		}
		queue.add(root);
		while(!queue.isEmpty()){
		Node temp = (Node) queue.remove();
		System.out.print(temp.data+" ");
		if(temp.left != null){
			queue.add(temp.left);
		}
		if(temp.right != null){
			queue.add(temp.right);
		}
		}
		
	}

}
