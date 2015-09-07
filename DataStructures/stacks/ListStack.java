package stacks;

import linkedLists.Node;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This class implements stack using linked list
public class ListStack{
	private Node top;
	
	public ListStack(){
		this.top = null;
	}
	
	public boolean isEmpty(){
		return (top==null);
	}
	
	
	// To clear the stack
	public void clear(){
		top = null;
	}
	
	
	// to peek the value at the top of the stack
	public String peek(){
		return top.data;
	}
	
	// to push a value into the stack
	public void push(String data){
		this.top = new Node(data,top);
	}
	
	
	// to pop the value at the top of the stack
	public String pop(){
		if(isEmpty()){
			return null;
		}
		String temp = this.top.data;
		top = top.nextNode;
		return temp;
	}
}

