package baekjoon;

import java.io.*;

/**
 * DP가 익숙해질 때까지 DP만 파기
 * https://www.acmicpc.net/problem/9095
 *  1,2,3더하기
 *  정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수
 */
public class P9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[11]; // n의 최대값은 11이다. n의 경우의 수가 들어있는 배열

        arr[1] = 1; // 1
        arr[2] = 2; // 1+1, 2
        arr[3] = 4; // 1+1+1, 1+2, 2+1, 3
        //arr[4] = 7; // 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 1+3, 3+1, 2+2
        //arr[5] = 15; // 1+4(1의 경우의 수에 4를 더함 => 이건 안됨), 2+3(2의 경우의 수에 3을 더함), 3+2(3의 경우의 수에 2를 더함), 4+1(4의 경우의 수에 1을 더함)

        // 점화식 : arr[n] = arr[n-1] + arr[n-2] + arr[n-3] ( n>3 )
        int count = Integer.parseInt(br.readLine()); //테스트케이스의 개수

        for(int i=0;i<count;i++){
            int n = Integer.parseInt(br.readLine());
            for(int j=4;j<=n;j++){
                arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
            }
            b
        }

    }
}
