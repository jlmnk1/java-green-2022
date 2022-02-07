package lottoex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test06 {
    public static void main(String[] args) {
        List<Integer> lotto1 = Arrays.asList(1, 3, 5, 7, 9, 10);
        ArrayList<Integer> lotto2 = new ArrayList<>();
        lotto2.add(1);
        lotto2.add(3);
        lotto2.add(5);
        lotto2.add(6);
        lotto2.add(7);
        lotto2.add(10);

        int failcheck = 0;
        final int LOTTOCYCLE = lotto1.size(); // final이 붙은 변수는 대문자로 정의한다.

        for (int i = 0; i < LOTTOCYCLE; i++) {

        }

        if (lotto1.get(0) == lotto2.get(0)) {
            System.out.println("0번지의 값이 일치합니다.");
        } else {
            failcheck = failcheck + 1;
        }

    }
}
