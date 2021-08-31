import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class factorial {
    static int factorial(int n) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s*= i;
        }
        return s;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");

        int result = factorial(n);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();

        scanner.close();

    }

}
