package programmers;

public class 최대공약수와최소공배수 {
	
	public static void main(String[] args) {
		solution(2,5);
	}
	
	 public static int[] solution(int n, int m) {
	      int[] answer = new int[2];
	      int a = n < m ? m : n;
	      int b = n > m ? m : n;
	      // 최소공배수 =  a * b / 최대공약수
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
