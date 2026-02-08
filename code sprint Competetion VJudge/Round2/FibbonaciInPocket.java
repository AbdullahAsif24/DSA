import java.util.Scanner;

public class FibbonaciInPocket {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int num = sc.nextInt();
            System.out.println(sumFinder(num));
        }
    }

    public static int sumFinder(int num){
        if (num <= 1) {
            return 0;
        }

        int crrVal = 1;
        int prevVal = 0;
        int swapvar = 0;
        int sum = 0;

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
