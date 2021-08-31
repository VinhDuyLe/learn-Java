package Tutorial.Methods;

public class This_Example {
    int num = 10;

    This_Example() {
        System.out.println("ljlkfjsdalk");
    }

    This_Example(int num) {
        this.num = num;
    }

    private void greet() {
        System.out.println("Welcome");
    }

    public void print() {
        int num = 20;

        System.out.println("local num " + num);
        System.out.println("global num" + this.num);
        this.greet();
    }

}

