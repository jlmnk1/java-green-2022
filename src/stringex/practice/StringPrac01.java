package stringex.practice;

public class StringPrac01 {
    public static void main(String[] args) {
        String str = "apple";
        boolean startsWith = str.startsWith("a");
        System.out.println("startsWith: " + startsWith);

        String str2 = "test";
        boolean endsWith = str2.endsWith("t");
        System.out.println("endsWith: " + endsWith);
    }
}
