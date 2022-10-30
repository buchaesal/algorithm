package programmers.level1;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42862
 */
public class 체육복 {

	public static void main(String[] args) {
		solution(5, new int[]{1,2,4}, new int[]{1,3,5});
	}

	static public int solution(int n, int[] lost, int[] reserve) {

		int answer = n;

		int[] new_lost = Arrays.stream(lost)
				.filter(l -> !Arrays.stream(reserve).boxed().collect(Collectors.toList()).contains(l))
				.sorted()
				.toArray();

		int[] new_reserve = Arrays.stream(reserve)
				.filter(l -> !Arrays.stream(lost).boxed().collect(Collectors.toList()).contains(l))
				.sorted()
				.toArray();

		for(int lostNumber : new_lost){
			boolean find = false;
			for(int i=0; i<new_reserve.length; i++){
				if(new_reserve[i] < 0) continue;

				if(lostNumber-1 == new_reserve[i] || lostNumber+1 == new_reserve[i]){
					new_reserve[i] = -1;
					find = true;
					break;
				}
			}
			if(!find) answer = answer - 1;
		}

	        return answer;
	    }

}
