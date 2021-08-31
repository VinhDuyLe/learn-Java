package Tutorial.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Lists2 {
    public static void main(String[] args) {
        List<Integer> newList2 = new ArrayList<>();
        newList2.add(5);
        newList2.add(6);
        newList2.add(10);

        int[] newArray2 = {5, 6, 3};

        int sum = creatList(newList2,newArray2);
        System.out.println(sum);

    }

    public static int creatList(List<Integer> newList, int[] newArray) {
        int sum = 0;
        for (int i = 0 ; i < newList.size(); i++ ) {
            sum += newList.get(i);
        }
        for (int i = 0; i < newArray.length; i++) {
            sum += newArray[i];
        }
        return sum;
    }
}
