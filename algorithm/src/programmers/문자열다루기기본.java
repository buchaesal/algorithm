package programmers;

public class ���ڿ��ٷ��⺻ {
	
	public static void main(String[] args) {
		System.out.println(solution("12341"));
	}
	
		  public static boolean solution(String s) {
		      
		      for(int i=0;i<s.length();i++){
		          if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')){
		              return false;
		          }    
		      }
		      return true;
		  }
		
}
