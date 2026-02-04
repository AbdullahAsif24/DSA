/*
Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

Note that the product of an array with a single element is the value of that element.
*/

public class MaxProdSubArr {
    public static void main(String[] args) {
        
    }

    public static int maxProduct(int[] nums) {
        int minEnding = nums[0];
        int maxEnding = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = nums[i];
            int v2 = minEnding * nums[i];
            int v3 = maxEnding * nums[i];

            maxEnding = Math.max(v1, Math.max(v2,v3));
            minEnding = Math.min(v1, Math.min(v2,v3));

            ans = Math.max(ans, Math.max(maxEnding, minEnding));
        }

        return ans;
    }
}
