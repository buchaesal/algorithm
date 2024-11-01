package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class 명예의전당1 {

    public static void main(String[] args) {
        int[] result = new 명예의전당1().solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            scores.add(score[i]);
            List<Integer> sortedList = scores.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).subList(0, Math.min(scores.size(), k));
            answer[i] = sortedList.get(sortedList.size() - 1);
        }

        return answer;
    }

}
