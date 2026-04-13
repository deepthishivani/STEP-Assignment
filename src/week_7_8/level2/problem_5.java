package week_7_8.level2;

public class problem_5 {

    public static double yardsToFeet(double y) { return y * 3; }
    public static double feetToYards(double f) { return f * 0.333333; }
    public static double metersToInches(double m) { return m * 39.3701; }
    public static double inchesToMeters(double i) { return i * 0.0254; }
    public static double inchesToCm(double i) { return i * 2.54; }

    public static void main(String[] args) {
        System.out.println(yardsToFeet(5));
    }
}