import java.util.Scanner;

public class ThreeSmoothNumbs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read N and then the string S
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(func(n));
        }
    }

    private static String func(int n) {
        if (n <= 0) return "No";

        while (n % 2 == 0) {
            n /=2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1 ? "Yes" : "No";
    }
}