import java.util.HashSet;
import java.util.Scanner;

public class LRUD_Instructions {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Read N and then the string S
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(LRUDFunc(n, s));
        }
    }

    

    public static String LRUDFunc(int size, String inst) {
        HashSet<String> hs = new HashSet<>();

        int x = 0, y = 0;

        hs.add(x + "," + y);

        for (int i = 0; i < size; i++) {
            
            if (inst.charAt(i) == 'R') {
                x++;
            } else if (inst.charAt(i) == 'L') {
                x--;
            } else if (inst.charAt(i) == 'U') {
                y++;
            } else if (inst.charAt(i) == 'D') {
                y--;
            }

            if (hs.contains(x + "," + y)) {
                return "Yes";
            }else {
                hs.add(x + "," + y);    
            }

        }

        return "No";
    }

}
