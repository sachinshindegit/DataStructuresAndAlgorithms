package linkedLists;

public class Node {
	String data=null;
	Node nextNode=null;
	
	public Node(String data){
		this.data = data;
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
	
	
}
