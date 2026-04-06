import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // upper half
        for (int i = 1; i <= n; i++) {

            // leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // first star
            System.out.print("*");

            // hollow middle + second star
            if (i > 1) {
                for (int j = 1; j <= 2*i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        // lower half
        for (int i = n - 1; i >= 1; i--) {

            // leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // first star
            System.out.print("*");

            // hollow middle + second star
            if (i > 1) {
                for (int j = 1; j <= 2*i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
