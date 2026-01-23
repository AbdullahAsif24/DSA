
/*
Input Array is sorted.

Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.

*/

public class TwoSum2{
    public static void main(String[] args) {
        // Inputs
        int[] numbers = {2,7,11,15};
        int target = 9;


        int[] res = twoSum(numbers, target);

        System.out.println(res[0] + " " + res[1]);
        

    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        int[] result = new int[2];

        while (i != j && i < j) {
            if((numbers[i] + numbers[j]) == target){
                result[0] = i + 1;
                result[1] = j + 1;
                return result;

            }else if((numbers[i] + numbers[j]) > target){
                j--;

            }else if ((numbers[i] + numbers[j]) < target) {
                i++;
            }
        }

        return result;

    
    }
}