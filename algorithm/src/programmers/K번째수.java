package programmers;

import java.util.Arrays;

public class K¹øÂ°¼ö {
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3},  // 00, 01, 02
							{4, 4, 1},  // 10, 11, 12
							{1, 7, 3}}; // 20, 21, 22
		
		solution(array, commands);
	}

	
	public static int[] solution(int[] array, int[][] commands) {
		
        int[] answer = new int[commands.length];
        
        int new_length;
        
        for(int i=0;i<commands.length;i++) {
        	
        	new_length = commands[i][1]-commands[i][0]+1;
        	int idx = commands[i][0]-1;
        	int[] tmp = new int[new_length];
        	
        	for(int j=0;j<new_length;j++) {
        		
        		tmp[j] = array[idx];
        		idx++;
        	}
        	Arrays.sort(tmp);
        	answer[i] = tmp[commands[i][2]-1];
        }
        

        return answer;
    }
}
