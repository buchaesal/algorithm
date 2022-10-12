package programmers.level2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12945
 */
public class 피보나치수 {
    public static void main(String[] args) {
        solution(5);
    }

    // 필요한 사전지식 : 2의 보수, int 자료형의 범위
    // 모듈러 연산의 성질 : (A+B)%C == (A%C)+(B%C)%C
    public static int solution(int n) {
        int a = 0, b = 1, answer = 0;

        for(int i=2;i<=n;i++){
            answer = a+b;
            a = b;
            b = answer;
        }

        return ((a%1234567) + (b%1234567))%1234567;
    }
}
