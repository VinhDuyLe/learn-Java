package Review.ArraysLists;

public class FindMax {
    public static void main(String[] args) {
        int max = listNumber(6, -9, 5);
        System.out.println(max);

        int max2 = listNumber2(-7, -3);
        System.out.println(max2);

        printDay(3);
    }

    public static int listNumber(int a, int b, int c) {
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

    public static int listNumber2(int a, int b) {
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
        if (d == 1) {
            dayString1 = "Saturday";
            dayString2 = "Sunday";
        } else if (d == 2) {
            dayString1 = "Tuesday";
            dayString2 = "Monday";
        } else if (d == 3) {
            dayString3 = "Friday";
        }
        System.out.println(dayString1 + " " + dayString2 + " " + dayString3);
    }
}
