package SimpleArraySum.tests;

import SimpleArraySum.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTests {
    @Test
    public void shouldSumArray(){
        int[] summable = new int[]{1,2,3};
        int expectedResult = Solution.simpleArraySum(summable);
        assertEquals(expectedResult, 6);
    }

}
