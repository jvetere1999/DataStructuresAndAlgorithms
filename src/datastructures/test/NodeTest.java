package datastructures.test;

import datastructures.src.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {

    @Test
    void nodeBasic() {
        Node<Integer> n = new Node<>(1, 7);
        assertAll("Node Basics",
                () -> assertEquals(7, n.getValue(), "Value test"),
                () -> assertNull(n.next, "Next default value"),
                () -> {
                        Node<Integer> n2 = new Node<>(1, 7);
                        assertEquals(n, n2, "Overridden equals");
                },
                () -> {
                        n.next = new Node<>(2,8);
                        assertEquals(8, n.next.getValue());
                },
                () -> assertEquals(1, n.getKey()),
                () -> assertNull(n.prev),
                () -> {
                        n.prev = new Node<>(4,5, null, n);
                        assertNotNull(n.prev);
                        assertNotNull(n.prev.next);
                        assertNull(n.prev.prev);
                        n.prev.prev = n.next;
                        assertNotNull(n.prev.prev);
                }
        );
    }
}
