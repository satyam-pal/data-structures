package Array;

public class MaximumAbsoluteDifference {
    /*
    Problem Description
    You are given an array of N integers, A1, A2, .... AN.
    Return the maximum value of f(i, j) for all 1 ≤ i, j ≤ N. f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.
     */
    public int maxArr(int[] A) {
        int Xi = 0;
        int Yi = 0;
        int Xmax = Integer.MIN_VALUE;
        int Ymax = Integer.MIN_VALUE;
        int Xmin = Integer.MAX_VALUE;
        int Ymin = Integer.MAX_VALUE;
        int n = A.length;
        for(int i=0;i<n;i++){
            int X = A[i] - i;
            int Y = A[i] + i;
            Xmax = Xmax < X? X:Xmax;
            Ymax = Ymax < Y? Y:Ymax;
            Xmin = Xmin > X? X:Xmin;
            Ymin = Ymin > Y? Y:Ymin;
        }
        return (Xmax-Xmin)>(Ymax-Ymin)?(Xmax-Xmin):(Ymax-Ymin);
    }
}
