import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        String s2 = scan2.nextLine();

        System.out.println(i + i2);
        System.out.println(i + d2);
        System.out.println(s + s2);

        scan.close();
    }
}
