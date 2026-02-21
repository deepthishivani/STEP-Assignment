package week_1_2.level3;
import java.util.Scanner;
public class problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheitResult = (celsius * 9.0 / 5.0) + 32.0;
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
        sc.close();
    }
}