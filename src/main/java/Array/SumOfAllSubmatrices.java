package Array;

public class SumOfAllSubmatrices {
    /*
    Problem Description
    Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.
     */

    public int solve(int[][] A) {
        int sum = 0;
        int n = A.length - 1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                sum = sum + (A[i][j]*(i+1)*(j+1)*(n-i+1)*(n-j+1));
            }
        }
        return sum;
    }
}
