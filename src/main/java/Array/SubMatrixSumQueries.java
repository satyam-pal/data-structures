package Array;

public class SubMatrixSumQueries {
    /*
    Problem Description
    Given a matrix of integers A of size N x M and multiple queries Q, for each query, find and return the submatrix sum.

    Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.
     */
    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int n = A.length;
        if (n == 0) {
            return new int[0];
        }
        int m = A[0].length;
        long sum[][] = new long[n][m];
        for(int i=0;i<n;i++){
            long s = 0;
            for(int j=0;j<m;j++){
                s = s+A[i][j];
                s= s%1000000007;
                sum[i][j] = s;
            }
        }
        for(int i=0;i<m;i++){
            long s = 0;
            for(int j=0;j<n;j++){
                s = s+sum[j][i];
                s= s%1000000007;
                sum[j][i] = s;
            }
        }
        int[] res = new int[C.length];
        for(int i=0;i<C.length;i++){
            int a = B[i]-1;
            int b = C[i]-1;
            int c = D[i]-1;
            int d = E[i]-1;
            Long temp;
            if(a == 0 && b==0) temp = sum[c][d];
            else if(a == 0) temp = sum[c][d] - sum[c][b-1];
            else if(b == 0) temp = sum[c][d] - sum[a-1][d];
            else temp = sum[c][d] - sum[a-1][d] - sum[c][b-1] + sum[a-1][b-1];
            System.out.print("(["+sum[c][d]+"],"+a+","+b+","+c+","+d+")");
            res[i] = temp.intValue();
        }
        return res;
    }
}
