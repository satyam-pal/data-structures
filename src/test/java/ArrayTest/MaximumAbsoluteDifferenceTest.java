package ArrayTest;

import Array.MaximumAbsoluteDifference;
import org.junit.Assert;
import org.junit.Test;

public class MaximumAbsoluteDifferenceTest {

    @Test
    public void testMaxArr_ExampleCase() {
        int[] A = {1, 3, -1};
        int expected = 5;
        MaximumAbsoluteDifference maxArr = new MaximumAbsoluteDifference();

        int result = maxArr.maxArr(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMaxArr_AllPositiveNumbers() {
        int[] A = {5, 10, 3, 8};
        int expected = 8;
        MaximumAbsoluteDifference maxArr = new MaximumAbsoluteDifference();

        int result = maxArr.maxArr(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMaxArr_AllNegativeNumbers() {
        int[] A = {-5, -3, -8, -2};
        int expected = 7;
        MaximumAbsoluteDifference maxArr = new MaximumAbsoluteDifference();

        int result = maxArr.maxArr(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMaxArr_MixedNumbers() {
        int[] A = {2, -1, 6, 3, -5};
        int expected = 13;
        MaximumAbsoluteDifference maxArr = new MaximumAbsoluteDifference();

        int result = maxArr.maxArr(A);

        Assert.assertEquals(expected, result);
    }

}
