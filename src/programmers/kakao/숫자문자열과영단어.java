package programmers.kakao;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */
public class 숫자문자열과영단어 {

    public static void main(String[] args) {
        solution("one4seveneight");
    }

    public static int solution(String s) {
        String[][] dict = new String[][]{{"zero", "0"}, {"one", "1"}, {"two", "2"}, {"three", "3"}, {"four", "4"}, {"five", "5"}, {"six", "6"}, {"seven", "7"}, {"eight", "8"}, {"nine", "9"}};

        for(String[] element : dict){
            s = s.replaceAll(element[0], element[1]);
        }

        return 0;
    }
}
