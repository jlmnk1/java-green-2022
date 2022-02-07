package postapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/post";
            URL url = new URL(addr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            if (dto.getCode() != 1) {
                System.out.println("통신 실패 : " + dto.getMsg());
                return;
            }

            System.out.println(dto.getData().size());
            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("게시판번호 : " + dto.getData().get(i).getId());
                System.out.println("게시판제목 : " + dto.getData().get(i).getTitle());
                System.out.println("게시판내용 : " + dto.getData().get(i).getId());
                System.out.println("==================================");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
