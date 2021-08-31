package Tutorial.Loops;

public class Continue {
    public static void main(String[] args) {
        int [] numbers = {6 , 9, 10, 29, 30};

        for (int x : numbers) {
            if (x == 10) {
                continue;
            }
            System.out.println(x);
        }
    }
}
