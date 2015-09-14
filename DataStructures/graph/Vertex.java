package graph;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This class defines a vertex in a tree. Part of implementation for graph representation using Adjacency lists
public class Vertex {
	String vertexName;
	Neighbor adjList;
	
	public Vertex(String name, Neighbor adj){
		this.vertexName = name;
		this.adjList = adj;
	}
}
