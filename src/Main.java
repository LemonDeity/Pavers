import java.util.Scanner;
        import java.util.ArrayList;
        import java.io.IOException;
        import java.io.File;
public class Main {

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new File("pavers.dat"));
        /*t number of test cases (1 ≤ t ≤ 100)
        p price to pave one furlong of street (positive integer)
        n number of main buildings in the town (1 ≤ n ≤ 1,000)
        m number of streets in the town (1 ≤ m ≤ 300,000)
        a b c street from building a to building b with length c
                (lengths are given in furlongs and the buildings are numbered from 1 to n)*/

        /*1
        2
        5
        7
        1 2 1
        2 3 2
        2 4 6
        5 2 1
        5 1 3
        4 5 2
        3 4 3*/

        //output 12

        int NUM_TESTS = input.nextInt();
        input.nextLine();
        //for within for loop when implementing tests
        Graph graph = new Graph();
        int PRICE = input.nextInt();
        input.nextLine();

        int NUM_BUILDING = input.nextInt();
        input.nextLine();

        int NUM_STREET = input.nextInt();
        input.nextLine();
        //this will go through all connections
        for (int i = 0; i < NUM_STREET; i++) {
            String[] nums =input.nextLine().split(" ");
            int one = Integer.parseInt(nums[0]);
            int two = Integer.parseInt(nums[1]);
            int cost = Integer.parseInt(nums[2]);
            //This if statement is to prevent same buildings connecting to themselves
            if (one != two){
                if (!graph.contains(one)){
                    graph.addNodeNoQ(new Node(one));
                }
                if (!graph.contains(two)){
                    graph.addNodeNoQ(new Node(two));
                }

                Edge edge = new Edge(graph.getNode(one),graph.getNode(two),cost);

                graph.getNode(one).addConn(edge);
                graph.getNode(two).addConn(edge);
            }


        }
        ArrayList<NodeCost>list = graph.createCost();
        System.out.println(graph.Graph_COST*PRICE);

    }
}
