// ----------- GFG ----------------

/*
Given an array arr[] of distinct integers of size n and a value sum, the task is to find the count of triplets (i, j, k), having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.


*/

import java.util.Arrays;

public class TripletsWithSmallerSum{
    public static void main(String[] args) {
        long arr[] = {-2, 0, 1, 3};

        System.out.println(countTriplets(4, 2, arr));
        
    }

    public static long countTriplets(int n, int sum, long arr[]) {

        Arrays.sort(arr);

        long ans = 0;

        for (int i = 0; i < n-2; i++) {
            int left = i + 1;
            int right = n-1;

            while (left<right) {
                
                long crrsum = arr[i] + arr[left] + arr[right];
                
                if (crrsum >= sum) {
                    right--;
                }else if (crrsum < sum) {
                    ans += (right-left);
                    left++;
                }
            }
        }

        return ans;
    }
}