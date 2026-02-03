/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/

public class MaxSumSubArr{
    public static void main(String[] args) {
        
    }

    public static int maxSubArray(int[] nums) {
        int bestEnding = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];

            bestEnding = Math.max(v1, v2);

            ans = Math.max(ans, bestEnding);
        }

        return ans;
    }
}