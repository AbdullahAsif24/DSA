import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
*/

public class Threesum{
    public static void main(String[] args) {
        int[] nums = {0,0,0};

        List<List<Integer>> result = threeSum(nums);

        for (List<Integer> result2 : result) {
            for (Integer result22 : result2) {
                System.out.print(result22 + "  ");
            }
            System.out.println("");
        }
        
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        // sorting
        Arrays.sort(nums);

        
        for (int i = 0; i < nums.length-2; i++) {


            int left = i+1;
            int right = nums.length-1;

            while (left < right) {
                
                int s = nums[left] + nums[right];
                
                if (s == (-1 * nums[i])) {
                    List<Integer> Toadd = new ArrayList<>();
                    Toadd.add(nums[i]);
                    Toadd.add(nums[left]);
                    Toadd.add(nums[right]);

                    res.add(Toadd);

                    // Skip duplicates for left
                    while (left < right && nums[left] == nums[left+1]) {
                        left++;
                    }
                    // Skip duplicates for right
                    while (left < right && nums[right] == nums[right-1]) {
                        right--;
                    }
                    // Move both pointers
                    left++;
                    right--;

                }else if (s > (-1 * nums[i])) {
                    right--;

                }else if (s < (-1 * nums[i])) {
                    left++;
                }
            }

            // Skip duplicates for i
            while (i < nums.length-2 && nums[i] == nums[i+1]) {
                i++;
            }
        }

        return res;
    }
}