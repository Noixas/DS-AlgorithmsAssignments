import java.util.Random;
import java.util.List;
import java.util.LinkedList;
public class TreeTest {
private static Node<String> createTree()
{
        Node<String> root = new Node<>("root");

        Node<String> node1 = root.addChild(new Node<String>("node 1"));

        Node<String> node11 = node1.addChild(new Node<String>("node 11"));
        Node<String> node111 = node11.addChild(new Node<String>("node 111"));
        Node<String> node112 = node11.addChild(new Node<String>("node 112"));
        Node<String> node1111 = node111.addChild(new Node<String>("node 1111"));
        Node<String> node11111 = node1111.addChild(new Node<String>("node 11111"));
        Node<String> node1112 = node111.addChild(new Node<String>("node 1112"));
        Node<String> node11121 = node1112.addChild(new Node<String>("node 11121"));

        Node<String> node1121 = node112.addChild(new Node<String>("node 1121"));
        Node<String> node1122 = node112.addChild(new Node<String>("node 1122"));

        Node<String> node12 = node1.addChild(new Node<String>("node 12"));
        Node<String> node121 = node12.addChild(new Node<String>("node 121"));
        Node<String> node122 = node12.addChild(new Node<String>("node 122"));
        Node<String> node1211 = node121.addChild(new Node<String>("node 1211"));
        Node<String> node1212 = node121.addChild(new Node<String>("node 1212"));
        Node<String> node2 = root.addChild(new Node<String>("node 2"));

        Node<String> node21 = node2.addChild(new Node<String>("node 21"));
        Node<String> node211 = node2.addChild(new Node<String>("node 22"));


        //creation unordered down here
        Node<String> node13 = node1.addChild(new Node<String>("node 13"));
        Node<String> node131 = node13.addChild(new Node<String>("node 131"));
        Node<String> node132 = node13.addChild(new Node<String>("node 132"));
        Node<String> node1311 = node131.addChild(new Node<String>("node 1311"));
        Node<String> node1312 = node131.addChild(new Node<String>("node 1312"));
        return root;
}

private static <T> Node<T> findLowestCommonParent(Node<T> a, Node<T> b)
{
        List<Node<T> > aParents = new LinkedList<Node<T> >();
        aParents.add(a);
        List<Node<T> > bParents = new LinkedList<Node<T> >();
        bParents.add(b);
        Node<T> aParent = a;
        Node<T> bParent = b;
        Node<T> commonParent = null;
        while((aParent != null || bParent != null) && commonParent == null)
        {
                if(aParent == bParent)
                        commonParent = aParent;
                else{
                        aParent = aParent.getParent();
                        aParents.add(aParent);
                        int indAinBParents = checkNodeInList(aParent, bParents);
                        if(indAinBParents > -1)
                                commonParent = aParent;
                        else{
                                bParent = bParent.getParent();
                                bParents.add(bParent);
                                int indBinAParents = checkNodeInList(bParent, aParents);
                                if(indBinAParents > -1)
                                        commonParent = bParent;
                        }
                }
        }
        return commonParent;
}
private static <T> int checkNodeInList(Node<T> node, List<Node<T> > list)
{
        for(int i = 0; i < list.size(); i++)
        {
                if(node == list.get(i))
                        return i;
        }
        return -1;
}
////////////////////////////////////////////////////////////////////
///FOR TEST PURPOSE ONLY, NOT IMPORTANT FOR ALGORITHM DOWN HERE
///////////////////////////////////////////////////////////////////
public static void runTest()
{
        Node<String> root = createTree();
        System.out.println("\n Printing Tree...");
        printTree(root, " ");

        System.out.println("\n Random Node A");
        Node<String> A = getRandomNode(root);
        System.out.println(A.getData());
        System.out.println("\n Random Node B");
        Node<String> B = getRandomNode(root);
        int rndIterations = 0;
        while(B.getData().equals(A.getData()) || rndIterations > 1000) {

                B = getRandomNode(root);
                rndIterations++;
        }
        System.out.println(B.getData());

        System.out.println("\n Common Parent: ");
        Node<String> common = findLowestCommonParent(A,B);
        System.out.println(common.getData());
}





/**
 * Get random node from tree
 * @param  Node<String> pRoot         [description]
 * @return              [description]
 */
public static Node<String> getRandomNode(Node<String> pRoot)
{
        Random rnd = new Random();
        List<Node<String> > treeInList = getTreeInList(pRoot);
        return treeInList.get(rnd.nextInt(treeInList.size()));
}
public static List<Node<String> > getTreeInList(Node<String> pNode)
{
        List<Node<String> > children = pNode.getChildren();
        for(int i = 0; i < children.size(); i++)
        {
                sumLists(children, getTreeInList(children.get(i)));
        }
        return children;
}
private static void sumLists(List<Node<String>> a, List<Node<String> > b)
{
        for(int i = 0; i < b.size(); i++)
        {
                a.add(b.get(i));
        }
}
private static <T> void printTree(Node<T> node, String appender) {
        System.out.println(appender + node.getData());
        node.getChildren().forEach(each->printTree(each, appender + appender));
}
}
