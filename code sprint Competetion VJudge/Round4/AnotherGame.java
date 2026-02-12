/*
The core logic relies on the relationship between the player with the most passes ($M$) and the sum of passes from all other players ($S - M$):
Case 1: $M \le (S - M)$The other players generate enough passes to "sink" the passes from the busiest player. In this scenario, only 1 ball is required to facilitate all passes (provided there is at least one pass).
Case 2: $M > (S - M)$The busiest player is producing more passes than the rest of the group can receive and pass back. To satisfy this player's pass count, you need a starting supply of balls equal to the difference: $M - (S - M)$.
*/
import java.util.Scanner;

public class AnotherGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Number of test cases
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long maxPasses = 0;
            long totalSum = 0;
            
            for (int i = 0; i < n; i++) {
                long current = sc.nextLong();
                totalSum += current;
                if (current > maxPasses) {
                    maxPasses = current;
                }
            }
            
            // Calculate passes by everyone except the busiest player
            long othersSum = totalSum - maxPasses;
            
            if (totalSum == 0) {
                System.out.println(0);
            } else if (maxPasses <= othersSum) {
                // If the busiest player can be balanced by others
                System.out.println(1);
            } else {
                // The excess passes determine the minimum balls
                System.out.println(maxPasses - othersSum);
            }
        }
        sc.close();
    }
}


