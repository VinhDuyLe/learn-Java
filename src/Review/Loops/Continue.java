package Review.Loops;

public class Continue {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 8, 20};
        for (int i : numbers) {
            if (i == 9) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
