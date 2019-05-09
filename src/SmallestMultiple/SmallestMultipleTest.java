package SmallestMultiple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestMultipleTest {
    @Test
    public void shouldReturn2520From1To10() {
        SmallestDividerFinder finder = new SmallestDividerFinder();
        int smallest = finder.findSmallestDividerFor(1, 10);
        assertEquals(2520, smallest);
    }
}
