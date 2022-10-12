package programmers.level2;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/70129
 */
public class 이진변환반복하기 {
    public static void main(String[] args) {
        solution("01110");
    }
    public static int[] solution(String s) {

        int changeCount = 0, removedZeroCount = 0;

        while(!s.equals("1")){
            while(s.contains("0")){
                s = s.replaceFirst("0","");
                removedZeroCount++;
            }

            s = Integer.toBinaryString(s.length());
            changeCount++;
        }

        int[] answer = {changeCount, removedZeroCount};

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
