package stacksAndQueue;

public class Three3 {

	public static void main(String[] args) {
		SetOfStacks setOfStacks = new SetOfStacks();
		for(int i=0;i<20;i++){
			setOfStacks.push(i);
		}
		for(int i=0;i<12;i++){
			if(!setOfStacks.isEmpty()){
				System.out.println(setOfStacks.pop());
			}
			
		}
		
		


	}

}
