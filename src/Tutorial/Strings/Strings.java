package Tutorial.Strings;

public class Strings {
    public static void main(String[] args) {
        char [] lists = {'a','b','c','d','g'};
        System.out.println(lists);
        String name = new String(lists);
        System.out.println(name);

        String name2 = "vinh";
        System.out.println(name2);

        char [] khanh = name2.toCharArray();
        System.out.println(khanh);
        System.out.println(khanh[3]);



    }
}
