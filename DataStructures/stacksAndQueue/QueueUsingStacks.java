package stacksAndQueue;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This class implements queue using stacks.Here I have used two stacks to implement this
public class QueueUsingStacks {
	
	private ListStack inputStack;
	private ListStack outputStack;
	
	public QueueUsingStacks(){
		inputStack = new ListStack();
		outputStack = new ListStack();
	}
	
	public void insert(String data){
		inputStack.push(data);
	}
	
	public String remove(){
		if(outputStack.isEmpty()){
			while(!inputStack.isEmpty()){
				outputStack.push(inputStack.pop());
			}
		}
		return outputStack.pop();
	}
}
