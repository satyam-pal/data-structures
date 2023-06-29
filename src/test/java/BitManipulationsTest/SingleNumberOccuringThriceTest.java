package BitManipulationsTest;

import BitManipulations.SingleNumberOccuringThrice;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SingleNumberOccuringThriceTest {

    @Test
    public void testSingleNumber1() {
        SingleNumberOccuringThrice solution = new SingleNumberOccuringThrice();

        List<Integer> nums = Arrays.asList(1, 2, 2, 2, 3, 3, 3);
        int expected = 1;
        Assert.assertEquals(expected, solution.singleNumber(nums));
    }

    @Test
    public void testSingleNumber2() {
        SingleNumberOccuringThrice solution = new SingleNumberOccuringThrice();

        List<Integer> nums = Arrays.asList(4, 4, 4, 1, 2, 2, 2);
        int expected = 1;
        Assert.assertEquals(expected, solution.singleNumber(nums));
    }

    @Test
    public void testSingleNumber3() {
        SingleNumberOccuringThrice solution = new SingleNumberOccuringThrice();

        List<Integer> nums = Arrays.asList(7, 9, 9, 9, 4, 7, 7);
        int expected = 4;
        Assert.assertEquals(expected, solution.singleNumber(nums));
    }

    @Test
    public void testSingleNumber4() {
        SingleNumberOccuringThrice solution = new SingleNumberOccuringThrice();

        List<Integer> nums = Arrays.asList(5, 3, 3, 3, 2, 5, 2, 2);
        int expected = 5;
        Assert.assertEquals(expected, solution.singleNumber(nums));
    }

    @Test
    public void testSingleNumber5() {
        SingleNumberOccuringThrice solution = new SingleNumberOccuringThrice();

        List<Integer> nums = Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 4);
        int expected = 4;
        Assert.assertEquals(expected, solution.singleNumber(nums));
    }
}
