/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Follow up: Could you come up with a one-pass algorithm using only constant extra space?
*/

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        
        sortColors(nums);
        
        for(int m: nums){
            System.out.println(m);
        }

        
    }

    public static void sortColors(int[] nums) {
        // --------- optimized approach with time complexity 0(n) and space comlexity 0(1)
        // int zero = 0;
        // int one = 0;
        // int two = 0;
        
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == 0) {
        //         zero++;
        //     }else if(nums[i] == 1){
        //         one++;
        //     }else {
        //         two++;
        //     }
        // }
        // then place all zero first then one then 2 
        
        // ------ best approach  // in place sort with one pass
        // with dutch national flag algorithm

        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        int extra;

        while (mid<=high) {
            if (nums[mid] == 0) {

                extra = nums[low];
                nums[low] = nums[mid];
                nums[mid] = extra;

                low++;
                mid++;

            }else if (nums[mid] == 1) {

                mid++;

            }else if (nums[mid] == 2) {

                extra = nums[high];
                nums[high] = nums[mid];
                nums[mid] = extra;

                high--;
                
            }
        }
 
        
    }
}
