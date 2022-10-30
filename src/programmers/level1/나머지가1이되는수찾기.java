package programmers.level1;

import java.util.stream.IntStream;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/87389
 */
public class 나머지가1이되는수찾기 {
    public static void main(String[] args) {
        solution(10);
    }

    public static int solution(int n) {
        return IntStream.rangeClosed(2, n-1).filter(number->n%number==1).findFirst().getAsInt();
    }
}
