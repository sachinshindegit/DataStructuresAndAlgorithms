package stacksAndQueue;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This class is a part of the solution to 3.2 of ctc
// This class is a stack implementation which extends our any implementation of stack
// It uses another stack to store the minimum value as per the remaining members of the original stack
public class ListStackWithMin extends ArrayStack{
	ArrayStack minStack = new ArrayStack();
	
	public void push(Integer val){
		if(minStack.isEmpty()){
			super.push(val);
			minStack.push(val);
		}
		else{
			if(val < (int)minStack.peek()){
				super.push(val);
				minStack.push(val);
			}
			else{
				super.push(val);
			}
		}
	}
	
	public Integer pop(){
		Integer temp = (Integer)super.pop();
		if(temp == min()){
			minStack.pop();
		}
		return temp;
	}
	
	public Integer min(){
		return (Integer)minStack.peek();
	}
	

}
