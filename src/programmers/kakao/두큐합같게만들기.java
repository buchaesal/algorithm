package programmers.kakao;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/118667
 */
public class 두큐합같게만들기 {

    public static void main(String[] args) {
        new 두큐합같게만들기().solution(
                new int[]{ 1, 4},
                new int[]{3, 4});
    }

    /**
     * 이 문제의 교훈 ,, while문을 쓸때는 최대한 무한루프가 돌 수 없게끔 조건을 설정하자.
     * 내가 놓쳤던 부분 : 원소가 다 같다고 한바퀴가 다 돈것이 아님..
     */
    public int solution(int[] queue1, int[] queue2) {

        int len = queue1.length;
        Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();
        long q1Sum = 0, q2Sum = 0, targetSum;

        for(int i=0; i<len; i++){
            q1.add(queue1[i]);
            q1Sum += queue1[i];
            q2.add(queue2[i]);
            q2Sum += queue2[i];
        }

        targetSum = (q1Sum + q2Sum)/2;
        if(q1Sum == targetSum && q2Sum == targetSum) return 0;

        int q1Count = 0, q2Count = 0;

        while(q1Count<=len*2 && q2Count<=len*2){

            if(q1Sum == targetSum) {
                return q1Count+q2Count;
            }

            if(q1Sum >= targetSum){
                q2Sum += q1.peek();
                q1Sum -= q1.peek();
                q1Count++;

                q2.add(q1.poll());
            }else{
                q1Sum += q2.peek();
                q2Sum -= q2.peek();
                q2Count++;

                q1.add(q2.poll());
            }

        }

        return -1;
    }

}
