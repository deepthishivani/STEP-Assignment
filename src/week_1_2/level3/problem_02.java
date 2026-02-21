package week_1_2.level3;
import java.util.Scanner;
public class problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsiusResult = (fahrenheit - 32.0) * 5.0 / 9.0;
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
        sc.close();
    }
}