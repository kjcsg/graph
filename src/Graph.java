import java.util.*;

class Graph
{
	
	// An array of lists of Edge objects
	LinkedList<Edge> G[];
	
	// Parameterized constructor
	public Graph(int n)
	{
		G = new LinkedList[n];

	}
	
	// Check if node U is connected to node V
	public boolean isConnected(int u,int v)
	{

	}
	
	// For node U, add a new connection to node V, with weight W
	// Also add the reverse connection so our Graph is undirected
	public void addEdge(int u,int v,int w)
	{
		 
	}
	
	// Override the java default toString() method so we can print
	// our Graph in the format we want
	@Override
	public String toString()
	{

	}
	
}

	
	
	
	
	
	
	
	
}