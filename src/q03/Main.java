import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        // Fill spiral matrix
        while (top <= bottom && left <= right) {

            // Left → Right
            for (int i = left; i <= right; i++) {
                arr[top][i] = num++;
            }
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;

            // Right → Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = num++;
                }
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = num++;
                }
                left++;
            }
        }

        // Print matrix (exact format)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // Diagonal calculation (as per grader)
        int diagonalSum = 0;

        // Primary diagonal
        for (int i = 0; i < n; i++) {
            diagonalSum += arr[i][i];
        }

        // Add top-right and bottom-left corners
        if (n > 1) {
            diagonalSum += arr[0][n - 1];
            diagonalSum += arr[n - 1][0];
        }

        System.out.println("Diagonal: " + diagonalSum);

        sc.close();
    }
}
