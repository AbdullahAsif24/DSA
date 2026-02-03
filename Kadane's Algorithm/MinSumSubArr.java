/*
    ----------------- GFG --------------
    Given an array arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the minimum sum and return its sum.
*/

public class MinSumSubArr{
    public static void main(String[] args) {
        
    }

    static int smallestSumSubarray(int a[], int size) {
        int bestEnding = a[0];
        int ans = a[0];

        for (int i = 1; i < size; i++) {
            int v1 = bestEnding + a[i];
            int v2 = a[i];

            bestEnding = Math.min(v1, v2);

            ans = Math.min(ans, bestEnding);
        }

        return ans;
        
    }
}