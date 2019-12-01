package programmers.kakao2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FailureRate{

	public static void main(String[] args) {
		int[] stages = { 2, 1, 2, 4, 2, 4, 3, 3};
		solution(5, stages);
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
		double rate;
		
//		ArrayList list = new ArrayList<>();
//		
//		for (int a : stages) {
//			list.add(a);
//		}
//
//		Collections.sort(list); // �������� ����
		
		/**
		 * indexOf, lastIndexOf�� ������� ������ 
		 * 1. i�� �迭�� �������� ���� ��� -1�� return�ϴ� ���� 
		 * �̰� �ذ� ���ؼ� ����for���� ����������.
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

			System.out.println("����::" + bunja + ",�и�::" + bunmo + ",������::"+(double)bunja/bunmo);
			
			if(bunmo == 0) {
				rate = 0;
			}else {
				rate = (double) bunja / bunmo;
			}
			map.put(i, rate);
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
