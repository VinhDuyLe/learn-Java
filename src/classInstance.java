import java.util.Scanner;

public class classInstance {
    private int age;
    public classInstance(int initialAge) {
        if(initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0");
        }else {
            this.age = initialAge;
        }
    }
    public void amIOld() {
        if(age < 13) {
            System.out.println("You are young");
        }else if (age <18) {
            System.out.println("You are a teenager");
        }else {
            System.out.println("You are old");
        }
    }
    public void yearPasses() {
        age++;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int age = scanner.nextInt();
            classInstance p = new classInstance(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        scanner.close();
    }
}