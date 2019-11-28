package programmers;

import java.util.Arrays;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		solution(arr);
	}

	public static int[] solution(int[] arr) {

		int buffer = 10;
		int i = 0;
		int length = 0;

		for (int num : arr) {
			if (num != buffer) {
				arr[i++] = num;
				length++;
			}
			buffer = num;
		}

		int[] arr3 = Arrays.copyOfRange(arr, 0, length);

		return arr3;
	}
}
