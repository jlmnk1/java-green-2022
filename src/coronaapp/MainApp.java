package coronaapp;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====코로나 현황 범위를 출력합니다.====");
        System.out.println("=====시작 날짜를 입력하세요 =====");
        System.out.println("ex) 20220110");
        String startDt = sc.nextLine();
        System.out.println("");

        System.out.println("=====마지막 날짜를 입력하세요 =====");
        System.out.println("ex) 20220115");
        String endDt = sc.nextLine();
        System.out.println("");

        List<Item> coronaDt = DownloadCorona.getCoronaList(startDt, endDt);

        for (int i = coronaDt.size() - 1; i > 0; i--) {
            System.out.println("해당 날짜 : " + coronaDt.get(i).getStateDt());
            System.out.println("누적 검사자 수 : " + coronaDt.get(i).getAccExamCnt());
            System.out.println("확진자 수 : " + coronaDt.get(i).getDecideCnt());
            System.out.println("사망자 수 : " + coronaDt.get(i).getDeathCnt());
            System.out.println("==============================");
        }
    }
}
