package programmers;

public class 자연수뒤집어배열로만들기 {
	public static void main(String[] args) {
		solution(12345);
	}
	  public static int[] solution(long n) {
	      int[] answer = new int[(int)Math.log10(n)+1];
	      System.out.println((int)Math.log10(n)+1);
	      return answer;
	  }
}
