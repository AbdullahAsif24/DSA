import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            
            while (T-- > 0) {
                int N = sc.nextInt();
                int[][] grid = new int[N][N];
                int currentNumber = 1;

                // There are (2*N - 1) diagonals in total
                for (int diag = 0; diag < 2 * N - 1; diag++) {
                    /* For each diagonal, we determine the starting row and column.
                       In this pattern, we fill from the 'top' of each diagonal.
                    */
                    for (int row = 0; row < N; row++) {
                        int col = diag - row;
                        
                        // Check if the column is within the grid boundaries
                        if (col >= 0 && col < N) {
                            grid[row][col] = currentNumber++;
                        }
                    }
                }

                // Print the completed grid
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        System.out.print(grid[i][j] + (j == N - 1 ? "" : " "));
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}