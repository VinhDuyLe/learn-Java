package Tutorial.Loops;

public class Break {
    public static void main(String[] args) {
        int [] numbers = {4,6,10,29};
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 10){
                break;
            }
            System.out.println(numbers[i]);
        }
        for (int x : numbers) {
            if ( x == 10) {
                break;
            }
            System.out.println(x);
        }

    }

}
