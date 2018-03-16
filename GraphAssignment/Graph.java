import java.util.List;
import java.util.ArrayList;
//Note to self: Vertex is same as Node
public class Graph {
private final List<Vertex> _vertexes;
private final List<Edge> _edges;

public Graph(List<Vertex> pVertexes, List<Edge> pEdges) {
        _vertexes = pVertexes;
        _edges = pEdges;
}
public Graph() {
        _vertexes = new ArrayList<Vertex>();
        _edges = new ArrayList<Edge>();
}
public List<Vertex> getVertexes() {
        return _vertexes;
}

public List<Edge> getEdges() {
        return _edges;
}

public boolean adjacent(String x, String y) {
        for (int i = 0; i < _edges.size(); i++) {
                Vertex source =_edges.get(i).getSource();
                if(source.getId().equals(x) || source.getId().equals(y))
                {
                        Vertex destination =_edges.get(i).getDestination();
                        if(destination.getId().equals(x) || destination.getId().equals(y))
                                return true;
                }
        }
        return false;
}

public List<Vertex> getNeighbours(String vertex) {
  List<Vertex> out = new ArrayList<Vertex>();
        for (int i = 0; i < _edges.size(); i++)
        {
            Edge edge =_edges.get(i);
          if(edge.getSource().getId().equals(vertex))
            out.add(edge.getDestination());

        }
        return null;
}
public void addVertex(Vertex pVertex)//adds the vertex x, if it is not there;
{
_vertexes.add(pVertex);
}
public void removeVertex(Vertex pVertex)//removes the vertex x, if it is there;
{
_vertexes.remove(pVertex);
}
public void addEdge(Edge pEdge)//adds the edge from the vertex x to the vertex y, if it is not there;
{
_edges.add(pEdge);
}
public void removeEdge(Edge pEdge)//removes the edge from the vertex x to the vertex y, if it is there;
{
_edges.remove(pEdge);
}

}
