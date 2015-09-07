package stacks;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This is implementation of stack using array
public class ArrayStack {
	private static final int DEFAULT_CAPACITY = 15;
	private Object[] array;
	private int top;
	
	public ArrayStack(int initialCapacity){
		if(initialCapacity <=0 ){
			array = new Object[DEFAULT_CAPACITY];
		}
		else{
			array = new Object[initialCapacity];
		}
		top = -1;
	}
	
	public ArrayStack(){
		this(DEFAULT_CAPACITY);
	}
	
	// To check if the stack is empty
	public boolean isEmpty(){
		if(top < 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	//To pop out the last element
	public Object pop(){
		if(isEmpty()){
			return null;
		}
		else{
			Object temp = array[top];
			array[top] = null;
			top--;
			return temp;
		}
		
	}
	
	// to push a new element in the stack
	public void push(Object obj){
		top++;
		if(top == array.length){
			System.out.println("Stack if full");
		}
		else{
			array[top] = obj;
		}
	}
	
	// to clear the stack
	public void clear(){
		while(top >= 0){
			array[top] = null;
			top--;
		}
	}
}
