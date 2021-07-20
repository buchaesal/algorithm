package programmers.kakao;

import java.util.ArrayList;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 * 크레인 인형뽑기 게임
 * @author danbi
 *
 */
public class Crane2019 {

	public static void main(String[] args) {
		solution(new int[][] { { 0, 0, 0, 0, 0 }, 
							   { 0, 0, 1, 0, 3 }, 
							   { 0, 2, 5, 0, 1 }, 
							   { 4, 2, 4, 4, 2 },
							   { 3, 5, 1, 3, 1 } }, 
				new int[] { 1, 5, 3, 5, 1, 2, 1, 4 });
	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		int target = 0;
		List<Integer> list = new ArrayList<Integer>();
	
		for(int num : moves) {
			for(int i=0;i<board.length;i++) { //0,1,2,3,4
				target = board[i][num-1];
				if(target!=0) {
						if(list.size()!=0) {
							if(list.get(list.size()-1) == target) {
								list.remove(list.size()-1);
								answer+=2;
							}else {
								list.add(target);
							}
						}else {
							list.add(target);
						}
						board[i][num-1] = 0;
					break;
				}
			}
		}
		
		return answer;
	}
}
