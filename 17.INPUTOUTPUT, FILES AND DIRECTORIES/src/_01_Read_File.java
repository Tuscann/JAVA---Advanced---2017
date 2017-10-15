import java.io.FileInputStream;
import java.io.IOException;

public class _01_Read_File {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\123\\Documents\\Java---Advanced---2017\\17.INPUTOUTPUT, FILES AND DIRECTORIES\\src\\input.txt";

        try (FileInputStream fis = new FileInputStream(inputPath)) {
            int oneByte = fis.read();

            while (oneByte >= 0) {
                System.out.print(Integer.toBinaryString(oneByte) + " ");
                oneByte = fis.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
