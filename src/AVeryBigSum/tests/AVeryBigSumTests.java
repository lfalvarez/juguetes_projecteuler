package AVeryBigSum.tests;
import AVeryBigSum.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AVeryBigSumTests {
    @Test
    public void shouldSumLongs(){

        long[] input = new long[]{1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L};
        assertEquals(5000000015L, Solution.aVeryBigSum(input));
    }
}
