/*
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
*/

import java.util.HashMap;

public class ContigiousArrBinary {
    public static void main(String[] args) {
        
    }

    public static int findMaxLength(int[] nums) {
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int zero = 0;
        int one = 0;
        int diff = zero - one;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) zero++;
            else one++;

            diff = zero - one;

            if (diff == 0) {
                res = Math.max(res, i+1);
                continue;
            }

            if (!map.containsKey(diff)) {
                map.put(diff, i);
            }else {
                res = Math.max(res, i - map.get(diff));
            }
        }

        return res;
    }

}
