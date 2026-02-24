package week_3_4.level2;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        double amarHeight = sc.nextDouble();
        double akbarHeight = sc.nextDouble();
        double anthonyHeight = sc.nextDouble();

        // Youngest
        int minAge = amarAge;
        String youngest = "Amar";
        if (akbarAge < minAge) { minAge = akbarAge; youngest = "Akbar"; }
        if (anthonyAge < minAge) { minAge = anthonyAge; youngest = "Anthony"; }

        // Tallest
        double maxHeight = amarHeight;
        String tallest = "Amar";
        if (akbarHeight > maxHeight) { maxHeight = akbarHeight; tallest = "Akbar"; }
        if (anthonyHeight > maxHeight) { maxHeight = anthonyHeight; tallest = "Anthony"; }

        System.out.println("Youngest is " + youngest);
        System.out.println("Tallest is " + tallest);

        sc.close();
    }
}