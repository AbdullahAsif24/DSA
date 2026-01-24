
import java.util.Arrays;

public class ThreeSumClosest{
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70,80,90};

        System.out.println(threeSumClosest(nums, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int closest = nums[0] + nums[1] + nums[2];
        int minDiff = Math.abs(closest - target);
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int currentDiff = Math.abs(sum - target);
                
                if (currentDiff < minDiff) {
                    minDiff = currentDiff;
                    closest = sum;
                }
                
                if (sum == target) {
                    return sum;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        
        return closest;
    }
    }
