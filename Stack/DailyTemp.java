/*
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
*/

import java.util.Stack;

public class DailyTemp {
    public static void main(String[] args) {
        System.out.println(7-4);
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        answer[answer.length - 1] = 0;
        stack.push(temperatures.length - 1);

        for (int i = temperatures.length - 2; i >=0; i--){
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                answer[i] = 0;
            }else {
                answer[i] = stack.peek() -i;
            }

            stack.push(i);
        }

        return answer;
    }
    
}