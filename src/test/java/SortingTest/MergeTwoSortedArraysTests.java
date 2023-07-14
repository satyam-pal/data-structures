package SortingTest;

import Sorting.MergeTwoSortedArrays;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArraysTests {
    @Test
    public void testMergeTwoSortedArrays1() {
        MergeTwoSortedArrays merger = new MergeTwoSortedArrays();
        List<Integer> A = Arrays.asList(1, 3, 5);
        List<Integer> B = Arrays.asList(2, 4, 6);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Assert.assertEquals(expected, merger.solve(A, B));
    }

    @Test
    public void testMergeTwoSortedArrays2() {
        MergeTwoSortedArrays merger = new MergeTwoSortedArrays();
        List<Integer> A = Arrays.asList(1, 2, 3);
        List<Integer> B = Arrays.asList(4, 5, 6);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Assert.assertEquals(expected, merger.solve(A, B));
    }

    @Test
    public void testMergeTwoSortedArrays3() {
        MergeTwoSortedArrays merger = new MergeTwoSortedArrays();
        List<Integer> A = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> B = Arrays.asList(6, 7, 8, 9, 10);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertEquals(expected, merger.solve(A, B));
    }

    @Test
    public void testMergeTwoSortedArraysEmpty() {
        MergeTwoSortedArrays merger = new MergeTwoSortedArrays();
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        Assert.assertEquals(expected, merger.solve(A, B));
    }
}

