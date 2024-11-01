package programmers;

import java.util.*;
import java.util.stream.Collectors;

public class 옹알이 {
    public static void main(String[] args) {
//        int result = new 옹알이().solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});
        int result = new 옹알이().solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
        System.out.println(result);
    }

    public int solution(String[] babbling) {
        int answer = 0;
        List<String> speakable = Arrays.asList("aya", "ye", "woo", "ma");
        for (String b : babbling) {
            String[] words = new String[b.length()];
            for (String c : speakable) {
                if (b.indexOf(c) != -1) {
                    words[b.indexOf(c)] = c;
                }
            }
            String result = Arrays.stream(words).filter(w -> w != null).collect(Collectors.joining());
            System.out.println(result);
            if (b.equals(result)) {
                answer++;
            }
        }
        return answer;
    }
}
