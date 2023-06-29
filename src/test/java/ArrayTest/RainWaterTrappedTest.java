package ArrayTest;

import Array.RainWaterTrapped;
import org.junit.Assert;
import org.junit.Test;

public class RainWaterTrappedTest {

    @Test
    public void testTrap1() {
        RainWaterTrapped solution = new RainWaterTrapped();

        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected = 6;
        Assert.assertEquals(expected, solution.trap(heights));
    }

    @Test
    public void testTrap2() {
        RainWaterTrapped solution = new RainWaterTrapped();

        int[] heights = {4, 2, 0, 3, 2, 5};
        int expected = 9;
        Assert.assertEquals(expected, solution.trap(heights));
    }

    @Test
    public void testTrap3() {
        RainWaterTrapped solution = new RainWaterTrapped();

        int[] heights = {0, 1, 0, 2, 0, 1, 0, 3, 0, 1, 0};
        int expected = 7;
        Assert.assertEquals(expected, solution.trap(heights));
    }

    @Test
    public void testTrap4() {
        RainWaterTrapped solution = new RainWaterTrapped();

        int[] heights = {3, 1, 2, 4, 0, 1, 3, 2};
        int expected = 8;
        Assert.assertEquals(expected, solution.trap(heights));
    }

    @Test
    public void testTrap5() {
        RainWaterTrapped solution = new RainWaterTrapped();

        int[] heights = {1, 1, 1, 1, 1};
        int expected = 0;
        Assert.assertEquals(expected, solution.trap(heights));
    }
}
