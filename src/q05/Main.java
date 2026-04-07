import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            if (sc.hasNextDouble()) {
                double r = sc.nextDouble();
                double area = Math.PI * r * r;
                System.out.printf("Area: %.2f\n", area);
            } else {
                sc.next(); // skip invalid input safely
            }
        }

        sc.close();
    }
}
