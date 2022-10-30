package programmers.level2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12911
 */
public class 다음큰숫자 {
    public static void main(String[] args) {
        solution(78);
    }
    public static int solution(int n) {

        int oneCount = Integer.bitCount(n);
        n++;

        while(Integer.bitCount(n) != oneCount){
            n+=1;
        }

        System.out.println(n);

        return n;
    }

    private static int getOneCount(String str){
        int originalLen = str.length();
        str = str.replaceAll("1", "");
        return originalLen - str.length();
    }
}
