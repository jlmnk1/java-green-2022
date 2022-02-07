package stringex.practice;

public class StringPrac04 {
    public static void main(String[] args) {
        String str1 = "A";
        String str2 = "A";
        int compareTo = str1.compareTo(str2);
        System.out.println(compareTo);
        if (compareTo > 0) {
            System.out.println(str1 + " > " + str2);
        } else if (compareTo == 0) {
            System.out.println(str1 + " = " + str2);
        } else {
            System.out.println(str1 + " < " + str2);
        }
    }
}
