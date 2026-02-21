package week_1_2.level2;
import java.util.*;
public class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + areaIn2 + " and sq cm is " + areaCm2);
        sc.close();
    }
}