package level1;
import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        long fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " is " + fact);
        sc.close();
    }
}