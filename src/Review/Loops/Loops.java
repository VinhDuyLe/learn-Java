package Review.Loops;

public class Loops {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("");

        String[] lists = {"A", "B", "C", "D", "E"};
        for (int i = 0; i < lists.length; i++) {
            System.out.print(lists[i] + " ");
        }
    }
}
