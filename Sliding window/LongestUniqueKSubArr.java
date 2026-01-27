// ----------- GFG ------------------

/*
You are given a string s consisting only lowercase alphabets and an integer k. Your task is to find the length of the longest substring that contains exactly k distinct characters.

Note : If no such substring exists, return -1. 
*/

import java.util.HashMap;

public class LongestUniqueKSubArr {
    public static void main(String[] args) {
        System.out.println(longestKSubstr("aaaa", 2));
    }

    public static int longestKSubstr(String s, int k) {
       
        int result = -1;

        HashMap<Character, Integer> f = new HashMap<>();
        int low = 0;
        

        for (int high = 0; high < s.length(); high++) {
            f.put(s.charAt(high), f.get(s.charAt(high))==null? 1:f.get(s.charAt(high))+1);
            
            while (f.size() > k) {
                if (f.get(s.charAt(low)) == 1) {
                    f.remove(s.charAt(low));
                }else {
                    f.put(s.charAt(low), f.get(s.charAt(low)) - 1);
                }

                low++;
            }

            if (f.size() == k) {
                int len = high - low + 1;
                result = result > len ? result: len;
            }


        }

        return result;
    }
}
