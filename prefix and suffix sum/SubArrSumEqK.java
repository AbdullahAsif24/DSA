/*
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.
*/

import java.util.HashMap;

public class SubArrSumEqK {
    public static void main(String[] args) {
        
    }

    public static int subarraySum(int[] nums, int k) {
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int ques = sum - k;
            int freq = map.getOrDefault(ques, 0);
            res += freq;

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return res;
    }
}
