package src;

import java.io.IOException;
import java.util.stream.IntStream;

public class test {
    static int i = 0;
    public static void main(String[] args) throws IOException {

        int[] a = IntStream.range(1, 100).toArray();



            try {
                recurse();
            } catch (Throwable t) {
                System.exit(0);
            }



    }
    private static void recurse()
    {
        System.out.print(++i + 0 / (i - 100) + " ");
        recurse();

    }
}
