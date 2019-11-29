package programmers.kakao2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ������ {

	public static void main(String[] args) {
		int[] stages = { 4,4,4,4,4 };
		solution(4, stages);
	}

	/**
	 * N ���������� �õ��� ��� �� : N�� ���ų� ũ��. 
	 * N ���������� �õ������� '����'�� ��� �� : N�� ����.(N�� �ӹ��� �ִ� ���)
	 * ������ = '����'�� ��� �� / �õ��� ��� ��
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

		Collections.sort(list); // �������� ����

		for (int i = 1; i <= N; i++) {

			bunja = list.lastIndexOf(i) - list.lastIndexOf(i - 1);
			bunmo = stages.length - list.indexOf(i);

			System.out.println("����::" + bunja + ",�и�::" + bunmo);

			map.put(i, (double) bunja / bunmo);

		}
		
		List<Integer> keySetList = new ArrayList<>(map.keySet());
		// �������� //
		Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		
		System.out.println(keySetList);
		
		int size = 0;
		for(Integer temp : keySetList) {
			answer[size++] = temp;
		}

		
		return answer;
	}
}
