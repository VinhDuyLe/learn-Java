package Tutorial.InterOuter;

public class Outer {
    private int age;

    public Outer() {
        age = 100;
    }
    public Outer(int age) {
        this.age = age;
    }
    public void sayHello(){
        Inner inner = new Inner();
        inner.show();
    }
    public class Inner {
        private String name;
        private float f;

        public final static int MAX = 299;
        public void showIfo() {
            System.out.println("outer age " + age);
            sayHello();
        }
        void show() {
            System.out.println("Say hello from inner class");
            System.out.println("Outer age = " + Outer.this.age);
        }

    }
}
