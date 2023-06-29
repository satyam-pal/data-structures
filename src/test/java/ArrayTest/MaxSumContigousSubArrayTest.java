package ArrayTest;
import Array.MaxSumContigousSubArray;
import org.junit.Test;
import static org.junit.Assert.*;


public class MaxSumContigousSubArrayTest {
        MaxSumContigousSubArray maxSub = new MaxSumContigousSubArray();
        @Test
        public void testMaxSubArray_PositiveNumbers() {
            int[] arr = {1, 2, 3, 4, 5};
            int expected = 15;
            int actual = maxSub.maxSubArray(arr);
            assertEquals(expected, actual);
        }

        @Test
        public void testMaxSubArray_NegativeNumbers() {
            int[] arr = {-1, -2, -3, -4, -5};
            int expected = -1;
            int actual = maxSub.maxSubArray(arr);
            assertEquals(expected, actual);
        }

        @Test
        public void testMaxSubArray_MixedNumbers() {
            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int expected = 6;
            int actual = maxSub.maxSubArray(arr);
            assertEquals(expected, actual);
        }

        @Test
        public void testMaxSubArray_SingleElement() {
            int[] arr = {7};
            int expected = 7;
            int actual = maxSub.maxSubArray(arr);
            assertEquals(expected, actual);
        }

        @Test
        public void testMaxSubArray_EmptyArray() {
            int[] arr = {};
            int expected = Integer.MIN_VALUE;
            int actual = maxSub.maxSubArray(arr);
            assertEquals(expected, actual);
        }


}
