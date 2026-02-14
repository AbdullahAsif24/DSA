/*
Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.
*/

import java.util.HashMap;

public class SubArrSumDivisibleK {
    public static void main(String[] args) {
        
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        map.put(sum, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int remainder = sum % k;
            if (remainder < 0) remainder += k;
            res += map.getOrDefault(remainder, 0);

            map.put(remainder,map.getOrDefault(remainder, 0)+1);
        }

        return res;
    }
}
