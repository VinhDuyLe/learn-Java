package Review.Loops;

public class Break {
    public static void main(String[] args) {
        int[] numbers = {6, 4, 10, 20};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 10) {
                break;
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");

        for (int i : numbers) {
            if (i == 10) {
                break;
            }
            System.out.print(i + " ");
        }
    }

}
