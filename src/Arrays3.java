public class Arrays3 {

    public static void main(String[] args) {
        int[] b = {6, 9, 1, 4, 5};
        int x = func(b, 1);
        System.out.println(x);
    }

    public static int func(int[] arr, int elem) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem)
                x = 1;
            else
                x = 0;
        }
        return x;
    }
}
