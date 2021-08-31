import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        elements = a;
    }
    public void computeDifference () {
        int max = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                int diff = Math.abs(elements[i] -elements[j]);
                if (diff > max) {
                    max = diff;
                }
            }
        }
        maximumDifference = max;
    }
}
public class scope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        Difference difference = new Difference(a);

        difference.computeDifference();
        System.out.println(difference.maximumDifference);
    }
}
