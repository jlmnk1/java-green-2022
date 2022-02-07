package userapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/user";
            URL url = new URL(addr);
            // conn은 ByteStream 아직 방향을 안정했음
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            // 1. 통신검증
            if (dto.getCode() != 1) {
                System.out.println("통신 실패 : " + dto.getMag());
                return;
            }

            // 2. 프로그램 만들기

            // 1) 화면에 회원정보를 출력 for문 사용
            System.out.println(dto.getData().size());
            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("회원번호 : " + dto.getData().get(i).getId());
                System.out.println("회원이름 : " + dto.getData().get(i).getUsername());
                System.out.println("회원비밀번호 : " + dto.getData().get(i).getPassword());
                System.out.println("회원메일 : " + dto.getData().get(i).getEmail());
                System.out.println("생성날짜 : " + dto.getData().get(i).getCreated());
                System.out.println("수정날짜: " + dto.getData().get(i).getUpdated());
                System.out.println("==============================");
            }

        } catch (Exception e) {
            e.printStackTrace(); // 오류를 추적할 수 있는 로그를 콘솔에 보여줌
        }
    }
}
