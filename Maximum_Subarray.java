public class Solution {
    public int maxSubArray(int[] A) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i=0; i<A.length; i++) {
            currSum += A[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) currSum = 0;
        }
        return maxSum;
    }
}