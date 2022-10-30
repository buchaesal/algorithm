package baekjoon;

import java.util.Scanner;

public class P1158 {
	//<3, 6, 2, 7, 5, 1, 4>
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt(); //7
		boolean[] temp = new boolean[people+1];
		int[] answer = new int[people];
		int order = sc.nextInt(); //3
		int cnt = 0;
		int cnt2 = 0;
		
		for (int i = 0; i < people; i++) {
			if(i==0) {
				temp[order] = true;
				answer[i] = order;
			}else {
				//while()
				
			}
			
		}
	}
}
