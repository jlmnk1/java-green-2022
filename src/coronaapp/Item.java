package coronaapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Item {
    private int accExamCnt;
    private String createDt;
    private int deathCnt;
    private int decideCnt;
    private int seq;
    private int stateDt;
    private String stateTime;
    private String updateDt;
}