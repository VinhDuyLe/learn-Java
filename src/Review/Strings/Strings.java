package Review.Strings;

public class Strings {
    public static void main(String[] args) {
        char[] creatlist = {'a', 'b', 'c', 'd'};
        System.out.println(creatlist);

        String name2 = new String(creatlist);
        System.out.println(name2);

        String name = "Vinh";
        System.out.println(name);

        char[] khanh = name.toCharArray();
        System.out.println(khanh);
    }
}
