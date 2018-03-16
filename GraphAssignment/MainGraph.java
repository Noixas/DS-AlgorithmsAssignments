import java.util.Random;
import java.util.List;

public class MainGraph {
public static void main(String[] args) {
        Graph g = createTest();
        printGraph(g);
}
public static Graph createTest()
{
        Random rnd = new Random();
        int amountVertex = 10;
        int amountEdge = 3;
        Graph testGraph = new Graph();
        for (int i = 0; i < amountVertex; i++ ) {
                Vertex v = new Vertex(""+i, "Vertex "+i);
                testGraph.addVertex(v);
        }
        List<Vertex> vertexList = testGraph.getVertexes();
        for (int i = 0; i < vertexList.size(); i++ ) {
                for(int j = 0; j < amountEdge; j++ ) {
                        Edge e = new Edge(""+i, vertexList.get(i), vertexList.get(rnd.nextInt(vertexList.size())),0);
                        testGraph.addEdge(e);
                }
        }
        return testGraph;
}
public static void printGraph(Graph pGraph)
{
        List<Vertex> vertexList = pGraph.getVertexes();
        List<Edge> edgeList = pGraph.getEdges();
        for (int i = 0; i < vertexList.size(); i++ ) {
          System.out.println(vertexList.get(i));
        }
        for (int i = 0; i < edgeList.size(); i++ ) {
          System.out.println(edgeList.get(i));
        }
}
}
