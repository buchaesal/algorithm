package programmers;

import java.util.Arrays;

/**
 * 나누어 떨어지는 숫자배열
 * https://programmers.co.kr/learn/courses/30/lessons/12910
 * @author danbi
 *
 */
public class DividedArray {

	public static void main(String[] args) {
		solution(new int[] {5, 9, 7, 10}, 5);
	}

	  public static int[] solution(int[] arr, int divisor) {
	       int[] answer = Arrays.stream(arr).filter(t->t%divisor == 0).sorted().toArray();
	      
	      return answer.length>0?answer:new int[] {-1};
	  }
}
