package programmers;

import java.util.Arrays;

public class GymSuit {

	public static void main(String[] args) {
		int[] lost = { 2, 4, 5 }; // 체육복 없는애들 번호
		int[] reserve = { 3,4, 6 }; // 여분의 체육복을 갖고있는 애들 번호
		solution(7, lost, reserve);
	}

	static public int solution(int n, int[] lost, int[] reserve) {
	        int min = n - lost.length; // 체육복이 있는 학생의 수
	        int x, y, idx, x_idx, y_idx;
	        
	        for(int i=0;i<lost.length;i++){
	        	x = lost[i]-1;
	        	y = lost[i]+1;
	        	
	        	System.out.println("lost="+lost[i]+",x="+x+",y="+y);
	        	
	        	idx = Arrays.binarySearch(reserve, lost[i]);
	        	
	        	if(idx >= 0) { //여벌을 갖고 있는 학생이 도난당했을 경우
	        		reserve[idx] = -1;
	        	}else{
	        	 	x_idx = Arrays.binarySearch(reserve, x);
		        	y_idx = Arrays.binarySearch(reserve, y);
		        	System.out.println("x_idx="+x_idx+",y_idx="+y_idx);
		        	
		        	if(x_idx >= 0 && y_idx >= 0){ 
		        		reserve[x_idx] = -1;
		        		min++;
		        	}else{
		        		if(x_idx >= 0){
			        		reserve[x_idx] = -1;
			        		min++;
			        	}else if(y_idx >= 0){
			        		reserve[y_idx] = -1;
			        		min++;
			        	}
		        		
		        	}
	        	}
	        	
	        }
	        
	        System.out.println(min);
	        
	        return min;
	    }

}
