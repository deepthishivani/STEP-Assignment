package week_9_10.level1;

import java.util.Scanner;

public class problem2 {

    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String custom = createSubstring(text, start, end);
        String builtIn = text.substring(start, end);

        System.out.println(custom);
        System.out.println(builtIn);
        System.out.println(custom.equals(builtIn));
    }
}