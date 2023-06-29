package Array;

public class RainWaterTrapped {

    /*
    Problem Description
    Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
     */


    public int trap(final int[] A) {
        int n = A.length;
        int[] pm = new int[n];
        int[] sm = new int[n];
        int max = A[0];
        int rmax= A[n-1];

        for(int i=0;i<n;i++){
            if(max<A[i]){
                max = A[i];
            }
            if(rmax<A[n-1-i]){
                rmax = A[n-1-i];
            }
            pm[i] = max;
            sm[n-1-i] = rmax;
        }
        int res = 0;
        for(int i=1;i<n-1;i++){
            int wl = Math.min(pm[i-1],sm[i+1]);
            res = res + Math.max(0,wl-A[i]);
        }
        return res;
    }
}
