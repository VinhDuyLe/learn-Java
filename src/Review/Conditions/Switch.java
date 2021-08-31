package Review.Conditions;

public class Switch {
    public static void main(String[] args) {
        char[] lists = {'1', '2', '3', '4'};
        for (char i : lists) {
            switch (i) {
                case '1':
                    System.out.println(1);
                    break;
                case '2':
                    System.out.println(2);
                    break;
                case '3':
                    System.out.println(3);
                    break;
                case '4':
                    System.out.println(4);
                    break;
                default:
                    System.out.println("No value");
            }
        }
    }
}
