import java.util.*;

public class Main {
    public static void main(String[] args) {
        //int numNodes = getNumNodes();
        Graph graph = buildUp(6);
        checkConnect(graph);
    }

    /*private static int getNumNodes() {
        Scanner scan = new Scanner(System.in); //Set up scanner for user input
        int numNodes=-1; //Set up int for number of nodes
        while(numNodes<1){
            System.out.println("How many nodes are in your map? (Positive whole number): ");
            if(scan.hasNextInt()){
                numNodes = scan.nextInt();
                if(numNodes<1){
                    System.out.println("That's not a positive whole number. Try again.");
                    numNodes=-1;
                }
            }
            else{System.out.println("That's not a positive whole number. Try again.");}
        }
        return numNodes;
    }*/
    
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

    private static void checkConnect(Graph graph){
        boolean done = false;
        Scanner scan = new Scanner(System.in).useDelimiter(",|\r\n");
        while(!done){
            System.out.println("Input 2 nodes separated by comma to check connection: ");
            int first = scan.nextInt();
            int second = scan.nextInt();
            scan.nextLine();
            graph.isConnected(first, second);
            System.out.print("Do you want to check another? ");
            String ans = scan.nextLine().toLowerCase();
            if("n".equals(ans) || "no".equals(ans)){done = true;}
        }
    }
}
