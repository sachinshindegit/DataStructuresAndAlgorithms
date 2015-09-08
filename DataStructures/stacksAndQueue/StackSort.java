package stacksAndQueue;

/**
 * 
 * @author Sachin Shinde
 *
 */

// The class implements sorting of a stack in ascending order with highest element in the top
// IT uses 2 stacks to implement this
public class StackSort {
	
	private int min, count, temp;
	private ArrayStack holderStack, stack;
	
	public StackSort(ArrayStack s){
		this.stack = s;
		holderStack = new ArrayStack();
	}
	
	public ArrayStack sort(){
		count = stack.size();
		
		for(int i=count;i>0;i--){
			min = (Integer)stack.pop();
			temp = 1;
			while(temp<=i-1){
				if(min > (Integer)stack.peek()){
					holderStack.push(min);
					min = (Integer)stack.pop();
				}
				else{
					holderStack.push(stack.pop());
				}
				temp++;
			}
			stack.push(min);
			while(!holderStack.isEmpty()){
				stack.push(holderStack.pop());
			}
		}
		return stack;
	}
	
}
