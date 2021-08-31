package Assignment;

public class Arrays {
    public static void main(String[] args) {
        int[] lists = {5, 6, 7, 8, 4, 3};

        int sum = sumArrays(lists);
        System.out.println(sum);

        int sumOdd = sumOddArrays(lists);
        System.out.println(sumOdd);

        int sumEven = sumEvenArrays(lists);
        System.out.println(sumEven);

        printEvenArrays(lists);
        System.out.println("\n");
        printGreaterArrays(lists, 5);
        System.out.println("\n");

        double avg = avgArrays2(lists);
        System.out.println(avg);

        printIndexArrays(lists);
        System.out.println("\n");

        int index = findIndexArrays(lists, 9);
        if (index == -1) {
            System.out.println("this value not exist in arrays");
        } else {
            System.out.println(index);
        }
        System.out.println("");

        removeArrays(lists, 3);
        System.out.println("");

        removeArrays2(lists, 3);

        System.out.println(maxArrays(lists));
        System.out.println(minArrays(lists));
        System.out.println("\n");

        int[] a2 = copyArrays(lists);

        int[] insertA = insertArrays(lists,10,11);
        for (int i: insertA) {
            System.out.print(i + " ");
        }

        System.out.println("");
        reverse(lists);

        secondMaxArrays(lists);
        secondMinArrays(lists);

        int countEven = countEvenArrays(lists);
        System.out.println(countEven);

        int countOld = countOddArrays(lists);
        System.out.println(countOld);

    }
    //Write a Java method program to sum values of an array.//
    public static int sumArrays(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        return sum;
    }
    //Write a Java method program to sum odd values of an array.//
    public static int sumOddArrays(int[] a) {
        int sum = 0;
        for (int i : a ) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
    //Write a Java method program to sum even values of an array.//
    public static int sumEvenArrays(int[] a) {
        int sum = 0;
        for (int i : a) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    //Write a Java method program to print out even values of an array.//
    public static void printEvenArrays(int[] a) {
        for (int i : a) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    //Write a Java method program to print out values greater than 5 of an array.//
    public static void printGreaterArrays(int[] a, int b) {
        for (int i : a) {
            if (i > b) {
                System.out.println(i);
            }
        }
    }
    //Write a Java method to calculate the average value of array elements.//
    public static double avgArrays(int[] a) {
        double sum = 0;
        double avg = 0;
        for (int i : a) {
            sum += i;
        }
        avg = sum / a.length;
        return avg;
    }
    public static double avgArrays2(int[] a) {
        int sum = sumArrays(a);
        double avg = (double)sum / a.length;
        return avg;
    }
    //Write a Java method to print all the index of an array element.//
    public static void printIndexArrays(int[] a) {
        for (int i = 0 ; i < a.length; i++) {
            System.out.println(i + " " + a[i]);
        }
    }
    //Write a Java method to find the index of an array element.//
    public static int findIndexArrays(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    }
    //Write a Java method to remove a specific element from an array.//
    public static void removeArrays(int[] a, int index) {
        int[] a2 = new int[a.length -1];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i == index) {
                continue;
            }
            a2[j++] = a[i];
        }
        for (int i : a2) {
            System.out.println(i);
        }
    }
    public static void removeArrays2(int[] a, int index) {
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i == index) {
                continue;
            }
            a[j++] = a[i];
        }
        a[a.length-1] = 0;
        for (int i : a) {
            System.out.println(i);
        }
    }

    // Write a Java method to find the maximum and minimum value of an array//
    public static int maxArrays(int[] a) {
        int max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static int minArrays(int[] a) {
        int min = a[0];
        for (int i : a) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    //Write a Java method to copy an array by iterating the array.//
    public static int[] copyArrays(int[] a) {
        int[] a2 = new int[a.length];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = a[i];
        }
        return a2;
    }
    //Write a Java method to insert an element (specific position) into an array. //
    public static int[] insertArrays(int[] a, int b, int index) {
        int[] a2 = new int[a.length + 1];
        for (int i = 0 , j = 0; j < a2.length && i < a.length;) {
            if (j == index) {
                a2[j++] = b;
            } else {
                a2[j++] = a[i++];
            }
        }
        return a2;
    }
    //Write a Java method to find the maximum and minimum value of an array.//
    // Write a Java method to reverse an array of integer values.//
    public static void reverse(int[] a) {
        for(int i = 0 ; i < a.length/2; i++) {
            int b = a[a.length - 1- i];
            a[a.length - 1 - i] = a[i];
            a[i] = b;
        }
        for (int i = 0 ; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    //Write a Java method to find the second largest element in an array. //
    public static void secondMaxArrays(int[] a) {
        int b;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        System.out.println("Second largest element: " + a[a.length-2]);
    }
    //Write a Java method to find the second smallest element in an array.//
    public static void secondMinArrays(int[] a) {
        int b;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        System.out.println("The second smallest: " + a[a.length - 1]);
    }

    //Write a Java method to find the number of even and odd integers in a given array of integers.//
    public static int countEvenArrays(int[] a) {
        int countEven = 0;
        for (int i : a) {
            if (i % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }
    public static int countOddArrays(int[] a) {
        int countOdd = 0;
        for (int i : a) {
            if (i % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;
    }
    //Write a Java method to find the smallest number among three numbers.//

}
