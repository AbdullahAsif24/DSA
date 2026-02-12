/*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
 */

public class PivotIndex {
    public static void main(String[] args) {

    }

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // 1. Calculate the total sum of the array
        for (int x : nums)
            totalSum += x;

        // 2. Iterate through every index (starting from 0!)
        for (int i = 0; i < nums.length; i++) {
            // The right sum is: totalSum - leftSum - nums[i]
            // We check if leftSum == rightSum
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }

            // Update leftSum for the next iteration
            leftSum += nums[i];
        }

        return -1;
    }
}