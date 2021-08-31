package Tutorial.Conditions;

public class Switch {
    public static void main(String[] args) {
        char [] a = {'5' ,'6' ,'7'};
        for (char c : a) {
            switch (c) {
                case '5':
                    System.out.println(5);
                    break;
                case '6':
                    System.out.println(6);
                    break;
                case '4':
                    System.out.println(4);
                    break;
                default:
                    System.out.println("no value");
            }
        }
    }
}
