/*
Given two arrays start[] and end[] such that start[i] is the starting time of ith meeting and end[i] is the ending time of ith meeting. Return the minimum number of rooms required to attend all meetings.

Note: A person can also attend a meeting if it's starting time is same as the previous meeting's ending time.
*/

import java.util.Arrays;

public class MeetingRooms {
    public static void main(String[] args) {
        
    }

    public int minMeetingRooms(int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);
        
        int rooms = 0;
        int res = 0;

        int i = 0;
        int j = 0;

        while (i < start.length && j < end.length) {
            if (start[i] < end[j]) {
                rooms++;
                res = Math.max(res, rooms);
                i++;
            } else {
                rooms--;
                j++;
            }
        }
        return res;
    }
}
