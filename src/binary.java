import java.util.Scanner;

public class binary {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        //scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");

        int count = 0;
        int max = 0;

        String binary = Integer.toBinaryString(n);

        for (int i = 0; i < binary.length(); i++ ) {
            char ele = binary.charAt(i);
            if (ele == '1') {
                count++;
                max = Math.max(max, count);
            }else {
                count = 0;
            }
        }
        System.out.println(max);
        scanner.close();
    }
}
