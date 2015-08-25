package linkedLists;

/**
 * 
 * @author Sachin Shinde
 *
 */
public class LinkedListMain {

	public static void main(String[] args) {
		System.out.println("hello");
		Node node = new Node("first");
		node.appendToTail("second");
		node.appendToTail("third");
		node.appendToTail("fourth");
		node.appendToTail("fifth");
		
		System.out.println(node.length(node));
		

	}

}
