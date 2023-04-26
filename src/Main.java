import java.util.*;

public class Main {
    public static void main(String[] args) {
        //int numNodes = getNumNodes();
        Graph graph = buildUp(6);
        routeCalc(graph);
    }
    
    private static Graph buildUp(int numNodes){
        Graph graph = new Graph(numNodes);
        graph.addEdge(2,1,28);
        graph.addEdge(1,4,11);
        graph.addEdge(1,5,19);
        graph.addEdge(1,3,35);
        graph.addEdge(4,3,27);
        graph.addEdge(3,5,28);
        graph.addEdge(3,6,13);
        graph.addEdge(5,6,26);
        return graph;
    }

    /*private static void calcTime(Graph graph){
        int totalTime = graph.adjLists
    }*/

    private static void routeCalc(Graph graph) {
        Scanner scan = new Scanner(System.in).useDelimiter(",|\r\n"); //Set up scanner for user input
        List<Integer> path = new ArrayList<Integer>(); //Set up int list for node traversal plan from user
        System.out.println("Please enter your route plan separated by commas: ");
        while(scan.hasNextInt()){
            if(scan.hasNextInt()){
                path.add(scan.nextInt());
                scan.hasNextInt();
            }
            else{
                scan.nextLine(); //Clears out scanner
            }
        }
        scan.close();

        int weight = 0;
        for (int node = 0; node<path.size(); node++) {
            if(graph.isConnected(path.get(node),path.get(node+1))>0){
                weight+=graph.isConnected(path.get(node),path.get(node+1));
            }
        }
        System.out.println("The total travel time for "+path+" is "+weight+" minutes.");
    }
}
