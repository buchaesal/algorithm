package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * [스택/큐] 기능개발
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 */
public class DevFunction {
    public static void main(String[] args) {
        solution(new int[]{1,2,3}, new int[]{100,100,100});
        solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
    }

    public static int[] solution(int[] progresses, int[] speeds) {

        int period; // 첫번째 배포일
        List<Integer> arr = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0, len = progresses.length; i<len; i++){
            if(len == 1) return new int[]{1};
            period = (int) Math.ceil((double)(100 - progresses[i]) / (double)speeds[i]);
            result.add(period);
        }

        System.out.println(result.toString());
        int cnt = 1; // 완료 작업 수
        int days = result.get(0); // 지나간 날짜 수

        for(int i=1, end = result.size();i<end;i++){
            if(days < result.get(i)){
                arr.add(cnt);
                days = result.get(i);
                cnt = 1;
            }else if(days == result.get(i)){
                cnt++;
            } else{
                cnt++;
            }
            if(i == end-1){
                arr.add(cnt);
            }
        }

        int[] realResult = new int[arr.size()];

        for(int i=0;i<realResult.length;i++){
            realResult[i] = arr.get(i);
        }

        System.out.println(Arrays.toString(realResult));
        return realResult;
    }
}

