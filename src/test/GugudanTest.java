package test;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int step = n1; step <= n2; step++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(step + "*" + i + "=" + (step * i));
            }
        }

    }
}
