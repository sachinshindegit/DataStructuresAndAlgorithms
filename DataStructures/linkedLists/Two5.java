package linkedLists;

// This is a solution for question 2.5 from ctc
// adding two numbers where each number is stored in 2 different linked list and every digit of those numbers is a node in resp lists
// units digit is the head
// output should be a linked list with units digit as head
// If the output is to be just int then the question becomes easier
public class Two5 {
	
	public IntNode sum(IntNode head1, IntNode head2){
		int temp, num1,num2,carry=0;
		IntNode result = null;
		IntNode curr1 = head1;
		IntNode curr2 = head2;
		while(curr1 != null || curr2 != null){
			if(curr1 == null){
				num1 = 0;
			}
			else{
				num1 = curr1.data;
			}
			if(curr2 == null){
				num2 = 0;
			}
			else{
				num2 = curr2.data;
			}
				temp = num1 + num2 + carry;
				if(temp > 9){
					carry = 1;
				}
				if(result == null){
					result = new IntNode(temp%10);
				}
				else{
					result.appendToTail(temp%10);
				}
				
			
			if(curr1 != null){
				curr1 = curr1.next;
			}
			if(curr2 != null){
				curr2 = curr2.next;
			}
			
			
		}
		if(carry > 0){
			result.appendToTail(carry);
		}
		return result;
	}
	
	public void printList(IntNode head){
		String temp = "";
		while(head != null){
			temp = head.data + temp;
			
			head = head.next;
		}
		System.out.print(""+temp);
	}
	
	public static void main(String[] args) {
		Two5 obj = new Two5();
		IntNode head1 = new IntNode(9);
		head1.appendToTail(9);
		head1.appendToTail(9);
		obj.printList(head1);
		
		System.out.print(" + ");
		IntNode head2 = new IntNode(9);
		head2.appendToTail(9);
		head2.appendToTail(9);
		head2.appendToTail(9);
		obj.printList(head2);
		
		System.out.print(" = ");
		obj.printList(obj.sum(head1, head2));

	}

}
