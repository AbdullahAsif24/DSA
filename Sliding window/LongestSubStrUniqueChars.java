/*
Given a string s, find the length of the longest substring without duplicate characters.
*/

import java.util.HashMap;

public class LongestSubStrUniqueChars {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> f = new HashMap<>();
        int result = 0;

        int low = 0;

        for (int high = 0; high < s.length(); high++) {
            f.put(s.charAt(high), f.get(s.charAt(high))==null? 1:f.get(s.charAt(high))+1);

            int k = high - low + 1;

            while (f.size() < k) {
                if (f.get(s.charAt(low)) == 1) {
                    f.remove(s.charAt(low));
                }else {
                    f.put(s.charAt(low), f.get(s.charAt(low)) - 1);
                }

                low++;

                k = high - low + 1;
            }

            if (f.size() == k) {
                result = result > k ? result : k;
            }
        }

        return result;
    }
}
