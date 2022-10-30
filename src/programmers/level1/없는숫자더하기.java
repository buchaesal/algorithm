package programmers.level1;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */
public class 없는숫자더하기 {
    public static void main(String[] args) {
        solution(new int[]{1,2,3,4,6,7,8,0});
    }

    public static int solution(int[] numbers) {
        int answer = -1;
        int[] arr = {1,2,3,4,5,6,7,8,9};

        answer = Arrays.stream(arr).filter(number -> !Arrays.stream(numbers).anyMatch(n -> n == number)).sum();

        System.out.println(answer);

        return answer;
    }
}
