package programmers;

/**
 * 이상한 문자 만들기
 */
public class makeStrangeWords {
	
	public static void main(String[] args) {
		solution("suncream       hand yes yy y y  ");
	}
	
	 public static String solution(String s) {
	      char[] arr = s.toCharArray();
	      int idx = 0;
	      
	      for(int i=0;i<arr.length;i++) {
	    	  if(arr[i] == ' ') {
	    		  idx = 0;
	    	  }else{
	    		  if(idx % 2 == 0) {
	    			  arr[i] = Character.toUpperCase(arr[i]);
	    		  }else {
	    			  arr[i] = Character.toLowerCase(arr[i]);
	    		  }
	    		  idx++;
	    	  }
	      }
	      
	      return new String(arr);
	  }
}
