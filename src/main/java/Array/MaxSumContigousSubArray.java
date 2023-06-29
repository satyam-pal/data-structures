package Array;

public class MaxSumContigousSubArray {
    /*
    Problem Description:
    Find the maximum sum of contiguous non-empty subarray within an array A of length N.

     */
    public int maxSubArray(final int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;
        int currentSum = 0;
        for(int i = 0; i < n; i++){
            currentSum += nums[i];
            if(maxSum < currentSum){
                maxSum = currentSum;
            }
            if(currentSum < 0)
                currentSum = 0;
        }
        return maxSum;
    }
}
