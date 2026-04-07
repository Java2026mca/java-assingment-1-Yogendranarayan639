import java.util.*;

public class Main {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isPerfect(int num) {
        if (num <= 1) return false;

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            int num = sc.nextInt();

            if (isPrime(num)) {
                System.out.println("Prime");
            } else if (isPerfect(num)) {
                System.out.println("Perfect");
            } else {
                System.out.println("Neither");
            }
        }

        sc.close();
    }
}
