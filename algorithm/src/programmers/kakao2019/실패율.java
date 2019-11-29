package programmers.kakao2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 실패율 {

	public static void main(String[] args) {
		int[] stages = { 2, 1, 2, 4, 2, 4, 3, 3};
		solution(5, stages);
	}

	/**
	 * N 스테이지에 시도한 사람 수 : N과 같거나 크다. 
	 * N 스테이지에 시도했지만 '실패'한 사람 수 : N과 같다.(N에 머물러 있는 사람)
	 * 실패율 = '실패'한 사람 수 / 시도한 사람 수
	 */
	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		Map<Integer, Double> map = new HashMap<Integer, Double>();
		int bunja;
		int bunmo;
		double rate;
		
//		ArrayList list = new ArrayList<>();
//		
//		for (int a : stages) {
//			list.add(a);
//		}
//
//		Collections.sort(list); // 오름차순 정렬
		
		/**
		 * indexOf, lastIndexOf를 쓸경우의 문제점 
		 * 1. i가 배열에 존재하지 않을 경우 -1을 return하는 문제 
		 * 이걸 해결 못해서 이중for문을 돌려버려따.
		 * 
		 */
		
		for (int i = 1; i <= N; i++) {
			bunja = 0;
			bunmo = 0;
			
//			bunja = list.lastIndexOf(i) - list.lastIndexOf(i - 1);
//			bunmo = stages.length - list.indexOf(i);
			
			for(int n : stages) {
				if(n>=i) bunmo++;
				if(n==i) bunja++;
			}

			System.out.println("분자::" + bunja + ",분모::" + bunmo + ",실패율::"+(double)bunja/bunmo);
			
			if(bunmo == 0) {
				rate = 0;
			}else {
				rate = (double) bunja / bunmo;
			}
			map.put(i, rate);
		}
		
		List<Integer> keySetList = new ArrayList<>(map.keySet());
		// 내림차순 //
		Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		
		System.out.println(keySetList);
		
		int size = 0;
		for(Integer temp : keySetList) {
			answer[size++] = temp;
		}

		return answer;
	}
}
