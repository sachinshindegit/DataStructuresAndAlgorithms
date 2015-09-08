package stacksAndQueue;

public class Three5 {

	public static void main(String[] args) {
		QueueUsingStacks s = new QueueUsingStacks();
		s.insert("First");
		s.insert("second");
		s.insert("third");
		s.insert("fourth");
		
		System.out.println(s.remove());
		System.out.println(s.remove());
		System.out.println(s.remove());
		

	}

}
