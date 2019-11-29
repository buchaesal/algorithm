package programmers.kakao2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 실패율 {

	public static void main(String[] args) {
		int[] stages = { 4,4,4,4,4 };
		solution(4, stages);
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
		ArrayList list = new ArrayList<>();
		for (int a : stages) {
			list.add(a);
		}

		Collections.sort(list); // 오름차순 정렬

		for (int i = 1; i <= N; i++) {

			bunja = list.lastIndexOf(i) - list.lastIndexOf(i - 1);
			bunmo = stages.length - list.indexOf(i);

			System.out.println("분자::" + bunja + ",분모::" + bunmo);

			map.put(i, (double) bunja / bunmo);

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
