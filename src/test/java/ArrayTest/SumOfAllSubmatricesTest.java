package ArrayTest;

import Array.SumOfAllSubmatrices;
import org.junit.Assert;
import org.junit.Test;

public class SumOfAllSubmatricesTest {

    @Test
    public void testSolve_ExampleCase() {
        int[][] A = {{1, 2}, {3, 4}};
        int expected = 40;
        SumOfAllSubmatrices sumOfAllSubmatrices = new SumOfAllSubmatrices();

        int result = sumOfAllSubmatrices.solve(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSolve_SingleElementMatrix() {
        int[][] A = {{5}};
        int expected = 5;
        SumOfAllSubmatrices sumOfAllSubmatrices = new SumOfAllSubmatrices();

        int result = sumOfAllSubmatrices.solve(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSolve_EmptyMatrix() {
        int[][] A = {};
        int expected = 0;
        SumOfAllSubmatrices sumOfAllSubmatrices = new SumOfAllSubmatrices();

        int result = sumOfAllSubmatrices.solve(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSolve_LargeMatrix() {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int expected = 500;
        SumOfAllSubmatrices sumOfAllSubmatrices = new SumOfAllSubmatrices();

        int result = sumOfAllSubmatrices.solve(A);

        Assert.assertEquals(expected, result);
    }
}

