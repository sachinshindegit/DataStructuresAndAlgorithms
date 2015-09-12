package tree;

import linkedLists.IntNode;
import linkedLists.Node;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This class implements queue using linked list
public class MyIntQueue {
	
	public ObjectLinkedNode front, rear;
	private int size;
	
	public MyIntQueue(){
		size=0;
		front = null;
		rear = null;
	}
	
	// to check if the queue is empty
	public boolean isEmpty(){
		return (size<=0);
	}
	
	// to peek on the front element in the queue
	public Object peek(){
		return front.data;
	}
	
	// to insert an element in the queue
	public void insert(Object data){
		ObjectLinkedNode node = new ObjectLinkedNode(data, null);
		if(isEmpty()){
			this.rear = node;
		    this.front = node;
			size++;
		}
		else{
			rear.next = node;
			rear = rear.next;
			size++;
		}
	}
	
	// To remove an element from the queue
	public Object remove(){
		ObjectLinkedNode temp = front;
		front  = front.next;
		if(front == null){
			rear = null;
		}
	
			size--;
		return temp.data;
	}
	
	
}
