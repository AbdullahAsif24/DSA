/*
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

Follow up: Could you find an algorithm that runs in O(m + n) time?
*/


public class MinWindSubStr {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    public static String minWindow(String s, String t) {

        if (s.length() < t.length() || s.length() == 0) {
            return "";
        }

        int result = Integer.MAX_VALUE;

        int[] have = new int[256];
        int[] needed = new int[256];

        for (int i = 0; i < t.length(); i++) {
            needed[t.charAt(i)]++;
        }


        int low = 0;
        int start = 0;
        for (int high = 0; high < s.length(); high++) {
            have[s.charAt(high)]++;
            
            while (sahi(have, needed)) {
                int len = high - low + 1;

                if (result > len) {
                    result = len;
                    start = low;
                }

                if (have[s.charAt(low)] == 1 ) {
                    have[s.charAt(low)] = 0;
                }else {
                   have[s.charAt(low)]--;
                }
                
                low++;
            }
        }


        return result == Integer.MAX_VALUE ? "" :  s.substring(start, result + start);
    }

    public static Boolean sahi(int[] have, int[] needed){
       for (int i = 0; i < 256; i++) {
            if (have[i] < needed[i]) {
                return false;
            }
       }
       return true;
    }
}
