package programmers;

public class CaesarCode {
	public static void main(String[] args) {
			solution("abcde",5);
			
			/**
			 * 아스키코드표
			 * A = 65 
			 * ...
			 * Z = 90
			 * ---------
			 * a = 97
			 * ...
			 * z = 122
			 */
	}
	
	 public static String solution(String s, int n) {
	      String answer = "";
	      int ascii;
	      
	      for(int i=0;i<s.length();i++) {
	    	  if(s.charAt(i) == ' ') ascii = ' ';
	    	  else ascii = (int)s.charAt(i)+n;
	    	  
	    	  if((ascii>90 && ascii<97) || ascii>122) ascii = ascii - 26;
	    	  
	    	  System.out.println("ascii="+ascii);
	    	  answer += (char)ascii;
	      }
	      
	      System.out.println(answer);
	      
	      return answer;
	  }
}
