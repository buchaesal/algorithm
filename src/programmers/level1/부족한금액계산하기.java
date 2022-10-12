package programmers.level1;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/82612
 */
public class 부족한금액계산하기 {
    public static void main(String[] args) {
        solution(3,20,4);
    }
    public static long solution(int price, int money, int count) {
        long answer = 0;

        for(int i=1; i<=count; i++){
            answer += price * i;
        }

        return money - answer < 0 ? 0 : answer - money;
    }
}
