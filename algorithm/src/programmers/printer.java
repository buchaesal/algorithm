package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class printer {
	/**
	 * 
	 * 
	 */

	public static void main(String[] args) {
		solution(new int[] {2, 1, 3, 2}, 1); //return : 1
	}
	 public static int solution(int[] priorities, int location) {
	        int answer = 0;
	        
	        LinkedList<Integer> que = new LinkedList<Integer>();//{2, 1, 3, 2}
	        ArrayList<Integer> indexBox = new ArrayList<Integer>();
	        
	        for(int idx : priorities) { // 입력받은 대기순서들을 큐에 담는다.
	        	que.add(idx);
	        	indexBox.add(idx);
	        }
	        
	        int cnt = 0;
	        int first = 0;
	        
	        while(true) {
	        	first = que.peek(); //대기순서의 맨 앞
	        	
	        	 for(int num : que) {
	 	        	if(first<num) {
	 	        		que.add(first); //큐의 맨 뒤로 보냄
	 	        		cnt++;
	 	        		break;
	 	        	}
	 	        	
	 	        	if(cnt == que.size()) {
	 	        		que.remove(); //큐의 맨 앞을 출력함(제거)
	 	        		break;
	 	        	}
	 	        }
	        	 
	        	 cnt = 0;
	        }
	       
	        
	        
	        //return answer;
	    }
}
