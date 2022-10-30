package programmers.level1;

public class Euclidean {
	
	public static void main(String[] args) {
		solution(2,5);
	}
	
	 public static int[] solution(int n, int m) {
	      int[] answer = new int[2];
	      int a = n < m ? m : n;
	      int b = n > m ? m : n;
	      // �ּҰ���� =  a * b / �ִ�����
	      	int mod = 1;
		  
		  while(mod>0) {
			  mod = a%b;
			  a = b;
			  b = mod;
		  }
	      answer[0] = a;
	      answer[1] = n * m / a;
	    
	      return answer;
	  }
	 
}
