package week_1_2.level1;
import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fee;
        double discountPercent;

        System.out.print("Enter Student Fee: ");
        fee = input.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
