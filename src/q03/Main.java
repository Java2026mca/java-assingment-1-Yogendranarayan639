import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        // Fill matrix in spiral order
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

        // Print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }

        // Calculate primary diagonal sum
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += arr[i][i];
        }

        System.out.println("Diagonal: " + diagonalSum);
    }
}
