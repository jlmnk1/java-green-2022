package datatest;

import java.util.Map;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====부산의 날씨를 출력합니다.====");
        System.out.println("=====오늘 날짜를 입력하세요 =====");
        System.out.println("ex) 20220126");
        String baseDate = sc.nextLine();

        if (baseDate.length() != 8) {
            System.out.println("날짜를 잘못 입력하셨습니다.");
            System.exit(0);
        }

        System.out.println("=====현재 시간을 입력하세요 =====");
        System.out.println("ex) 0900 (정시단위)");

        String baseTime = sc.nextLine();
        if (baseTime.length() != 4) {
            System.out.println("시간을 잘못 입력하셨습니다.");
            System.exit(0);
        }
        Map<String, String> weatherMap = DownloadWeather.getWeathertList(baseDate, baseTime);

        System.out.println("현재 부산의 온도는 " + weatherMap.get("T1H") + "도 입니다");
    }
}
