package Review.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {6, 8, 10, 20, 30};
        printItems(numbers);
        System.out.println(" ");

        int sum = findSum(numbers);
        System.out.println(sum);

        int max = findMax(numbers);
        System.out.println(max);

        int sum2 = findSum2(numbers, 10);
        System.out.println(sum2);

    }
    public static void printItems(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
    public static int findSum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
    public static int findMax(int[] a) {
        int max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static int findSum2(int[] a, int b){
        int sum = 0;
        for (int i : a) {
            if (i > b) {
                sum += i;
            }
        }
        return sum;
    }
}
