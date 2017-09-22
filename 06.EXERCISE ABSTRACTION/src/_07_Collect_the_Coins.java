import java.util.Scanner;

public class _07_Collect_the_Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputs = scan.nextLine().split("\\s+");
        int rows = Integer.parseInt(inputs[0]);
        int col = Integer.parseInt(inputs[1]);

        String[][] matrix = new String[rows][col];
        Integer maxLenght = 0;
        String repeats = "";

        for (int i = 0; i < rows; i++) {
            String[] currentLine = scan.nextLine().split("\\s+");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = currentLine[i];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                int down = 0;
                String temp2 = matrix[i][j];

                for (int k = i; k < matrix.length - 1; k++) {
                    if (matrix[k][j].equals(matrix[k + 1][j])) {
                        down++;
                        temp2 = matrix[i][j];
                    } else {
                        break;
                    }
                }
                if(down > maxLenght){
                    maxLenght = down;
                    repeats = temp2;
                }
                int count3 = 0;
                String temp3 = matrix[i][j];
                for (int k = i; k < Math.min(matrix.length-1,matrix[i].length-1); k++) {
                    if(matrix[k][k].equals(matrix[k+1][k+1])){
                        count3++;
                        temp3 = matrix[k][k];
                    } else {
                        break;
                    }
                }
                if(count3 > maxLenght){
                    maxLenght = count3;
                    repeats = temp3;
                }
            }
        }
        for (int i = 0; i < maxLenght; i++) {
            System.out.printf("%s, ",repeats);
        }

    }
}
