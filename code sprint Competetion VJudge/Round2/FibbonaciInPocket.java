import java.util.Scanner;

public class FibbonaciInPocket {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long num = sc.nextLong();
            System.out.println(sumFinder(num));
        }
    }

    public static long sumFinder(long num){
        if (num <= 1) {
            return 0;
        }

        long crrVal = 1;
        long prevVal = 0;
        long swapvar = 0;
        long sum = 0;

        while ( crrVal < num ) {
            if ((crrVal % 2) == 0) {
                sum += crrVal;
            }

            swapvar = crrVal;
            crrVal += prevVal;
            prevVal = swapvar;
        }

        return sum;
    }
}
