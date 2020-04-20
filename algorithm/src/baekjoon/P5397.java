package baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/5397
 * 키로거
 * @author danbi
 *
 */
public class P5397 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		for(int n=0 ; n<tc ; n++) {

			String input = sc.next(); // <<BP<A>>Cd-
			List<Character> pwd = new ArrayList<Character>();

			// 고려해야 할 특문 : <>-
			int cursorIdx = 0;
			char target;

			for (int i = 0; i < input.length(); i++) {
				target = input.charAt(i);
				if (target == '<') {
					if(cursorIdx != 0) cursorIdx -= 1;
					continue;
				}else if (target == '>' ) {
					if(cursorIdx < pwd.size()) cursorIdx += 1;
					continue;
				}else if (target == '-') {
					if(cursorIdx>0) {
						pwd.remove(cursorIdx - 1);
						cursorIdx-=1;
					}
					continue;
				} else { // 일반 문자일 때
					if (cursorIdx < pwd.size()) {
						pwd.add(cursorIdx, target);
					} else {
						pwd.add(target);
					}
					cursorIdx++;
					continue;
				}
			}
			
			String str = "";
			for(int i=0;i<pwd.size();i++) {
				str += pwd.get(i);
			}
			System.out.println(str);
		}
	}
}
