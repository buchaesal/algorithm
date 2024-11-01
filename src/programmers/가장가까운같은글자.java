package programmers;

import java.util.*;

public class 가장가까운같은글자 {
    public static void main(String[] args) {
        int[] result = new 가장가까운같은글자().solution("banana");
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] words = s.split("");
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (indexMap.get(words[i]) == null) {
                indexMap.put(words[i], s.indexOf(words[i]));
                answer[i] = -1;
            } else {
                answer[i] = i - indexMap.get(words[i]);
                indexMap.put(words[i], i);
            }
        }
        return answer;
    }
}
