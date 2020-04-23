package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.acmicpc.net/problem/1551 수열의 변화
 * 
 * @author danbi
 *
 */
public class P1551 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int lengthOfInput = Integer.parseInt(st.nextToken()); // 수열의 크기 N
		int times = Integer.parseInt(st.nextToken()); // 실행 횟수 K
		int[] result = new int[lengthOfInput];
		int[] realResult = new int[lengthOfInput-times];
		
		int[] intArray = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
		
		List<Integer> list = new ArrayList<Integer>();

		while (times != 0) {
			int[] arr = Arrays.copyOfRange(intArray, 0, lengthOfInput);
			for (int i = 0; i < arr.length - 1; i++) {
				list.add(arr[i + 1] - arr[i]);
			}
			times--;
		}
		
		realResult = Arrays.copyOfRange(result, 0, realResult.length);
		
		String resultStr = IntStream.of(realResult)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(","));
		
		bw.write(resultStr);

		
		br.close();
        bw.close();


	}

}
