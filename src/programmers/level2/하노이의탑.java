package programmers.level2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12946
 */
public class 하노이의탑 {

    public static void main(String[] args) {
        new 하노이의탑().solution(2);
    }
    public int[][] solution(int n) {
        int[][] answer = {};
        hanoi(1,2,3,n);

        return answer;
    }

    // from에서 via를 거쳐 to로 n을 옮긴다.
    private void hanoi(int from, int via, int to, int n){
        if(n == 0) return;

        hanoi(from, to, via, n-1);
        System.out.println(n+"을 "+from+"에서 "+via+"를 거쳐, "+to+"로");
        hanoi(via, from, to, n-1);
    }



}
