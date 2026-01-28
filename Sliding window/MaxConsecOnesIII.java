/*
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
*/

public class MaxConsecOnesIII {
    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{0,0,0,0}, 0));
    }

    public static int longestOnes(int[] nums, int k) {
        int[] arr = new int[2];

        int low = 0; 
        int result = 0;
        for (int high = 0; high < nums.length; high++) {
            arr[nums[high]]++;

            int len = high - low + 1;
            int zeroCount = arr[0];

            while (zeroCount > k) {
                arr[nums[low]]--;
                low++;

                len = high - low + 1;
                zeroCount = arr[0];
            }

            len = high - low + 1;
            result = Math.max(result, len);

        }

        return result;
    }
}
