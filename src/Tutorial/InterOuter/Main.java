package Tutorial.InterOuter;

public class Main {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.sayHello();

        Outer out2 = new Outer(20);
        out2.sayHello();

        System.out.println("\n");

        Outer.Inner inn = new Outer().new Inner();
        inn.showIfo();

        // same anonymous inner class
        Calculator cal = new Calculator() {
            @Override
            public float add(float a, float b) {
                return a + b;
            }
        };
    }
}
