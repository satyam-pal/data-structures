package RecursionTest;

import Recursion.TowerOfHanoi;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TowerOfHanoiTest {

    @Test
    public void testTowerOfHanoi1() {
        TowerOfHanoi solver = new TowerOfHanoi();
        int input = 1;
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 1, 3))
        ));
        Assert.assertEquals(expected, solver.towerOfHanoi(input));
    }

    @Test
    public void testTowerOfHanoi2() {
        TowerOfHanoi solver = new TowerOfHanoi();
        int input = 2;
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 1, 2)),
                new ArrayList<>(Arrays.asList(2, 1, 3)),
                new ArrayList<>(Arrays.asList(1, 2, 3))
        ));
        Assert.assertEquals(expected, solver.towerOfHanoi(input));
    }

    @Test
    public void testTowerOfHanoi3() {
        TowerOfHanoi solver = new TowerOfHanoi();
        int input = 3;
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 1, 3)),
                new ArrayList<>(Arrays.asList(2, 1, 2)),
                new ArrayList<>(Arrays.asList(1, 3, 2)),
                new ArrayList<>(Arrays.asList(3, 1, 3)),
                new ArrayList<>(Arrays.asList(1, 2, 1)),
                new ArrayList<>(Arrays.asList(2, 2, 3)),
                new ArrayList<>(Arrays.asList(1, 1, 3))
        ));
        Assert.assertEquals(expected, solver.towerOfHanoi(input));
    }

    @Test
    public void testTowerOfHanoi4() {
        TowerOfHanoi solver = new TowerOfHanoi();
        int input = 4;
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 1, 2)),
                new ArrayList<>(Arrays.asList(2, 1, 3)),
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(3, 1, 2)),
                new ArrayList<>(Arrays.asList(1, 3, 1)),
                new ArrayList<>(Arrays.asList(2, 3, 2)),
                new ArrayList<>(Arrays.asList(1, 1, 2)),
                new ArrayList<>(Arrays.asList(4, 1, 3)),
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(2, 2, 1)),
                new ArrayList<>(Arrays.asList(1, 3, 1)),
                new ArrayList<>(Arrays.asList(3, 2, 3)),
                new ArrayList<>(Arrays.asList(1, 1, 2)),
                new ArrayList<>(Arrays.asList(2, 1, 3)),
                new ArrayList<>(Arrays.asList(1, 2, 3))
        ));
        Assert.assertEquals(expected, solver.towerOfHanoi(input));
    }

    @Test
    public void testTowerOfHanoi0() {
        TowerOfHanoi solver = new TowerOfHanoi();
        int input = 0;
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        Assert.assertEquals(expected, solver.towerOfHanoi(input));
    }
}

