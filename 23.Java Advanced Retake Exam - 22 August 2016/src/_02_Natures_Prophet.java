import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _02_Natures_Prophet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] dimensions = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[][] garden = new int[dimensions[0]][dimensions[1]];

        String input = reader.readLine();

        while (!"Bloom Bloom Plow".equals(input)) {
            String[] plantFlower = input.split(" ");
            int currentRow = Integer.parseInt(plantFlower[0]);
            int currentCol = Integer.parseInt(plantFlower[1]);

            for (int col = 0; col < garden[currentRow].length; col++) {
                if (col != currentCol) {
                    garden[currentRow][col] += 1;
                }
            }

            for (int row = 0; row < garden.length; row++) {
                garden[row][currentCol] += 1;
            }
            input = reader.readLine();
        }

        for (int[] aGarden : garden) {
            for (int anAGarden : aGarden) {
                System.out.print(anAGarden + " ");
            }
            System.out.println();
        }
    }
}
