package Tutorial.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        printList();
        printArrays();

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(5);
        list2.add(6);
        list2.add(11);

        int min = list(list2);
        System.out.println(min);

        List<Integer> list3 = listSquare(list2);
        System.out.println(list3);
    }
    public static void printList() {
        List<String> a1 = new ArrayList<String>();
        a1.add("abc");
        a1.add("c");
        a1.add("e");

        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
        for (String i : a1) {
            System.out.println(i);
        }
        a1.remove(1);
        a1.add("m");
        System.out.println(a1);
    }
    public static void printArrays() {
        String[] array = new String[3];
        array[0] = "abc";
        array[1] = "c";
        array[2] = "e";

        for (String i : array) {
            System.out.println(i);
        }
    }
    public static int list(List<Integer> a) {
        int min = a.get(0);
        for (int i = 0 ; i < a.size(); i++) {
            if (a.get(i) < min) {
                min = a.get(i);
            }
        }
        return min;
    }

    public static List<Integer> listSquare(List<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            a.set(i, a.get(i) * a.get(i));
        }
        return a;
    }

}
