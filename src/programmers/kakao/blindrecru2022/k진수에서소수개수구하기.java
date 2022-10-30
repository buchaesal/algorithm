package programmers.kakao.blindrecru2022;

import java.util.Arrays;

public class k진수에서소수개수구하기 {
    public static void main(String[] args) {
        new k진수에서소수개수구하기().solution(110011, 10);
    }
    public int solution(int n, int k) {
        return (int) Arrays.stream(Integer.toString(n, k).split("0")).filter(i->!"".equals(i))
                .map(number->Long.parseLong(number))
                .filter(num->num>1 && isPrimeNumber(num)).count();
    }
    private boolean isPrimeNumber(long n){
        for(int i=2; i<(long)Math.sqrt(n)+1; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
