package ArrayTest;

import Array.SubMatrixSumQueries;
import org.junit.Assert;
import org.junit.Test;

public class SubMatrixSumQueriesTest {

    @Test
    public void testSolve_ExampleCase() {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] B = {1, 2, 1};
        int[] C = {1, 2, 3};
        int[] D = {2, 3, 3};
        int[] E = {2, 2, 3};
        int[] expected = {12, 13, 18};
        SubMatrixSumQueries subMatrixSumQueries = new SubMatrixSumQueries();

        int[] result = subMatrixSumQueries.solve(A, B, C, D, E);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testSolve_EmptyMatrix() {
        int[][] A = {};
        int[] B = {1, 2};
        int[] C = {1, 2};
        int[] D = {2, 3};
        int[] E = {2, 2};
        int[] expected = {};
        SubMatrixSumQueries subMatrixSumQueries = new SubMatrixSumQueries();

        int[] result = subMatrixSumQueries.solve(A, B, C, D, E);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testSolve_SingleElementMatrix() {
        int[][] A = {{5}};
        int[] B = {1};
        int[] C = {1};
        int[] D = {1};
        int[] E = {1};
        int[] expected = {5};
        SubMatrixSumQueries subMatrixSumQueries = new SubMatrixSumQueries();

        int[] result = subMatrixSumQueries.solve(A, B, C, D, E);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testSolve_LargeMatrix() {
        int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[] B = {1, 2};
        int[] C = {1, 2};
        int[] D = {3, 4};
        int[] E = {3, 4};
        int[] expected = {54, 99};
        SubMatrixSumQueries subMatrixSumQueries = new SubMatrixSumQueries();

        int[] result = subMatrixSumQueries.solve(A, B, C, D, E);

        Assert.assertArrayEquals(expected, result);
    }
}

