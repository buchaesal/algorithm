package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RescueBoat {

    public static void main(String[] args) {
        solution(new int[]{70, 50, 80, 50}, 100);
    }

    public static int solution(int[] people, int limit) {
        int answer = 1, sum = 0;
        Queue<Integer> waiting = new LinkedList<>();

        Arrays.sort(people);

        for(int weight : people){
            waiting.add(weight);
        }

        while(!waiting.isEmpty()){
            if(sum < limit && sum + waiting.peek() <= limit){
                sum += waiting.poll();
            }else{
                sum = 0;
                answer++;
            }
        }

        //System.out.println(Arrays.toString(people));
        //System.out.println(answer);
        return answer;
    }
}
