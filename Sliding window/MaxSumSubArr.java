// ---- ---- GFF ---- 

/*
Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

Note: A subarray is a contiguous part of any given array.
*/

public class MaxSumSubArr {
    public static void main(String[] args) {
        
        int[] arr = {100, 200, 300, 400};

        System.out.println(maxSubarraySum(arr, 1));
    }

    public static int maxSubarraySum(int[] arr, int k) {
        int res = 0;

        int low = 0 ;
        int high = k-1;

        int sum = 0;
        
        for(int i = 0; i <= high; i++ ){
            sum += arr[i];
        }

        res = sum;

        while (high < arr.length) {
            low++;
            high++;

            if (high >= arr.length) {
                break;
            }

            
            sum = (sum - arr[low-1]) + arr[high];

            if(sum > res){
                res = sum;
            }
        }

        return res;
        
    }
}
