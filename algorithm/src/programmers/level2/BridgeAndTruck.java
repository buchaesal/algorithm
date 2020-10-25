package programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * [스택/큐] 다리를 지나는 트럭
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 */
public class BridgeAndTruck {
    public static void main(String[] args) {

        int answer = solution(2, 10, new int[]{7,4,5,6});
        //int answer = solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10});
        System.out.println(answer);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Integer> waiting = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        List<Integer> complete = new ArrayList<>();

        for(int i : truck_weights){
            waiting.add(i);
        }

        for(int i = 0 ; i < bridge_length; i++){
            bridge.add(null);
        }

        Integer truck;
        int answer = 0;

        while(complete.size() != truck_weights.length){
            truck = waiting.peek();

            if(truck == null){
                answer += bridge_length;
                break;
            }else{
                if(getBridgeWeight(bridge) + truck <= weight){
                    if(bridge.peek() != null){
                        complete.add(bridge.remove());
                    }else{
                        bridge.remove();
                    }
                    bridge.add(waiting.remove());
                    answer++;
                }else{

                    while(bridge.peek() == null){
                        bridge.add(bridge.remove());
                        answer++;
                    }

                    complete.add(bridge.remove());

                    if(getBridgeWeight(bridge) + truck <= weight){
                        bridge.add(waiting.remove());
                    }else{
                        bridge.add(null);
                    }

                    answer++;
                }
            }

        }

        return answer;
    }

    static int getBridgeWeight(Queue<Integer> bridge) {
        int result = 0;
        for (Integer i : bridge) {
            result += (i == null ? 0 : i);
        }
        return result;
    }
}
