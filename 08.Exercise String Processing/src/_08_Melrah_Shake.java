package src;
import java.util.Scanner;  // 100/100

public class _08_Melrah_Shake {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String pattern = scan.nextLine();

        while (true) {

            boolean contains = input.contains(pattern);
            if (contains) {
                input = input.replaceAll(pattern, "");

                String before = pattern.substring(0, pattern.length() / 2);
                String after = pattern.substring((pattern.length() / 2) + 1, pattern.length());

                pattern = before + after;
                System.out.printf("Shaked it.\n");

            } else {
                System.out.printf("No shake.\n");
                break;
            }
        }
        System.out.printf("%s", input);
    }
}
