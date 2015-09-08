package stacksAndQueue;

public class Three6 {

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack();
		stack.push(7);
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(1);
		stack.push(4);
		stack.push(6);
		stack.push(0);

		StackSort obj = new StackSort(stack);
		stack = obj.sort();
		System.out.println();
		System.out.println("After sort: ");
		while(!stack.isEmpty()){
			System.out.print(" "+stack.pop());
		}

	}

}
