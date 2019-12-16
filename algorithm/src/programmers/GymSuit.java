package programmers;

public class GymSuit {

	public static void main(String[] args) {
		int[] lost = { 5,4,2 }; // 체육복 없는애들 번호
		int[] reserve = { 3,4, 6 }; // 여분의 체육복을 갖고있는 애들 번호
		solution(7, lost, reserve);
	}

	static public int solution(int n, int[] lost, int[] reserve) {
	        int min = n - lost.length; // 체육복이 있는 학생의 수
	      
	        
	        return min;
	    }

}
