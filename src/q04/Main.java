import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            
            boolean isPrime = true;
            if (num < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            
            int sum = 0;
            for (int j = 1; j <= num / 2; j++) {
                if (num % j == 0) {
                    sum += j;
                }
            }
            
            boolean isPerfect = (sum == num);
            
            if (isPrime && isPerfect)
                System.out.println("Both");
            else if (isPrime)
                System.out.println("Prime");
            else if (isPerfect)
                System.out.println("Perfect");
            else
                System.out.println("Neither");
        }
    }
}
