package linkedLists;

public class Two6 {
	
	// to check if there is a loop in the list
	public boolean checkLoop(IntNode node){
		IntNode slow = node;
		IntNode fast = node;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		IntNode head = new IntNode(5);
		head.appendToTail(1);
		head.appendToTail(8);
		head.appendToTail(3);
		head.appendToTail(10);
		head.appendNode(head);
		
		Two6 obj = new Two6();
		
		System.out.println(obj.checkLoop(head));

	}

}
