package ArrayTest;

import Array.MergeIntervals;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MergeIntervalsTest {
    MergeIntervals mergeIntervals = new MergeIntervals();

    @Test
    public void test1() {
        // Test case with empty intervals list
        ArrayList<MergeIntervals.Interval> intervals1 = new ArrayList<>();
        MergeIntervals.Interval newInterval1 = mergeIntervals.new Interval(1, 3);
        ArrayList<MergeIntervals.Interval> expected1 = new ArrayList<>();
        expected1.add(newInterval1);
        ArrayList<MergeIntervals.Interval> result1 = mergeIntervals.insert(intervals1, newInterval1);
        Assert.assertEquals(expected1, result1);
    }

    @Test
    public void test2() {
        // Test case with intervals list and new interval that can be merged
        ArrayList<MergeIntervals.Interval> intervals2 = new ArrayList<>();
        intervals2.add(mergeIntervals.new Interval(1, 2));
        intervals2.add(mergeIntervals.new Interval(4, 5));
        MergeIntervals.Interval newInterval2 = mergeIntervals.new Interval(2, 4);
        ArrayList<MergeIntervals.Interval> expected2 = new ArrayList<>();
        expected2.add(mergeIntervals.new Interval(1, 5));
        ArrayList<MergeIntervals.Interval> result2 = mergeIntervals.insert(intervals2, newInterval2);
        Assert.assertEquals(expected2, result2);
    }

    @Test
    public void test3() {
        // Test case with intervals list and new interval that cannot be merged
        ArrayList<MergeIntervals.Interval> intervals3 = new ArrayList<>();
        intervals3.add(mergeIntervals.new Interval(1, 2));
        intervals3.add(mergeIntervals.new Interval(4, 5));
        MergeIntervals.Interval newInterval3 = mergeIntervals.new Interval(3, 6);
        ArrayList<MergeIntervals.Interval> expected3 = new ArrayList<>();
        expected3.add(mergeIntervals.new Interval(1, 2));
        expected3.add(mergeIntervals.new Interval(3, 6));
        ArrayList<MergeIntervals.Interval> result3 = mergeIntervals.insert(intervals3, newInterval3);
        Assert.assertEquals(expected3,result3);
    }
}
