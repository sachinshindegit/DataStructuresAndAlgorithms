package stacks;

import linkedLists.Node;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This class implements queue using linked list
public class LinkedQueue {
	
	private Node front, rear;
	private int size;
	
	public LinkedQueue(){
		size=0;
		front = null;
		rear = null;
	}
	
	// to check if the queue is empty
	public boolean isEmpty(){
		return (size==0);
	}
	
	// to peek on the front element in the queue
	public String peek(){
		return front.data;
	}
	
	// to insert an element in the queue
	public void insert(String data){
		Node node = new Node(data, null);
		if(isEmpty()){
			rear = front = node;
			size++;
		}
		else{
			rear.nextNode = node;
			rear = rear.nextNode;
			size++;
		}
	}
	
	// To remove an element from the queue
	public String remove(){
		Node temp = front;
		front  = front.nextNode;
		if(front == null){
			rear = null;
		}
		else{
			size--;
		}
		return temp.data;
	}
	
	
}
