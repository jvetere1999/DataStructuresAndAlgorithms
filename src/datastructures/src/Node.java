package datastructures.src;

public class Node<T> {
    private T val;
    public Node<T> next = null;
    public Node(T _val) {
        val = _val;
    }
    public T getValue() {
        return val;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            Node<T>temp = (Node<T>) obj;
            return val.equals(temp.getValue());
        }
        return false;
    }
}
