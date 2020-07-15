package baekjoon;

import java.io.*;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/9461
 * 파도반 수열
 */
public class P9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] arr = new long[101];

        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 2;
        arr[5] = 2;

        int count = Integer.parseInt(br.readLine());

        for(int i=0;i<count;i++){
            int n = Integer.parseInt(br.readLine());
            for(int j=6;j<=n;j++){
                if(arr[j]!=0) continue;
                arr[j] = arr[j-1] + arr[j-5];
            }
            System.out.println(arr[n]);
        }
    }
}
