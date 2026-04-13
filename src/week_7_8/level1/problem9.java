package week_7_8.level1;

import java.util.Scanner;

public class problem9 {

    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        return new int[] { chocolatesPerChild, remainingChocolates };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();

        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero");
            return;
        }

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Chocolates each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }
}