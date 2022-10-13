package programmers.kakao.blindrecru2022;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/92341
 */
public class 주차요금계산 {
    public static void main(String[] args) {
        // [기본시간(분), 기본요금(원), 단위시간(분), 단위요금(원)]
        new 주차요금계산().solution(new int[]{180, 5000, 10, 600},
                new String[]{
                        "05:34 5961 IN",
                        "06:00 0000 IN",
                        "06:34 0000 OUT",
                        "07:59 5961 OUT",
                        "07:59 0148 IN",
                        "18:59 0000 IN",
                        "19:09 0148 OUT",
                        "22:59 5961 IN",
                        "23:00 5961 OUT"});
    }
    public int[] solution(int[] fees, String[] records) {

        Map<String, CarRecord> recordMap = new TreeMap<>();
        Fee fee = new Fee(fees);

        Arrays.stream(records).map(record -> record.split(" ")).forEach(arr -> {
            if(recordMap.get(arr[1]) != null){
                recordMap.get(arr[1]).record(arr[2], arr[0]);
            }else{
                recordMap.put(arr[1], new CarRecord(arr[1], arr[2], arr[0]));
            }
        });

        int[] answer = new int[recordMap.size()];
        int index = 0;
        for(Map.Entry<String, CarRecord> element : recordMap.entrySet()){
            if(element.getValue().status.equals("IN")){
                element.getValue().record("OUT", "23:59");
            }
            answer[index] = fee.calculateParkingFee(element.getValue().usingTime);
            index++;
        }

        System.out.println(recordMap);
        System.out.println(Arrays.toString(answer));

        return answer;
    }


    class CarRecord {
        String id;
        String status;
        String inTime;
        int usingTime;

        CarRecord(String id, String status, String recentTime){
            this.id = id;
            this.status = status;
            this.inTime = recentTime;
            this.usingTime = 0;
        }

        public void record(String status, String time){
            this.status = status;
            if("OUT".equals(status)){
                String[] inputTimeArr = time.split(":");
                String[] recentTimeArr = inTime.split(":");
                int hour =  Integer.parseInt(inputTimeArr[0]) - Integer.parseInt(recentTimeArr[0]);
                int minute = Integer.parseInt(inputTimeArr[1]) - Integer.parseInt(recentTimeArr[1]);
                this.usingTime += hour * 60 + minute;
            }else{
                this.inTime = time;
            }
        }

    }

    class Fee {
        int defaultTime;
        int defaultFee;
        int unitTime;
        int unitFee;

        Fee(int[] fees){
            this.defaultTime = fees[0];
            this.defaultFee = fees[1];
            this.unitTime = fees[2];
            this.unitFee = fees[3];
        }

        public int calculateParkingFee(int parkingTime){
            return defaultFee + (int)Math.ceil((double)(parkingTime - defaultTime > 0 ? parkingTime - defaultTime : 0)/unitTime) * unitFee;
        }
    }
}
