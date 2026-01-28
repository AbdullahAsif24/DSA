/*
You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.
*/

public class LongestRepeatingChars {
    public static void main(String[] args) {

        System.out.println(characterReplacement("AABABBA", 1));
    }

    public static int characterReplacement(String s, int k) {
        
        int[] arr = new int[256];

        int low = 0; 
        int result = 0;
        for (int high = 0; high < s.length(); high++) {
            arr[s.charAt(high)]++;

            int len = high - low + 1;
            int maxc = find(arr);
            int diff = len - maxc;

            while (diff > k) {
                arr[s.charAt(low)]--;
                low++;

                len = high - low + 1;
                maxc = find(arr);
                diff = len - maxc;
            }

            len = high - low + 1;
            result = Math.max(result, len);

        }

        return result;
    }

    public static int find(int[] array){
        int maxc = -1;

        for (int i = 0; i < array.length; i++) {
            maxc = Math.max(maxc, array[i]);
        }

        return maxc;
    }
}
