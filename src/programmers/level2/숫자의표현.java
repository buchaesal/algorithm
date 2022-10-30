package programmers.level2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12924
 */
public class 숫자의표현 {
    public static void main(String[] args) {
        solution(15);
    }
    public static int solution(int n) {

        int answer = 0, sum, start = 1;

        while(start!=n){
            sum = 0;
            for(int i=start;i<=n;i++){
                sum += i;
                if(sum > n) break;
                if(sum == n) {
                    answer++;
                    break;
                }
            }
            start++;
        }

        return answer;
    }
}
