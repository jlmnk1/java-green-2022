package userapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {
    private int code; // 1성공, -1실패, 0데이터 없음
    private String mag; // 실패의 원인
    private List<User> data;
}
