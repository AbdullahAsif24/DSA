import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OddOrEvenIncrements {
    public static void main(String[] args) {
        try {

            // BufferedReader is faster for large input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Read the number of test cases
            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                // Read n (size of array)
                int n = Integer.parseInt(br.readLine());

                // Read the array elements as a single line and tokenize them
                int[] nums = new int[n];
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) {
                    nums[i] = Integer.parseInt(st.nextToken());
                }

                // Call the logic function and print the result
                System.out.println(checkParity(n, nums));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static String checkParity(int size, int[] nums) {
        int evenInds = 0;
        int oddInds = 0;
        for (int i = 1; i <= nums.length; i += 1) {
            if (i == 1) {
                oddInds = (nums[i - 1] % 2) == 0 ? 0 : 1;
            }

            if (i == 2) {
                evenInds = (nums[i - 1] % 2) == 0 ? 0 : 1;
            }

            int crr = 0;
            if (((i % 2) != 0) && i > 2) {
                crr = (nums[i - 1] % 2) == 0 ? 0 : 1;

                if (crr != oddInds) {
                    return "NO";
                }
            }

            if (((i % 2) == 0) && i > 2) {
                crr = (nums[i - 1] % 2) == 0 ? 0 : 1;

                if (crr != evenInds) {
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
