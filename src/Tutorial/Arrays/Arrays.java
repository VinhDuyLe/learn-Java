package Tutorial.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] lists = {3, 5, 6, 11, 9};
        int sum = 0;
        int max = lists[0];

        items(lists);

        sum = findSum(lists);
        System.out.println(sum);

        max = findMax(lists);
        System.out.println(max);

        int sum2 = findSum2(lists, 5);
        System.out.println(sum2);

    }
    public static int findMax(int[] a) {
        int max = a[0];
        for (int i: a) {
            if (i > max ) {
                max = i;
            }
        }
        return max;
    }
    public static int findSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    public static void items(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static int findSum2(int[] a, int b) {
        int sum = 0;
        for (int i: a) {
            if (i > b) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
