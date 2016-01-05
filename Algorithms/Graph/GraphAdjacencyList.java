package Graph;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
 
public class GraphAdjacencyList 
{
   /* Makes use of Map collection to store the adjacency list for each vertex.*/
    private  Map<Integer, List<Integer>> Adjacency_List;	
    public Vertex[] vertexList;
    
    public GraphAdjacencyList(int number_of_vertices)
    {
        Adjacency_List = new HashMap<Integer, List<Integer>>();	
        vertexList = new Vertex[number_of_vertices];
        
        for (int i = 1 ; i <= number_of_vertices ; i++)
        { 
            Adjacency_List.put(i, new LinkedList<Integer>());
        }
    }
 
 
    /* Adds nodes in the Adjacency list for the corresponding vertex */
    public void setEdge(int source , int destination)
    {
       if (source > Adjacency_List.size() || destination > Adjacency_List.size())
       {
           System.out.println("the vertex entered in not present ");
           return;
       }
       List<Integer> slist = Adjacency_List.get(source);
       slist.add(destination);
       List<Integer> dlist = Adjacency_List.get(destination);
       dlist.add(source);
   }
 
   /* Returns the List containing the vertex joining the source vertex */		
    public List<Integer> getEdge(int source)
    {
        if (source > Adjacency_List.size())
        {
            System.out.println("the vertex entered is not present");
            return null;
        }
        return Adjacency_List.get(source);
    }
    
    
    public int getUnvisitedVertex(int source){
    	LinkedList list = (LinkedList)Adjacency_List.get((Integer)source);
    	ListIterator iterator = list.listIterator();
    	int index=0;
    	while(iterator.hasNext()){
    		index = (Integer)iterator.next();
    		if(!vertexList[index].isVisited){
    			return index;
    		}
    	}
    	return -1;
    }
    
    
    
    public void dfs(int sourceIndex){
    	Stack stack = new Stack();
    	vertexList[sourceIndex].isVisited = true;
    	stack.push(sourceIndex);
    	
    	while(!stack.isEmpty()){
    		int vertexIndex = getUnvisitedVertex((Integer)stack.peek());
    		
    		if(vertexIndex == -1){
    			stack.pop();
    		}else{
    			vertexList[vertexIndex].isVisited = true;
    			stack.push(vertexIndex);
    		}
    	}
    }
    
    public void bfs(int sourceIndex){
    	Queue queue = new LinkedList();
    	vertexList[sourceIndex].isVisited = true;
    	queue.add(sourceIndex);
    	
    	while(queue.isEmpty()){
    		int vertexIndex = (Integer)queue.remove();
    		int unvisitedIndex = getUnvisitedVertex(vertexIndex);
    		if(unvisitedIndex != -1){
    			vertexList[unvisitedIndex].isVisited = true;
    			queue.add(unvisitedIndex);
    		}
    	}
    }

    	
    // A graph consists of various components which are connected sub graphs of a large graph
    public int numberOfGraphComponents(){
    	int numberOfComponents=0;
    	// starting from 0th vertex in the vertex List
    	for(int i=0;i<vertexList.length;i++){
    		if(!vertexList[i].isVisited){
    			bfs(i);
    			numberOfComponents++;
    		}
    	}
    	return numberOfComponents;
    }
    
}   