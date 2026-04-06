import java.util.Stack;

public class RemoveAdjacentDup {

    public static void main(String[] args) {
        
    }

    public static String removeDuplicates(String s) {

        char[] sArr = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char ch : sArr) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }
}