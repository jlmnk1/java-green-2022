package postapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Board {
    private int id;
    private String title;
    private String content;
    private List<User> user;
    private String created;
    private String updated;
}
