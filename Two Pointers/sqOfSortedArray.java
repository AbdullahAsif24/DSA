/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */

import java.util.ArrayList;
import java.util.List;

public class sqOfSortedArray{
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        

        int[] res = sortedSquares(nums);


        for (int num : res) {
            System.out.println(num);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for (int n: nums){
            if(n < 0){
                neg.add(n);
            }
            else {
                pos.add(n);
            }


        }

        // for all positive numbers 

        if (neg.size() == 0){
            for (int i = 0; i < pos.size(); i++){
                pos.set(i, pos.get(i) * pos.get(i));
            }

            return pos.stream().mapToInt(i -> i).toArray();
        }

        // for all negative numbers

        if (pos.size() == 0) {
            for (int i = 0; i < neg.size(); i++) {
                neg.set(i, neg.get(i) * neg.get(i));
            }

            return neg.reversed().stream().mapToInt(i -> i).toArray();
        }

        // for both

        int[] result = new int[neg.size() + pos.size()];

        for (int i = 0; i < neg.size(); i++) {
            neg.set(i, neg.get(i) * neg.get(i));

        }
        neg = neg.reversed();

        for (int i = 0; i < pos.size(); i++) {
            pos.set(i, pos.get(i) * pos.get(i));

        }


        int i = 0 , j=0, id = 0;
        int n1 = neg.size();
        int n2 = pos.size();

        while (i < n1 && j < n2) {
            if (neg.get(i)<= pos.get(j)) {
                result[id++] = neg.get(i++);
            }else {
                result[id++] = pos.get(j++);
            }
        }

        while (i < n1) {
            result[id++] = neg.get(i++);
        }

        while (j < n2 ) {
            result[id++] = pos.get(j++);
        }
        

        return result;
    }
}