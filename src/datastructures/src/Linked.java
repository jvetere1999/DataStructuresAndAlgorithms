package datastructures.src;

public class Linked<V> {
    public int size = 0;
    public  Node<V> head;

    public Linked() {

    }

    public void add(int k, V v) {
        if (size == 0) {
            head = new Node<V>(k, v);
        }
        else {
            Node<V> pointer = find_spot(k, v);

            if (pointer != head) {
                Node<V> temp = pointer.prev;
                temp.next = new Node<V>(k, v, temp, pointer);
            }
            else
                head = new Node<>(k, v, null, head.next);
        }
        size++;
    }
    Node<V> replace(int k, V v, Node<V> pointer) {
        Node<V> temp = pointer.prev;
        return new Node<V>(k, v, temp, pointer);
    }

    Node<V> find_spot(int k, V v) {
        Node<V> pointer = head;
        while (pointer.getKey() < k) {
            pointer = pointer.next;
        }
        return pointer;
    }

}
