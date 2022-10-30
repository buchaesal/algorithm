package programmers.level2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12980
 */
public class 점프와순간이동 {
    public static void main(String[] args) {
        int a = new 점프와순간이동().solution(5000);
        System.out.println(a);
    }
    public int solution(int n) {

        int distance = n%2 == 0? n : n-1, answer = n%2 == 0 ? 0 : 1;

        while(distance > 0){
            distance /= 2;
            if(distance % 2 != 0){
                distance -= 1;
                answer++;
            }
        }

        return answer;
    }
}
