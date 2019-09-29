import java.util.ArrayList;
public class Cost {
    ArrayList<Edge> minPath;

    public Cost(){
        minPath = new ArrayList();
    }

    public ArrayList<Edge> addEdge(Edge e){
        minPath.add(e);
        return minPath;
    }

    public boolean contains(Edge e){
        for(Edge i : minPath){
            if (i == e){
                return true;
            }
        }
        return false;
    }
}