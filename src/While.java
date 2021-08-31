public class While {
    public static void main(String[] args) {
        int x = 10;

        while (x < 20) {
            System.out.println("value of x : " + x);
            x++;
        }
        System.out.println("\n");
        x = 10;
        do {
            System.out.println("value of x : " + x);
            x++;
        } while ( x < 20);

        for ( x = 10; x < 20; x++ ) {
            System.out.println("Value of x : " + x);
        }

        System.out.println();
    }
}
