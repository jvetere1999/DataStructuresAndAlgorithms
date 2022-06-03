package datastructures.test;

import datastructures.src.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {

    @Test
    void nodeBasic() {
        Node<Integer> n = new Node<>(7);
        assertAll("Node Basics",
                () -> assertEquals(7, n.getValue(), "Value test"),
                () -> assertNull(n.next, "Next default value"),
                () -> {
                        Node<Integer> n2 = new Node<>(7);
                        assertEquals(n, n2, "Overridden equals");
                }
        );
    }
}
