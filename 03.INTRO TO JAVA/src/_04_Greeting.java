import java.util.Scanner;

public class _04_Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secoundName = scanner.nextLine();
        if (firstName.isEmpty()) {
            firstName = "*****";
        }
        if (secoundName.isEmpty()) {
            secoundName = "*****";
        }
        System.out.printf("Hello, %s %s!", firstName, secoundName);
    }
}
