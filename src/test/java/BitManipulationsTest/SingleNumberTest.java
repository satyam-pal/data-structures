package BitManipulationsTest;

import BitManipulations.SingleNumber;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SingleNumberTest {

    @Test
    public void testSingleNumber1() {
        SingleNumber solution = new SingleNumber();

        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 1);
        int expected = 3;
        Assert.assertEquals(expected, solution.singleNumber(nums));
    }

    @Test
    public void testSingleNumber2() {
        SingleNumber solution = new SingleNumber();

        List<Integer> nums = Arrays.asList(4, 1, 2, 1, 2);
        int expected = 4;
        Assert.assertEquals(expected, solution.singleNumber(nums));
    }

    @Test
    public void testSingleNumber3() {
        SingleNumber solution = new SingleNumber();

        List<Integer> nums = Arrays.asList(7, 9, 9, 4, 7);
        int expected = 4;
        Assert.assertEquals(expected, solution.singleNumber(nums));
    }

    @Test
    public void testSingleNumber4() {
        SingleNumber solution = new SingleNumber();

        List<Integer> nums = Arrays.asList(5, 3, 2, 5, 2);
        int expected = 3;
        Assert.assertEquals(expected, solution.singleNumber(nums));
    }

    @Test
    public void testSingleNumber5() {
        SingleNumber solution = new SingleNumber();

        List<Integer> nums = Arrays.asList(1, 1, 2, 2, 3);
        int expected = 3;
        Assert.assertEquals(expected, solution.singleNumber(nums));
    }
}

