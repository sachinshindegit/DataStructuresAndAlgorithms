package stacksAndQueue;


/**
 * 
 * @author Sachin Shinde
 *
 */

// solution to question 3.2 of ctc

// To show the minimum value in a stack whenever asked
public class Three2 {

	
	public static void main(String[] args) {
		ListStackWithMin stack = new ListStackWithMin();
		stack.push(5);
		stack.push(2);
		stack.push(7);
		stack.push(5);
		stack.push(1);
		stack.push(0);
		stack.push(9);
		System.out.println("Popped value: "+stack.pop());
		System.out.println("Min Value: "+stack.min());
		System.out.println("Popped value: "+stack.pop());
		System.out.println("Min Value: "+stack.min());
		

	}

}
