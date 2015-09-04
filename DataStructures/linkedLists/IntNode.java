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
			
			// To calculate length of a list using slow and fast runner
			public int length(){
				IntNode slow = this;
				IntNode fast = this;
				int count = 0;
				
				while(fast != null && fast.next != null){
					slow = slow.next;
					fast = fast.next.next;
					count = count + 1;
					
				}
				
				// If odd length
				if(fast != null){
					return (2*count)+1;
				}
				
				// if even length
				return 2*count;
				
			}
			
			// Append a node at the tail
			public void appendNode(IntNode node){
				IntNode current = this;
				while(current.next != null){
					current = current.next;
				}
				current.next = node;
			}
			

}
