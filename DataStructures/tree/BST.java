package tree;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This class defines a binary search tree
public class BST {
	private TreeNode root;
	
	
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public void insert1(int data)
    {
        root = insertRecursively(root, data);
    }
	
	/* Function to insert data recursively */
    private TreeNode insertRecursively(TreeNode node, int data)
    {
        if (node == null)
            node = new TreeNode(data);
        else
        {
            if (data <= node.getData())
                node.setLeft(insertRecursively(node.getLeft(), data));
            else
                node.setRight(insertRecursively(node.getRight(), data));
        }
        return node;
    }	
	// To insert an element in the tree
	public void insert(int data){
		TreeNode node = new TreeNode(data);
		if(this.root==null){
			this.root = node;
		}
		else{
			TreeNode holderNode = root;
			TreeNode currentNode = root;
			while(currentNode!=null){
				holderNode = currentNode;
				if(data < currentNode.getData()){
					currentNode = currentNode.getLeft();
				}
				else if(data > currentNode.getData()){
					currentNode = currentNode.getRight();
				}
			}
			if(data < holderNode.getData()){
				holderNode.setLeft(node);
			}
			else{
				holderNode.setRight(node);
			}
		}
	}
	
	// To find a node
	
	public TreeNode findNode(int val){
		TreeNode currentNode = root;
		while(currentNode.getData() != val){
			if(val < currentNode.getData()){
				currentNode = currentNode.getLeft();
			}
			else if(val > currentNode.getData()){
				currentNode = currentNode.getRight();
			}
			
			if(currentNode == null){
				return null;
			}
		}
		return currentNode;
	}
}
