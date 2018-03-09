import java.util.ArrayList;
import java.util.List;

public class Node<T> {

	private T data = null;

	private List<Node<T>> children = new ArrayList<>();

	private Node<T> parent = null;

	public Node(T pData) {
		this.data = pData;
	}

	public Node getRoot() {
		Node<T> root = this;
    Node<T> cache = parent;
    while(cache != null){
      root = cache;
      cache = parent.getParent();
  }
  return root;
	}

	public Node<T> addChild(Node<T> pChild) {
		 children.add(pChild);
     return pChild;
	}

	public void addChildren(List<Node<T>> pChildren) {
		for(int i = 0; i < pChildren.size(); i++)
    {
      children.add(pChildren.get(i));
    }
	}

	public List<Node<T>> getChildren() {
    return children;
	}

	public T getData() {
		return data;
	}

	public void setData(T pData) {
		data = pData;
	}

	private void setParent(Node<T> pParent) {
    parent = pParent;
	}

	public Node<T> getParent() {
		return parent;
	}

}
