package programmers;

import java.util.Arrays;
import java.util.Stack;

public class 구명보트 {

    public static void main(String[] args) {
        solution(new int[]{70, 50, 80, 50}, 100);
    }
    public static int solution(int[] people, int limit) {
        int answer = 0, sum = 0, temp;
        Arrays.sort(people);

        for(int weight : people){
            if(sum < limit){
                sum += weight;
            }else{
                sum = weight;
                answer++;
            }
        }

        Stack<Integer> list = new Stack<>();
        list.add(0);

       while(list.size()==1){
           if(list.peek() == 0) list.add(1);
       }

        System.out.println(list.toString());


        //System.out.println(Arrays.toString(people));
        //System.out.println(answer);
        return answer;
    }
}
