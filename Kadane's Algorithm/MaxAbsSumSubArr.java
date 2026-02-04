/*
You are given an integer array nums. The absolute sum of a subarray [numsl, numsl+1, ..., numsr-1, numsr] is abs(numsl + numsl+1 + ... + numsr-1 + numsr).

Return the maximum absolute sum of any (possibly empty) subarray of nums.

Note that abs(x) is defined as follows:

If x is a negative integer, then abs(x) = -x.
If x is a non-negative integer, then abs(x) = x.
*/

public class MaxAbsSumSubArr {
    public static void main(String[] args) {
        
    }

    public static int maxAbsoluteSum(int[] nums) {
        // find maxSum
        int bestEnding1 = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = bestEnding1 + nums[i];
            int v2 = nums[i];

            bestEnding1 = Math.max(v1, v2);

            maxSum = Math.max(maxSum, bestEnding1);
        }

        // find minSUm

        int bestEnding = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];

            bestEnding = Math.min(v1, v2);

            minSum = Math.min(minSum, bestEnding);
        }


        // 
        int res = Math.max(maxSum, Math.abs(minSum));

        return res;
    }
}
