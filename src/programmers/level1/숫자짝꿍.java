package programmers.level1;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/131128
 */
public class 숫자짝꿍 {

    public static void main(String[] args) {
//        solution("100", "203045");
        String answer = solution2("100", "203045");
        System.out.println("main answer = "+answer);
    }

    /**
     * 성공..
     */
    public static String solution2(String X, String Y) {

        String answer = "";
        String first = X.length() >= Y.length() ? Y : X;
        String second = first.equals(X) ? Y : X;

        String[] firstArr = first.split("");
        String[] secondArr = second.split("");
        Arrays.sort(firstArr, Comparator.reverseOrder());
        Arrays.sort(secondArr, Comparator.reverseOrder());
        if("0".equals(firstArr[0]) || "0".equals(secondArr[0])) return "0";

        first = String.join("", firstArr);
        second = String.join("", secondArr);

        String[] distinctArr = Arrays.stream(firstArr).distinct().toArray(String[]::new);

        for(String alphabet : distinctArr){
            if(second.indexOf(alphabet) == -1) continue;

            int firstCnt = first.lastIndexOf(alphabet) - first.indexOf(alphabet) + 1;
            int secondCnt = second.lastIndexOf(alphabet) - second.indexOf(alphabet) + 1;

            answer += firstCnt < secondCnt ?
                    first.substring(first.indexOf(alphabet), first.lastIndexOf(alphabet) + 1)
                    : second.substring(second.indexOf(alphabet), second.lastIndexOf(alphabet) + 1);

        }

        if("".equals(answer)) return "-1";

        return answer.startsWith("0") ? "0" : answer;
    }

    /**
     * 속도 느려서 실패한 case
     */
    public static String solution(String X, String Y) {

        String answer = "";
        String first = X.length() > Y.length() ? X : Y;
        String second = first.equals(X) ? Y : X;

        String[] firstArr = first.split("");
        Arrays.sort(firstArr, Comparator.reverseOrder());
        if("0".equals(firstArr[0])) return "0";

        for(String target : firstArr){
            if(second.contains(target)) {
                second = second.replaceFirst(target, "");
                answer = answer + target;
            }
        }

        if("".equals(answer)) return "-1";

        return answer.startsWith("0") ? "0" : answer;
    }

}
