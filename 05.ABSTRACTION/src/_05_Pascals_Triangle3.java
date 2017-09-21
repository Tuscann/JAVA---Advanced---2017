import java.util.Scanner;
public class _05_Pascals_Triangle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());

        long[][] pascalTriangle = generatePascalTriangle(height);

        for (long[] nums : pascalTriangle) {
            for (long n : nums) {
                if (n != 0) {
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    }

    private static long[][] generatePascalTriangle(int height) {
        long[][] pascalTriangle = new long[height][height];
        for (int currentHeight = 0; currentHeight < height; currentHeight++) {
            pascalTriangle[currentHeight][0] = 1;
            pascalTriangle[currentHeight][currentHeight] = 1;
            if (currentHeight > 1) {
                for (int i = 1; i < currentHeight; i++) {
                    long[] previousRow = pascalTriangle[currentHeight - 1];
                    long previousRowSum = previousRow[i] + previousRow[i - 1];
                    pascalTriangle[currentHeight][i] = previousRowSum;
                }
            }
        }

        return pascalTriangle;
    }
}
