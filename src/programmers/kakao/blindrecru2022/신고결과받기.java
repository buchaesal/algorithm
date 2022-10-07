package programmers.kakao.blindrecru2022;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 신고결과받기 {
    public static void main(String[] args) {
        solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3);
    }

    // 원래 처음 작성했던 코드
    public static int[] solution(String[] id_list, String[] report, int k) {

        List<Integer> resultList = new ArrayList<>();
        Map<String, Integer> reportMap = new HashMap<>();
        Map<String, Integer> successMap = new HashMap<>();

        report = Stream.of(report).distinct().toArray(String[]::new);

        for(String content : report){
            String reported = content.split(" ")[1];
            reportMap.put(reported, reportMap.getOrDefault(reported, 0) + 1);
        }

        for(String content : report) {
            String reporter = content.split(" ")[0];
            String reported = content.split(" ")[1];

            if(reportMap.get(reported) >= k){
                successMap.put(reporter, successMap.getOrDefault(reporter, 0) + 1);
            }
        }

        for(String id : id_list){
            resultList.add(Optional.ofNullable(successMap.get(id)).orElse(0));
        }

        return resultList.stream().mapToInt(i->i).toArray();
    }

    // 속도는 더 느리지만, 간결한 코드..(다른사람 풀이 참고)
    public static int[] solution2(String[] id_list, String[] report, int k){
        Map<String, Integer> reportMap = new HashMap<>();

        List<String> distinctReport = Stream.of(report).distinct().collect(Collectors.toList());

        distinctReport.stream().forEach(content -> {
            String reported = content.split(" ")[1];
            reportMap.put(reported, reportMap.getOrDefault(reported, 0) + 1);
        });

        return Stream.of(id_list).map(id -> {

            List<String> list = distinctReport.stream().filter(r -> r.startsWith(id+" ")).collect(Collectors.toList());
            return list.stream().filter(content -> reportMap.getOrDefault(content.split(" ")[1], 0) >= k).count();

        }).mapToInt(Long::intValue).toArray();
    }

}
