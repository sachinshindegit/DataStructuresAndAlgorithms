package tree;

public class Four1 {

	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(5);
		bst.insert(9);
		bst.insert(15);
		bst.insert(2);
		bst.insert(4);
		bst.insert(0);
		bst.insert(10);
		bst.insert(12);
		
		System.out.println(bst.isTreeBalanced(bst.getRoot()));

	}

}
