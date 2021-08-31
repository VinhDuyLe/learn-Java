package Tutorial.InterOuter;

public class Outer2 {
    private int age = 120;

    public void doST() {
        class Inner {
            private int a;
            public void sayHello(){

            }
            public final static float x = 1.2345f;
        }
    }
}
