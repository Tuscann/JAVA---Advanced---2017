import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class _02_Maximum_Element {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Long n = Long.parseLong(scan.nextLine());
        Deque<Long> stack = new ArrayDeque<>();

        for (int i = 0; i <= n; i++) {
            String cure = scan.nextLine();

            if (cure.equals("2")){
                stack.pop();
            }
            else if (cure.equals("3"))
            {
                System.out.println(Collections.max(stack));
            }
            else {

                String[] current = cure.split("\\s+");

                if (current[0].equals("1")){
                    stack.push(Long.parseLong(current[1]));
                }
            }
        }
    }
}
