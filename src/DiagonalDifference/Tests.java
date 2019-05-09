package DiagonalDifference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    public void testDifference(){
        int[][] input = new int[][]{{1,2,3},{4,5,6},{9,8,9}};
        assertEquals(2, Solution.diagonalDifference(input));
    }
    @Test
    public void testDifferenceSecond(){
        int[][] input = new int[][]{{11,2,4},
                                    {4,5,6},
                                    {10,8,-12}};
        assertEquals(15, Solution.diagonalDifference(input));
    }
}
