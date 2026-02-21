package week_1_2.level2;
import java.util.*;
public class problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimeter = sc.nextDouble();
        double side = perimeter / 4.0;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        sc.close();
    }
}