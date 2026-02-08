
import java.util.Scanner;


public class AffanAtHussainabad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read X (total money) from the first line
        int x = sc.nextInt();

        // Read A, B, and C (prices) from the second line
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(totalFinder(x, a, b,c));
    }

    public static int totalFinder(int price, int A, int B, int C) {
    // 1. Put prices in an array to sort them easily
    int[] p = {A, B, C};
    java.util.Arrays.sort(p); // p[0] is now cheapest, p[2] is most expensive

    // 2. Calculate full rounds
    int totalSum = A + B + C;
    int k = price / totalSum;
    int totalItems = k * 3;
    int remaining = price % totalSum;

    // 3. Spend remaining money on cheapest items first
    if (remaining >= (p[0] + p[1])) {
        totalItems += 2;
    } else if (remaining >= p[0]) {
        totalItems += 1;
    }

    return totalItems;
}
}
