package linkedLists;


// This node stores int values
public class IntNode {
	int data;
	IntNode next = null;
	
	public IntNode(int data){
		this.data = data;
	}
	
	// To append another node at the end
			public void appendToTail(int data){
				IntNode newNode = new IntNode(data);
				IntNode currentNode = this;
				while(currentNode.next != null){
					currentNode = currentNode.next;
				}
				currentNode.next = newNode;
				
			}
}
