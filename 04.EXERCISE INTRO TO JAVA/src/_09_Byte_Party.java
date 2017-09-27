import java.util.Scanner;

public class _09_Byte_Party {                    // 100/100
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[a];

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(scanner.nextLine());
            numbers[i] = b;
        }

        while (true) {
            String[] command = scanner.nextLine().split("\\s+");

            if (command[0].equals("party")) {
                for (int number : numbers) {
                    System.out.println(number);
                }
                break;
            }
            int action = Integer.parseInt(command[0]);
            int position = Integer.parseInt(command[1]);

            switch (action) {
                case -1:
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] ^ (1 << position);
                    }
                    break;
                case 0:
                    int mask = ~(1 << position);
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] & mask;
                    }
                    break;
                case 1:
                    int mask1 = 1 << position;
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] | mask1;
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
