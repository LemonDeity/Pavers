import java.util.ArrayList;
public class Graph {
    ArrayList<Node> graph;
    int Graph_COST;
    public Graph(){
        graph = new ArrayList<>();
        Graph_COST = -1;
    }

    public ArrayList<Node> addNode(Node n){
        if (!contains(n)){
            graph.add(n);
        }
        return graph;
    }
    //Add Node no Questions asked assumes the node is not in the graph already
    public ArrayList<Node> addNodeNoQ(Node n){
        graph.add(n);
        return graph;
    }

    public boolean contains(Node n){
        for(Node j : graph){
            if (j == n){
                return true;
            }
        }
        return false;
    }

    public boolean contains(int n){
        for(Node j : graph){
            if (j.name == n){
                return true;
            }
        }
        return false;
    }

    public Node getNode(int n){
        for(Node j : graph){
            if (j.name == n){
                return j;
            }
        }
        return null;
    }

    public int getMinCost(){
        //Go through Array list of Nodes
        //Choose least cost edge
        int min = 0;
        for(Node n : graph){
            
        }

        return -1;
    }

    private ArrayList<NodeCost> getCostList(){
        ArrayList<NodeCost> cost = new ArrayList<>();
        for(Node n : graph){
            cost.add(new NodeCost(n));
        }
        return cost;
    }
    //creates the actual list with least cost
    public ArrayList<NodeCost> createCost(){
        ArrayList<NodeCost>cost = this.getCostList();
        //go through list graph and update list
        for(Node node : graph){
            node.updateCostList(cost);
        }
        Graph_COST = -cost.get(0).cost;
        for(NodeCost node : cost){
            Graph_COST += node.cost;
        }
        return cost;
    }

    public String toString(){
        String str = "";
        for(Node n : graph){
            str += n;
        }
        return str;
    }

}
