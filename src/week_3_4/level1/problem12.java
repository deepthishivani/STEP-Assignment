package level1;
import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number");
            sc.close();
            return;
        }

        long formulaSum = (long) n * (n + 1) / 2;

        long whileSum = 0;
        int i = 1;
        while (i <= n) {
            whileSum += i;
            i++;
        }

        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using while loop: " + whileSum);
        System.out.println("Both computations are correct? " + (formulaSum == whileSum));

        sc.close();
    }
}