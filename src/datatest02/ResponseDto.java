package datatest02;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {
    private AirportDto airportDto;
    private FlightDto flightDto;

    @AllArgsConstructor
    @Data
    class AirportDto {
        private Response response; // 변수명을 꼭 동일하게!!

        @AllArgsConstructor
        @Data
        class Response {
            private Header header; // 변수명을 꼭 동일하게!!

            private Body body; // 변수명을 꼭 동일하게!!

            @AllArgsConstructor
            @Data
            class Header {
                private String resultCode;
                private String resultMsg;

            }

            @AllArgsConstructor
            @Data
            class Body {
                private Items items;
                private int numOfRows;
                private int pageNo;

                private int totalCount;

                @AllArgsConstructor
                @Data
                class Items {

                    private List<Item> item;

                    @AllArgsConstructor
                    @Data
                    class Item {
                        private String airportId;
                        private String airportNm;
                    }
                }
            }
        }
    }

    @AllArgsConstructor
    @Data
    public class FlightDto {
        private Response response; // 변수명을 꼭 동일하게!!

        @AllArgsConstructor
        @Data
        class Response {
            private Header header; // 변수명을 꼭 동일하게!!

            private Body body; // 변수명을 꼭 동일하게!!

            @AllArgsConstructor
            @Data
            class Header {
                private String resultCode;
                private String resultMsg;

            }

            @AllArgsConstructor
            @Data
            class Body {
                private Items items;
                private int numOfRows;
                private int pageNo;

                private int totalCount;

                @AllArgsConstructor
                @Data
                class Items {

                    private List<Item> item;

                    @AllArgsConstructor
                    @Data
                    class Item {
                        private String airlineNm;
                        private String arrAirportNm;
                        private String arrPlandTime;
                        private String depAirportNm;
                        private String depPlandTime;
                        private int economyCharge;
                        private int prestigeCharge;
                        private String vihicleId;
                    }
                }
            }
        }
    }
}
