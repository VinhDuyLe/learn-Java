import java.util.Scanner;

public class stringIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String S = scanner.nextLine();
            char[] charArray = S.toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(charArray[j]);
                }
            }
            System.out.print(" ");
            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(charArray[j]);
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
