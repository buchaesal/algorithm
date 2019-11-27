package programmers;

import java.util.Arrays;

public class 같은숫자는싫어 {
	
	public static void main(String[] args) {
		int []arr = {1,1,3,3,0,1,1};
		solution(arr);
	}
	
	public static int[] solution(int []arr) {
        
        int buffer = 10;
        String str_buffer = "";
        
        for(int num : arr) {
        	if(num != buffer) {
        		str_buffer += num;
        	}
        	
        	buffer = num;
        }
        
        int[] answer = new int[str_buffer.length()];
        for(int i=0;i<answer.length;i++) {
        	answer[i] = str_buffer.charAt(i)-'0';
        }
       
        return answer;
	}
}
