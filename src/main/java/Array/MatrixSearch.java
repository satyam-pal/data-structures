package Array;

public class MatrixSearch{
    /*
    Problem Description

    Given a matrix of integers A of size N x M and an integer B.
    In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form:
    If A[i][j] = B then return (i * 1009 + j)
    If B is not present return -1.
     */
    public int solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;
        for(int i=0;i<n;i++){
            if(A[i][0]>B || A[i][m-1]<B){
                continue;
            }
            else{
                int end = m-1;
                int start = 0;
                while(end >= start){
                    int mid = start + (end-start)/2;
                    if((mid == 0 || A[i][mid-1]<B) && A[i][mid] == B){
                        return ((i+1)*1009) + (mid+1);
                    }
                    else if(B > A[i][mid]){
                        start = mid+1;
                    }
                    else{
                        end = mid-1;
                    }
                }
            }
        }
        return -1;
    }
}
