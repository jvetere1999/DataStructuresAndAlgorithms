package datastructures.src;

public class Node<V> {

    private final int key;
    private final V val;

    public Node<V> prev = null;
    public Node<V> next = null;

    public Node(int _key, V _val) {
        key = _key;
        val = _val;
    }
    public Node(int _key, V _val, Node<V> _prev, Node<V> _next) {
        key     = _key;
        val     = _val;
        prev    = _prev;
        next    = _next;
    }

    public int getKey() {
        return key;
    }
    public V getValue() {
        return val;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            Node<V>temp = (Node<V>) obj;
            return temp.getKey() == key;
        }
        return false;
    }

    @Override
    public String toString() {
        return "{" + key + " | " + val + "}";
    }
}
