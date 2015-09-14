package graph;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This class defines a neighbor in a tree. Part of implementation for graph representation using Adjacency lists
public class Neighbor {
	int vertexNumber;
	Neighbor next;
	
	public Neighbor(int vertexNum, Neighbor next){
		this.vertexNumber = vertexNum;
		this.next = next;
	}
}
