/*
You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together.

We repeatedly make k duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique.

 
*/



public class RemoveAdjacentDup2 {
    public String removeDuplicates(String s, int k) {

        // use sb as stack
        StringBuilder sb = new StringBuilder();

        int[] count = new int[s.length()];

        for (char ch: s.toCharArray()) {
            sb.append(ch);
            int last = sb.length()-1;
            count[last] = 1 + (last > 0 && sb.charAt(last-1) == sb.charAt(last) ? count[last-1] : 0);

            if (count[last] >= k) {
                sb.delete(sb.length()-k, sb.length());
            }

        }

        return sb.toString();
    }
}
