package BitManipulationsTest;

import BitManipulations.TwoNumberAppearOnce;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumberAppearOnceTest {

    @Test
    public void testSolve1() {
        TwoNumberAppearOnce solution = new TwoNumberAppearOnce();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 4));
        Assert.assertEquals(expected, solution.solve(input));
    }

    @Test
    public void testSolve2() {
        TwoNumberAppearOnce solution = new TwoNumberAppearOnce();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7, 5, 3, 7, 9, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 9));
        Assert.assertEquals(expected, solution.solve(input));
    }

    @Test
    public void testSolve3() {
        TwoNumberAppearOnce solution = new TwoNumberAppearOnce();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 2, 4, 8));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(6, 10));
        Assert.assertEquals(expected, solution.solve(input));
    }

    @Test
    public void testSolve4() {
        TwoNumberAppearOnce solution = new TwoNumberAppearOnce();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 5));
        Assert.assertEquals(expected, solution.solve(input));
    }

    @Test
    public void testSolve5() {
        TwoNumberAppearOnce solution = new TwoNumberAppearOnce();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5, 6, 8, 9));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 7));
        Assert.assertEquals(expected, solution.solve(input));
    }
}

