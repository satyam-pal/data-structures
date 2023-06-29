package Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ContinuousSumQueryTest {
    @Test
    public void testSolve_ExampleCase() {
        int numContinuousSumQuery = 5;
        int[][] coinDistribution = {{1, 3, 2}, {2, 4, 1}};
        int[] expected = {2, 3, 3, 1, 0};
        ContinuousSumQuery ContinuousSumQuery = new ContinuousSumQuery();

        int[] result = ContinuousSumQuery.solve(numContinuousSumQuery, coinDistribution);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testSolve_SingleDistribution() {
        int numContinuousSumQuery = 3;
        int[][] coinDistribution = {{2, 3, 5}};
        int[] expected = {0, 5, 5};
        ContinuousSumQuery ContinuousSumQuery = new ContinuousSumQuery();

        int[] result = ContinuousSumQuery.solve(numContinuousSumQuery, coinDistribution);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testSolve_EmptyDistribution() {
        int numContinuousSumQuery = 4;
        int[][] coinDistribution = {};
        int[] expected = {0, 0, 0, 0};
        ContinuousSumQuery ContinuousSumQuery = new ContinuousSumQuery();

        int[] result = ContinuousSumQuery.solve(numContinuousSumQuery, coinDistribution);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testSolve_SingleBeggar() {
        int numContinuousSumQuery = 1;
        int[][] coinDistribution = {{1, 1, 10}, {1, 1, 5}};
        int[] expected = {15};
        ContinuousSumQuery ContinuousSumQuery = new ContinuousSumQuery();

        int[] result = ContinuousSumQuery.solve(numContinuousSumQuery, coinDistribution);

        Assert.assertArrayEquals(expected, result);
    }
}
