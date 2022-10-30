package programmers.level1;

public class PYinString {
	
	public static void main(String[] args) {
		solution("pppypypy");
	}
	
	 static boolean solution(String s) {
	        int p_cnt = 0;
	        int y_cnt = 0;
	        
	        String str = s.toLowerCase();
	        
	        for(int i=0;i<s.length();i++){
	            if(str.charAt(i) == 'p') p_cnt++;
	            if(str.charAt(i) == 'y') y_cnt++;
	        }
	        
	        //System.out.println(s.chars().filter(e -> e == 'p').count());
	        
	        
	        if(p_cnt == y_cnt) return true;
	        else return false;

	    }
}
