package stacksAndQueue;

public class SetOfStacks {
	
	private ArrayStack stacksHolder, currentStack;
	
	public SetOfStacks(){
		stacksHolder = new ArrayStack();
		currentStack = new ArrayStack();
	}
	
	public void push(Object obj){
		if(currentStack.isFull()){
			stacksHolder.push(currentStack);
			if(stacksHolder.isFull()){
				System.out.println(" set of stacks is full");
			}
			else{
				currentStack = new ArrayStack();
				currentStack.push(obj);
			}
			
		}
		else{
			currentStack.push(obj);
		}
	}
	
	public Object pop(){
		
		if(currentStack.isEmpty()){
			currentStack = (ArrayStack)stacksHolder.pop();
			if(currentStack == null){
				return null;
			}
		}
		return currentStack.pop();
	}
	
	public Object peek(){
		if(currentStack.isEmpty() && !stacksHolder.isEmpty()){
			currentStack = (ArrayStack)stacksHolder.pop();
		}
		return currentStack.peek();
	}
	
	public boolean isEmpty(){
		if(peek() == null){
			return true;
		}
		else{
			return false;
		}
	}
}
