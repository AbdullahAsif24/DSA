/*
--------------------------------- GFG -----------------------------------
You are given a 2D array arr[][] which represents a set of intervals, where each element arr[i] = [start, end] defines an interval.
Your task is to determine if any two intervals in the given set overlap.

Note: Two intervals [a, b] and [c, d] overlap if they have at least one common value, i.e., a ≤ d and c ≤ b.
*/

import java.util.Arrays;

public class OverLappingIntervals {
    public static void main(String[] args) {
        
    }

    static boolean isIntersect(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int end1 = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            if (start2 <= end1 ) {
                return true;
            }

            end1 = end2;
        }
        
        return false;
    }
}
