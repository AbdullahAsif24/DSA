/*
Given an array of integers, return the maximum sum for a non-empty subarray (contiguous elements) with at most one element deletion. In other words, you want to choose a subarray and optionally delete one element from it so that there is still at least one element left and the sum of the remaining elements is maximum possible.

Note that the subarray needs to be non-empty after deleting one element.
*/
public class MaxSumSubArrOneDel {
    public static void main(String[] args) {
        // 1, -2, 0, 3
    }

    public static int maximumSum(int[] arr) {
        int res = arr[0];
        int noDel = arr[0];
        int oneDel = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int prevNoDel = noDel;
            int prevOneDel = oneDel;

            noDel = Math.max(noDel + arr[i], arr[i]);

            int v;

            if (prevOneDel == Integer.MIN_VALUE) {
                v = arr[i];
            }else{
                v = prevOneDel + arr[i];
            }

            oneDel = Math.max(v, prevNoDel);

            res = Math.max(res, Math.max(oneDel, noDel));

        }

        return res;
    }
}
