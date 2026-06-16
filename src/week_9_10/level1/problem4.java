package week_9_10.level1;

public class problem4 {

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {

        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }

    public static void main(String[] args) {

        handleException();
    }
}