import java.util.*;  // 60/100

public class _03_First_Name {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        String[] characters = scan.nextLine().split("\\s+");
        Boolean isFound = true;

        SortedSet<String> oreder = new TreeSet<>();

        Collections.addAll(oreder, input);

        for (int i = 0; i < oreder.size(); i++) {

            String current = oreder.first();
            for (String character : characters) {
                if (current.substring(0, 1).equalsIgnoreCase(character)) {
                    System.out.printf("%s", current);
                    isFound = false;
                    break;

                }
            }
            oreder.remove(current);
        }
        if (isFound){
            System.out.printf("No match");
        }
    }
}
