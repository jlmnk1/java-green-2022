package stringex.practice;

public class StringPrac03 {
    public static void main(String[] args) {
        String str = "abcdef";
        int indexOf = str.indexOf("d");
        System.out.println("indexOf: " + indexOf);

        String str2 = "AdnroidApp";
        int lastIndexOf = str2.lastIndexOf("A");
        System.out.println("lastIndexOf:" + lastIndexOf);

        String str3 = "abcdef";
        int length = str3.length();
        System.out.println("length: " + length);

        String str4 = "A*B*C*D";
        String replace = str4.replace("*", "-");
        System.out.println("replace: " + replace);

        String str5 = "A:B:C:D:abcd";
        String[] split = str5.split(":");
        System.out.println("split: " + split[1]);

        String str6 = "ABCDEF";
        String substring = str6.substring(0, 2);
        System.out.println("substring: " + substring);
    }
}
