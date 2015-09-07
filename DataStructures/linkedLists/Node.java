package linkedLists;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This node stores string 
public class Node {
	public String data=null;
	public Node nextNode=null;
	
	public Node(String data){
		this.data = data;
	}
	
	public Node(String data, Node n){
		this.data = data;
		this.nextNode = n;
	}
	
	
	// To delete a node
	public Node deleteNode(String data,Node headNode){
		Node previousNode=null;
		Node currentNode = headNode;
		while(currentNode != null){
			if(currentNode.data.equals(data)){
				// That means we got a match with the headNode
				if(previousNode==null){
					headNode = currentNode.nextNode;
					break;
				}
				previousNode.nextNode = currentNode.nextNode;
				break;
			}
			previousNode = currentNode;
			currentNode = currentNode.nextNode;
		}
		return headNode;
	}
	
	// To append another node at the end
	public void appendToTail(String data){
		Node newNode = new Node(data);
		Node currentNode = this;
		while(currentNode.nextNode != null){
			currentNode = currentNode.nextNode;
		}
		currentNode.nextNode = newNode;
		
	}
	
	public int length(Node headNode){
		Node currentNode = headNode;
		int counter=0;
		while(currentNode!=null){
			counter += 1;
			currentNode = currentNode.nextNode;
		}
		return counter;
	}
	
	// To get nth element in the list
	public String get(int index, Node head){
		Node currentNode = head;
		while(index > 0){
			currentNode = currentNode.nextNode;
			index--;
		}
		return currentNode.data;
		
	}
	
	
}
