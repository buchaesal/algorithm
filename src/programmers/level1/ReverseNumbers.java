package programmers.level1;

public class ReverseNumbers {
	public static void main(String[] args) {
		solution(1);
	}
	  public static int[] solution(long n) {
		  int length = (int)Math.log10(n)+1;
	      int[] answer = new int[length];
	      
	      for(int i=0;i<length;i++) {
	    	  answer[i] = (int)(n/(Math.pow(10, i)))%10;
	      }
	      
	      // (n/1)%10 = 5 = answer[0]
	      // (n/10)%10 = 4 = answer[1]
	      // (n/100)%10 = 3
	      // (n/1000)%10 = 2
	      
	      return answer;
	  }
}
