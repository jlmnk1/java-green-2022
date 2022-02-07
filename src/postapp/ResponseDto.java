package postapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class ResponseDto {
    private int code;
    private String msg;
    private List<Board> data;
}
