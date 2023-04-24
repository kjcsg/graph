// Edge object that is stored for each connection to another node
	class Edge
	{
		int dest, weight;
		
		public Edge(int dest,int weight)
		{
			this.dest=dest; this.weight=weight;
		}
		
		@Override
		public String toString()
		{
			return "("+dest+","+weight+")";
		}
	}