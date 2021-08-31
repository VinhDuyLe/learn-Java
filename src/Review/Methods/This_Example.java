package Review.Methods;

public class This_Example {
    int num = 10;

    This_Example () {
        System.out.println("without object");
    }
    This_Example (int num) {
        this.num = num;
    }

    private void greet () {
        System.out.println("Hello");
    }

    public void print () {
        int num = 20;
        System.out.println("local" + num);
        System.out.println("global num" + this.num);
        this.greet();
    }

}
