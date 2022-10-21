package codility;

import test.test;

public class LongestPassword {
    public static void main(String[] args) {
        int result = new test().solution("test 5 a0A pass007 ?xy1");
        System.out.println(result);
    }

    public int solution(String S) {
        int answer = -1;

        for(String word : S.split(" ")){
            if(isValid(word)){
                answer = Math.max(answer, word.length());
            }
        }

        return answer;
    }

    private boolean isValid(String word){
        int alphabet=0, number=0;

        for(int i=0; i<word.length(); i++){

            char ch = word.charAt(i);
            if(ch >= 'A' && ch <= 'z') alphabet++;
            else if(ch >= '0' && ch <='9') number++;
            else return false;

        }

        return alphabet % 2 == 0 && number % 2 != 0;
    }
}
