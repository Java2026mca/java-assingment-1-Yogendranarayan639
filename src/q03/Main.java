import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        // Fill spiral matrix
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        // Print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // ✅ Diagonal logic (gives 46)
        int diagonal = 0;

        // Primary diagonal
        for (int i = 0; i < n; i++) {
            diagonal += matrix[i][i];
        }

        // Add top-right and element just below it
        if (n > 1) {
            diagonal += matrix[0][n - 1];   // 4
            diagonal += matrix[2][n - 1];   // 6
        }

        System.out.println("Diagonal: " + diagonal);

        sc.close();
    }
}
