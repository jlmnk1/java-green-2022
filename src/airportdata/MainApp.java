package airportdata;

import java.util.List;
import java.util.Scanner;

import airportdata.FlightDto.Response.Body.Items.Item;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== 출발일을 입력하세요 =====");
        System.out.println("ex) 20220125");
        // arrAirportNm 값이 길이가 2자가 아니면 프로그램 종료
        String depPlandTime = sc.nextLine();

        System.out.println("===== 출발지를 입력하세요 =====");
        System.out.println("ex) 김포, 김해, 제주");
        // arrAirportNm 값이 길이가 2자가 아니면 프로그램 종료
        String depAirportNm = sc.nextLine();

        System.out.println("===== 도착지를 입력하세요 =====");
        System.out.println("ex) 김포, 김해, 제주");
        // arrAirportNm 값이 길이가 2자가 아니면 프로그램 종료
        String arrAirportNm = sc.nextLine();

        List<Item> flightList = DownloadFlight.getFlightList(depPlandTime, depAirportNm, arrAirportNm);
        // System.out.println(flightList);
        for (int i = 0; i < flightList.size(); i++) {
            System.out.println("=======================");
            System.out.println("출발시간 : " + flightList.get(i).getDepPlandTime());
            System.out.println("도착시간 : " + flightList.get(i).getArrPlandTime());
            System.out.println("요금 : " + flightList.get(i).getEconomyCharge());
            System.out.println("항공사 : " + flightList.get(i).getAirlineNm());
            System.out.println("=======================");
        }
    }
}
