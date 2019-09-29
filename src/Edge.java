public class Edge {
    Node a,b;
    //the distance between the two nodes
    int length;
    public Edge(Node a, Node b, int l){
        this.a = a;
        this.b = b;
        length = l;
    }

    public int getLength(){
        return length;
    }

    public Node getA(){
        return a;
    }

    public Node getB(){
        return b;
    }
    //returns the other node
    public Node getOther(Node n){
        if (n == a){
            return b;
        }
        return a;
    }

    public String toString(){
        return ""+a.name+" , "+b.name+" Cost : "+length;
    }

    public String otherPrint(int n){
        String str = "";
        if (n == a.name){
            //this means run b
            str += b.name;
        }else{
            //this means run a
            str += a.name;
        }
        str += " : "+length;
        return str;
    }
    //This checks whether or not the edge inputted has the same value or is a copy essentially

    //Implement later
    public boolean check(Edge e){
        return false;
    }

}
