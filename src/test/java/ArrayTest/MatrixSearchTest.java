package ArrayTest;

import Array.MatrixSearch;
import org.junit.Assert;
import org.junit.Test;

public class MatrixSearchTest {

    @Test
    public void testMatrixSearch_Positive() {
        MatrixSearch matrixSearch = new MatrixSearch();

        // Test case with B present in the matrix
        int[][] matrix1 = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };
        int target1 = 9;
        int expected1 = 2 * 1009 + 2;
        int result1 = matrixSearch.solve(matrix1, target1);
        Assert.assertEquals(expected1, result1);

        // Test case with B at the first position in the matrix
        int[][] matrix2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int target2 = 10;
        int expected2 = 1 * 1009 + 1;
        int result2 = matrixSearch.solve(matrix2, target2);
        Assert.assertEquals(expected2, result2);
    }

    @Test
    public void testMatrixSearch_Negative() {
        MatrixSearch matrixSearch = new MatrixSearch();

        // Test case with B not present in the matrix
        int[][] matrix = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}
        };
        int target = 5;
        int expected = -1;
        int result = matrixSearch.solve(matrix, target);
        Assert.assertEquals(expected, result);
    }
}

