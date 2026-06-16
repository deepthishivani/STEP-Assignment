package week_9_10.level1;

public class problem8 {

    public static void handle() {

        try {

            int[] arr = {1,2,3};

            System.out.println(arr[10]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        handle();
    }
}