package programmers;

public class Çà·ÄÀÇµ¡¼À {
	
		public static void main(String[] args) {
			int[][] arr1 = {{1,2},	//00 01
						    {2,3}}; //10 11
			int[][] arr2 = {{3,4},
							{5,6}};
			solution(arr1,arr2);
		}
	
	  public static int[][] solution(int[][] arr1, int[][] arr2) {
		  int length1 = arr1.length;
		  int length2 = arr1[0].length;
	      int[][] answer = new int[length1][length2];
	      
	      for(int i=0;i<length1;i++) {
	    	  for(int j=0;j<length2;j++) {
	    		  answer[i][j] = arr1[i][j] + arr2[i][j];
	    	  }
	      }
	      
	      return answer;
	  }
}
