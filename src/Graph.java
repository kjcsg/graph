import java.util.*;

class Graph
{
	
	// An array of lists of Edge objects
	LinkedList<Edge> adjLists[];
	
	// Parameterized constructor
	public Graph(int nodes)
	{
		adjLists = new LinkedList[nodes];
		
		for(int i = 0; i<nodes; i++){ //Set up linked list for each node
			adjLists[i] = new LinkedList<>();
		}
	}
	
	// Check if node U is connected to node V
	public int isConnected(int source, int dest) //Also made it return weight int if it's connected. More efficient than making another method for weight.
	{
		int weight = 0;
		LinkedList<Edge> list = adjLists[source-1];
		for(int i = 0; i<list.size(); i++){
			if(list.get(i).dest==dest){
				weight = list.get(i).weight;
				return weight;
			}
		}
		return weight;
	}
	
	// For node U, add a new connection to node V, with weight W
	// Also add the reverse connection so our Graph is undirected
	public void addEdge(int source, int dest, int weight)
	{
		Edge edge = new Edge(dest, weight); 
		adjLists[source-1].add(edge); //Add edge from source to destination
		edge = new Edge(source, weight);
		adjLists[dest-1].add(edge); //Add edge from destination to source
	}
	
	// Override the java default toString() method so we can print
	// our Graph in the format we want
	/*@Override
	public String toString()
	{

	}*/
	
}