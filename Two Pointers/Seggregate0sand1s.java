// ----------- GFG ---------------

/*
Given an array arr consisting of only 0's and 1's in random order. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.
*/

public class Seggregate0sand1s {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1};

        segregate0and1(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void segregate0and1(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        int extra;

        while (mid<=high) {
            if (arr[mid] == 0) {

                extra = arr[low];
                arr[low] = arr[mid];
                arr[mid] = extra;

                low++;
                mid++;

            }else if (arr[mid] == 1) {

                mid++;

            }
        }
        
    }
}
