package tree;

import linkedLists.IntNode;

public class ObjectLinkedNode {
	public Object data;
	public ObjectLinkedNode next = null;
	
	public ObjectLinkedNode(Object data){
		this.data = data;
	}
	
	public ObjectLinkedNode(Object data, ObjectLinkedNode n){
		this.data = data;
		this.next = n;
	}
	
	// To append another node at the end
			public void appendToTail(Object data){
				ObjectLinkedNode newNode = new ObjectLinkedNode(data);
				ObjectLinkedNode currentNode = this;
				while(currentNode.next != null){
					currentNode = currentNode.next;
				}
				currentNode.next = newNode;
				
			}
			
			// To calculate length of a list using slow and fast runner
			public int length(){
				ObjectLinkedNode slow = this;
				ObjectLinkedNode fast = this;
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
			public void appendNode(ObjectLinkedNode node){
				ObjectLinkedNode current = this;
				while(current.next != null){
					current = current.next;
				}
				current.next = node;
			}
			

}


