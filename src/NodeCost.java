public class NodeCost {
    Node n;
    int cost;
    public NodeCost(Node n){
        this.n = n;
        cost = Integer.MAX_VALUE;
    }

    public int getCost(){
        return cost;
    }

    public Node getN(){
        return n;
    }

    public void changeCost(int cost){
        this.cost = cost;
    }
    //this returns true if the node is the same
    public boolean check(Node n){
        if (this.n == n){
            return true;
        }
        return false;
    }
}
