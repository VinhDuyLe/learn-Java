package Tutorial.IO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaException {
    // b=0 cach 2 ngoai try,catch, if (b==0)...
    static double div(int a, int b) {
        if(b==0) {
           throw new ArithmeticException("khong thuc hien phep chia");
        }
        return a/b;
    }
    static void showLength(String str) {
        if(str != null) {
            System.out.println("Length of this String " + str.length());
        }else {
            System.out.println("String input value is null");
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        //b=0 cach 1. try catch de xu ly, co nhieu cach xu ly
        try {
            double res = div(a, b);
            System.out.println(a + "/" + b + "=" + res);
        }catch(ArithmeticException ar) {
            System.out.println(ar.getMessage());  //message auto la / b zero; or set up mess o method throw
            System.out.println("mau so bang khong");
        }
        System.out.println("abc");

        //java nullPointerexception, ex str = null
        String str = null;
        showLength(str);

        //Array IndexOutOfBoundsException
        int[] arr = new int[] {1,2, 4, 6,8};
        System.out.println("arr[5] = " + arr[4]);

        //Input MismatchException (if input not integer...)
        //Catch (Exception e) ...Exception nay la lop cha, nen all exception apply

        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input a integer");
        try {
            x = sc.nextInt();
            System.out.println("value x = " + x);
        }catch(InputMismatchException mis) {
            System.out.println(mis.getMessage());
        }
    }
}
