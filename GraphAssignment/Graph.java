import java.util.List;
//Note to self: Vertex is same as Node
public class Graph {
private final List<Vertex> _vertexes;
private final List<Edge> _edges;

public Graph(List<Vertex> pVertexes, List<Edge> pEdges) {
        _vertexes = pVertexes;
        _edges = pEdges;
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


}
