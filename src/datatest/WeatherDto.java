package datatest;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class WeatherDto {
    private Response response;

    @AllArgsConstructor
    @Data
    class Response {
        private Header Header;
        private Body body;

        @AllArgsConstructor
        @Data
        class Header {
            private String resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor
        @Data
        class Body {
            private String dataType;
            private Items items;
            private int pageNo;
            private int numOfRows;
            private int totalCount;

            @AllArgsConstructor
            @Data
            class Items {
                private List<Item> item;

                @AllArgsConstructor
                @Data
                class Item {
                    public String baseDate;
                    public String baseTime;
                    public String category;
                    public String fcstDate;
                    public String fcstTime;
                    public String fcstValue;
                    public Integer nx;
                    public Integer ny;
                }
            }
        }
    }
}
