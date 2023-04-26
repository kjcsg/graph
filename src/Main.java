import java.util.*;

public class Main {
    public static void main(String[] args) {
        Graph graph = buildUp(6); //We know we have 6 stations, so build a map with 6 nodes
        routeCalc(graph);
    }
    
    private static Graph buildUp(int numNodes){ //Build the map with times
        Graph graph = new Graph(numNodes);
        graph.addEdge(2,1,38);
        graph.addEdge(1,4,11);
        graph.addEdge(1,5,19);
        graph.addEdge(1,3,35);
        graph.addEdge(4,3,27);
        graph.addEdge(3,5,28);
        graph.addEdge(3,6,13);
        graph.addEdge(5,6,26);
        return graph;
    }

    private static void routeCalc(Graph graph) {
        Scanner scan = new Scanner(System.in).useDelimiter(",|\r\n"); //Set up scanner for user input
        List<Integer> path = new ArrayList<Integer>(); //Set up int list for node traversal plan from user
        boolean done = false; //So that the user can input as many nodes as they want
        int input = 0;
        int time = 0;
        int curpos = 0;
        while(!done){
            System.out.print("Please enter your route plan separated by commas, enter blank entry when done: ");
            if(scan.hasNextInt()){ //Checks for an int input
                input = scan.nextInt();
                if(0<input && input<7){ //Checks that the int is within the number of nodes
                    if(path.isEmpty()){path.add(input);} //If the path list is empty, just add the input to the list
                    else if(path.size()>0 && (graph.isConnected(path.get(curpos),input)>0)){ //If the path list isn't empty, check for the nodes being connected
                        path.add(input); //Add the new node to the path list
                        time+=graph.isConnected(path.get(curpos),input); //Add the time for this segment to total time
                        curpos++; //Increase the tracker for position in the path list
                    }
                    else if(path.size()>0 && (graph.isConnected(path.get(curpos),input)==0)){ //If the nodes aren't connected
                        System.out.println("Station "+input+" is not connected to station "+path.get(curpos)); //Yell at 'em ;P
                    }
                }
                else{System.out.println("That station doesn't exist.");} //If the node doesn't exist, yell at 'em ;P
            }
            else{
                scan.nextLine(); //Clears out scanner
                done = true; //User is done with inputs
            }
        }
        scan.close(); //Prevent memory leaks

        System.out.println("The total travel time for "+path+" is "+time+" minutes."); //Show and tell
    }
}
