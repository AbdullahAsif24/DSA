/*
Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.

A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].

A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.
*/

public class MaxSumCircularSubArr{
    public static void main(String[] args) {
        
    }

    public static int maxSubarraySumCircular(int[] nums) {

        // find min sum 
        int bestEnding1 = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = bestEnding1 + nums[i];
            int v2 = nums[i];

            bestEnding1 = Math.min(v1, v2);

            minSum = Math.min(minSum, bestEnding1);
        }

        int totalSum = 0;
        for (int i : nums) {
            totalSum += i;
        }

        int firstMaxSum = totalSum == minSum ? totalSum : totalSum - minSum;

        // find max sum
        int bestEnding = nums[0];
        int secondMaxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];

            bestEnding = Math.max(v1, v2);

            secondMaxSum = Math.max(secondMaxSum, bestEnding);
        }

        return Math.max(secondMaxSum, firstMaxSum);
    }
}