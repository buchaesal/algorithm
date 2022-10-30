package programmers.level2;

import java.util.Stack;

/**
 * 월간 코드 챌린지 시즌2
 * 괄호 회전하기
 * https://programmers.co.kr/learn/courses/30/lessons/76502
 */
public class 괄호회전하기 {

    public int solution(String s) {
        int answer = 0;
        int len = s.length();

        StringBuilder str = new StringBuilder(s);
        if(isCorrect(s)) answer++;
        for(int i=1; i<len; i++){

            str.append(str.charAt(0));
            str.deleteCharAt(0);

            if(isCorrect(str.toString())) answer++;
        }


        return answer;
    }

    public boolean isCorrect(String str){
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if(c == '{'){
                stack.push('}');
            }else{
                if(stack.isEmpty() || c != stack.pop()) return false;
            }
        }

        return stack.isEmpty();
    }

}
