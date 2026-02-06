import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CrazyYesterday{
    public static void main(String[] args) {
        try {

            // BufferedReader is faster for large input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Read the number of test cases
            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                
                // Call the logic function and print the result
                if (n == 1) {
                    System.out.println(7);
                }else{  
                    System.out.println(n-1);
                } 
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}