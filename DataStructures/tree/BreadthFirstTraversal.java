package tree;

import java.util.Queue;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This class implements traversal of a binary tree using breadth first or level order traversal technique
public class BreadthFirstTraversal {
	
	public void traverse(TreeNode root){
		MyIntQueue queue = new MyIntQueue();
		if(root==null){
			return;
		}
		queue.insert(root);
		while(!queue.isEmpty()){
			TreeNode temp = (TreeNode)queue.peek();
			System.out.print(" "+temp.getData()+" ");
			if(temp.getLeft()!=null){
				queue.insert(temp.getLeft());
			}
			if(temp.getRight()!=null){
				queue.insert(temp.getRight());
			}
			queue.remove();
		}
	}
	
	public static void main(String args[]){
		BST bst = new BST();
		bst.insert(5);
		bst.insert(9);
		bst.insert(15);
		bst.insert(2);
		bst.insert(4);
		bst.insert(0);
		bst.insert(10);
		bst.insert(12);
		
		BreadthFirstTraversal b = new BreadthFirstTraversal();
		b.traverse(bst.getRoot());
		System.out.println();
		System.out.println("height: "+bst.getHeight(bst.getRoot()));
		
		
	}
}
