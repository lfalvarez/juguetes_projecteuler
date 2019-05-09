package BirthdayCakeCandles.tests;

import BirthdayCakeCandles.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTests {
    @Test
    public void shouldReturnTheNumberOfTheTallestCandlesToBeBlown(){
        int[] input = new int[]{3,2,1,3};
        assertEquals(2, Solution.birthdayCakeCandles(input));

    }
}
