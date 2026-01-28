/*
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).
*/


public class MinSizeSubArrSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1};

        System.out.println(minSubArrayLen(11, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        double res = Double.POSITIVE_INFINITY;

        int low = 0;
        int high = 0;

        int sum = 0;
        while (high < nums.length) {
            sum += nums[high];

            while (sum >= target) {
                int len  = high - low + 1;
                res = len < res ? len : res;

                sum -= nums[low];
                low++;

            }

            high++;
        }

        return res == Double.POSITIVE_INFINITY ? 0 : (int)res;
    }
}
