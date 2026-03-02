package level1;
import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number");
            sc.close();
            return;
        }

        long formulaSum = (long) n * (n + 1) / 2;

        long forSum = 0;
        for (int i = 1; i <= n; i++) {
            forSum += i;
        }

        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using for loop: " + forSum);
        System.out.println("Both computations are correct? " + (formulaSum == forSum));

        sc.close();
    }
}