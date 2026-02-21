package week_1_2.level1;

public class problem7 {

    public static void main(String[] args) {
        double radius = 6378;
        double pi = 3.1416;

        double volumeKm = (4.0 / 3) * pi * Math.pow(radius, 3);

        double kmToMiles = 0.621371;
        double volumeMiles = volumeKm * Math.pow(kmToMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                " and cubic miles is " + volumeMiles);
    }
}
