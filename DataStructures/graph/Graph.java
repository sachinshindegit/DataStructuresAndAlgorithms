package graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This class defines a graph
// Representation using adjacency lists
// Uses array to store the list of vertices names

// Takes input form a file as follows

/*
 * File:
 * 10 // represents number of vertices
 * 
 * sara
 * ajay
 * sam
 * mira
 * jane
 * sean    // till here vertices names
 * sara ajay
 * sara sam
 * mira sam
 * sean sam
 * mira jane  // till here represents edges
 */


public class Graph {
	Vertex[] verticesList;
	boolean isDirected;
	
	public Graph(String fileName, boolean isDirected) throws FileNotFoundException{
		this.isDirected = isDirected;
		
		Scanner sc = new Scanner(new File(fileName));
		verticesList = new Vertex[sc.nextInt()];
		
		// reading the file and populating the vertices list
		for(int i=0;i<verticesList.length;i++){
			verticesList[i] = new Vertex(sc.next(), null);
		}
		
		// populating the edges
		while(sc.hasNext()){
			int v1 = findVertexIndex(sc.next());
			int v2 = findVertexIndex(sc.next());
			
			verticesList[v1].adjList = new Neighbor(v2, verticesList[v1].adjList);
			if(!this.isDirected){
				verticesList[v2].adjList = new Neighbor(v1,verticesList[v2].adjList);
			}
			
		}
		sc.close();
	}
	
	// finds the index of the vertex from the vertexList
	public int findVertexIndex(String vertexName){
		for(int i=0; i < this.verticesList.length; i++){
			if(verticesList[i].vertexName.equalsIgnoreCase(vertexName)){
				return i;
			}
		}
		return -1;
	}
	
	//  to print the graph
	public void print(){
		System.out.println();
		for(int i=0;i<this.verticesList.length;i++){
			System.out.print(verticesList[i].vertexName);
			for(Neighbor nbr=this.verticesList[i].adjList; nbr!=null; nbr=nbr.next){
				System.out.print(" --> "+ verticesList[nbr.vertexNumber].vertexName);
			}
			System.out.println("\n");
		}
	}
}
