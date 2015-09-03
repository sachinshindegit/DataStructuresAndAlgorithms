package linkedLists;


// This is a question from CTC 2.4. 
// Given a value, the lesser elements to be placed in the left and the greater elements than the value to be placed in the right
public class Two4 {
	
	public IntNode arrange(IntNode head, int value){
		IntNode leftMostNode = null;
		IntNode rightMostNode = null;
		IntNode currentNode = head;
		IntNode middleNode = new IntNode(value);
		IntNode tempNode = null;
		while(currentNode !=null){
			if(currentNode.data <= middleNode.data){
				if(leftMostNode == null){
					leftMostNode = new IntNode(currentNode.data);
					leftMostNode.next = middleNode;
				}
				else{
					tempNode = leftMostNode;
					leftMostNode = new IntNode(currentNode.data);
					leftMostNode.next = tempNode;
				}
			}
			if(currentNode.data > middleNode.data){
				if(rightMostNode == null){
					rightMostNode = new IntNode(currentNode.data);
					middleNode.next = rightMostNode;
				}
				else{
					tempNode = rightMostNode;
					rightMostNode = new IntNode(currentNode.data);
					tempNode.next = rightMostNode;
				}
			}
			currentNode = currentNode.next;
		}
		
		return leftMostNode;
	}
	
	public void printList(IntNode head){
		while(head != null){
			System.out.print(" "+head.data);
			head = head.next;
		}
	}
		
	public static void main(String[] args) {
		Two4 obj = new Two4();
		IntNode node = new IntNode(4);
		node.appendToTail(2);
		node.appendToTail(5);
		node.appendToTail(8);
		node.appendToTail(1);
		node.appendToTail(10);
		node.appendToTail(7);
		node.appendToTail(4);
		node.appendToTail(0);
		System.out.println("before: ");
		obj.printList(node);
		System.out.println();
		System.out.println("After:");
		IntNode output = obj.arrange(node, 6);
		obj.printList(output);
		

	}

}
