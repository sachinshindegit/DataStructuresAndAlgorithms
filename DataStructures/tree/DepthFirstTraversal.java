package tree;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This class implements 3 types of depth first traversals
public class DepthFirstTraversal {
	
	public void inOrderTraversal(TreeNode focusNode){
		if(focusNode != null){
			inOrderTraversal(focusNode.getLeft());
			System.out.println(focusNode.getData());
			inOrderTraversal(focusNode.getRight());
		}
	}
	
	public void preOrderTraversal(TreeNode focusNode){
		if(focusNode != null){
			System.out.println(focusNode.getData());
			inOrderTraversal(focusNode.getLeft());
			inOrderTraversal(focusNode.getRight());
		}
	}
	
	public void postOrderTraversal(TreeNode focusNode){
		if(focusNode != null){
			inOrderTraversal(focusNode.getLeft());
			inOrderTraversal(focusNode.getRight());
			System.out.println(focusNode.getData());
		}
	}
}
