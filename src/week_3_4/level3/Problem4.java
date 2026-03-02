package level3;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n <= 1) isPrime = false;
        else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) { isPrime = false; break; }
            }
        }

        System.out.println(n + (isPrime ? " is Prime" : " is NOT Prime"));
        sc.close();
    }
}