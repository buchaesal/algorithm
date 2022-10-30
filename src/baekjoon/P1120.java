package baekjoon;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1120 문자열
 * 하다가 맘...
 * 참고:어떤 알파벳을 넣어야되냐는 중요치 않다... 이걸 명심해야댐.
 * @author danbi
 *
 */
public class P1120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next(); // adaabc
		String b = sc.next(); // aababbc

		int surplus = b.length() - a.length(); // a에 몇글자를 더 붙일 수 있는지
		char[] a_arr = a.toCharArray();
		char[] b_arr = b.toCharArray();

		Deque<Character> a_list = new ArrayDeque<Character>();
		ArrayList<Character> b_list = new ArrayList<Character>();

		for (Character c : a_arr) {
			a_list.add(c);
		}

		for (Character c : b_arr) {
			b_list.add(c);
		}

		Character target = a_list.getFirst();
		int bIndex = b.indexOf(target) == 0 ? b.indexOf(target, 1) : b.indexOf(target);



	}

}
