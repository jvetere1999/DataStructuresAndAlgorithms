package datastructures.test;

import datastructures.src.Linked;
import datastructures.src.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LLTest {

    @Test
    public void LLBasic() {
        Linked<Integer> l = new Linked<>();
        assertAll("LL Basics",
                () -> assertEquals(0, l.size),
                () -> {
                    l.add(1, 3);
                    assertEquals(3, l.head.getValue());
                    assertEquals(1, l.size);
                    l.add(1, 5);
                    assertEquals(5, l.head.getValue());
                }
                );
    }
}
