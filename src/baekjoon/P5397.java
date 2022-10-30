package baekjoon;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/5397 키로거
 * => 성공, but 속도 느림 (2808ms)
 * 배열 2개로(arraydeque) 해보는 방법 살펴보기
 * @author danbi
 *
 */
public class P5397 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		for (int n = 0; n < tc; n++) {

			String input = sc.next(); // <<BP<A>>Cd-
			List<Character> pwd = new LinkedList<Character>();

			// 고려해야 할 특문 : <>-
			int cursorIdx = 0;
			char[] arr = input.toCharArray();

			for (char c : arr) {
				switch (c) {
				case '<':
					if (cursorIdx != 0)
						cursorIdx -= 1;
					break;
				case '>':
					if (cursorIdx < pwd.size())
						cursorIdx += 1;
					break;
				case '-':
					if (cursorIdx > 0) {
						pwd.remove(cursorIdx - 1);
						cursorIdx -= 1;
					}
					break;
				default:
					if (cursorIdx < pwd.size()) {
						pwd.add(cursorIdx, c);
					} else {
						pwd.add(c);
					}
					cursorIdx++;
					break;
				}
			}

			StringBuilder sb = new StringBuilder();

			for (Character c : pwd) {
				sb.append(c);
			}

			System.out.println(sb.toString());
		}
	}
}
