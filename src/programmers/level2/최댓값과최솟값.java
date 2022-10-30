package programmers.level2;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12939
 */
public class 최댓값과최솟값 {
    public static void main(String[] args) {
        new 최댓값과최솟값().solution("-1 -2 -3 -4");
    }
    public String solution(String s) {

        int[] arr = Arrays.stream(s.split(" ")).mapToInt(i-> Integer.parseInt(i)).toArray();
        Arrays.sort(arr);

        return arr[0] + " " + arr[arr.length-1];
    }
}
