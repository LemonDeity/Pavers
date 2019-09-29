import java.util.ArrayList;
public class Node {
    int name;
    ArrayList<Edge> edges;
    public Node(int n){
        name = n;
        edges = new ArrayList();
    }
    //returns the ArrayList of edges
    public ArrayList<Edge> getEdges(){
        return edges;
    }

    public ArrayList<NodeCost>updateCostList(ArrayList<NodeCost> list){
        int i = 0;
        for(NodeCost node : list){
            for(Edge e : edges){
                if (e.getOther(this) == node.n){
                    //this means the node and the edge it is connected to is the same
                    if (e.length < node.cost){
                        list.get(i).changeCost(e.length);
                    }
                }
            }
            i++;
        }
        return list;
    }

    public String toString(){
        String str = "";
        str += name+" : ";
        for(Edge e : edges){
            str += e.otherPrint(name)+"\n";
        }
        return str;
    }

    public int getName(){
        return name;
    }

    public ArrayList<Edge> addConn(Edge e){
        edges.add(e);
        return edges;
    }

}
