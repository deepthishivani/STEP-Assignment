package week_1_2.level2;
import java.util.*;
public class problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();
        double total = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        sc.close();
    }
}