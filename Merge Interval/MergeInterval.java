
/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval{
    public static void main(String[] args) {
        
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];

        List<int[]> result = new ArrayList<>();


        for (int i = 1; i < intervals.length; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            if (end1 >= start2) {
                end1 = Math.max(end1, end2);

            }else{
                result.add(new int[]{start1, end1});

                start1 = start2;
                end1 = end2;
            }
        }

        result.add(new int[]{start1, end1});

        return result.toArray(new int[result.size()][]);

    }
}