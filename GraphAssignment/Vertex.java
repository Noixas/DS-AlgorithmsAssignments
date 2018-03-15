import java.util.List;
import java.util.ArrayList;
public class Vertex {
    final private String id;
    final private String name;
    private List<Edge> _edges;

    public Vertex(String id, String name) {
        this.id = id;
        this.name = name;
        _edges = new ArrayList<Edge>();
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void addEdge(Edge pEdge)
    {
      _edges.add(pEdge);
    }
    public List<Edge> getEdges()
    {
      return _edges;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertex other = (Vertex) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return name;
    }

}
