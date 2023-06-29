package Array;

import java.util.ArrayList;
import java.util.Objects;

public class MergeIntervals {
    /*
    Problem Description
    Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

    You may assume that the intervals were initially sorted according to their start times.
     */

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        public Interval(int s, int e) {
            start = s;
            end = e;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Interval other = (Interval) obj;

            return start == other.start && end == other.end;
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }

        @Override
        public String toString(){
            return "{ start: " + start + ", end: " + end + "]";
        }
    }
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        int n=intervals.size();
        int start = n-1;
        int end = 0;
        int newStart = newInterval.start;
        int newEnd = newInterval.end;
        boolean flag = false;
        if(intervals.size() == 0){
            intervals.add(0,newInterval);
            return intervals;
        }
        if(newInterval.end < intervals.get(0).start){
            intervals.add(0,newInterval);
            return intervals;
        }
        for(int i=0;i<n;i++){
            if(intervals.get(i).end >= newInterval.start){
                flag = true;
                if(start > i){
                    start = i;
                    newStart = min(newStart,intervals.get(i).start);
                }
            }
            if(intervals.get(i).start <= newInterval.end){
                if(end < i){
                    end = i;
                    newEnd = max(newEnd,intervals.get(i).end);
                }
            }
        }
        Interval in = new Interval(newStart,newEnd);
        if(flag){
            int c = start;
            for(int i=start;i<=end;i++){
                intervals.remove(c);
            }
            intervals.add(c,in);
        }
        else{
            intervals.add(n,in);
        }

        return intervals;
    }
    public int min(int a, int b){
        if(a<b){
            return a;
        }
        return b;
    }
    public int max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }
}
