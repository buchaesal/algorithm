package baekjoon;

import java.io.*;

/**
 * 별 찍기 - 10
 * https://www.acmicpc.net/problem/2447
 */
public class P2447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        recur(n, bw);

        br.close();
        bw.close();
    }

    private static void recur(int n, BufferedWriter bw) throws IOException {

        for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if((i>=n/3 && i<2*(n/3)) && (j>=n/3 && j<2*(n/3))){
                        bw.write(" ");
                    }else{
                        bw.write("*");
                    }
                }
            bw.newLine();
            }

    }

}
