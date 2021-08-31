package Tutorial.ArrayLists;

public class FindMax {
    public static void main(String[] args) {
        int max = number(5, -6,9);
        System.out.println(max);

        int max2 = number2(5, -9);
        System.out.println(max2);

        printDay(3);

    }

    public static int number(int a, int b, int c) {
        int max = a;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }
    public static int number2(int a, int b) {
        int max = a;
        if (a > b) {
          max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static void printDay(int d) {
        String dayString1 = "", dayString2 = "", dayString3 = "";

        if ( d == 1) {
            dayString1 = "Saturday";
            dayString2 = "Sunday";
        } else if (d == 2) {
            dayString2 = "Sunday";
        } else if (d == 3) {
            dayString3 = "Monday";
        }
        System.out.println(dayString1 + " " + dayString2 + " " + dayString3);
    }
}
