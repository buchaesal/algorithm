package programmers;

public class 문자열압축 {
	public static void main(String[] args) {
		int result = test("ababdedeababdede");
		System.out.println(result);
	}
	
	
	
	static int test(String s) {
		int result = s.length();
		String compare = ""; //앞 문자열과 뒷 문자열 비교 버퍼
		String compression = ""; //압축된 문자열 저장 버퍼
		int cnt = 1; // 중복확인용
		
		/**
		 * 1. 문자열(s)을 n개씩 쪼갤건데 n은 입력받은 문자열 길이/2 이상일 수 없다. (ex: 문자열 길이가 9인경우 5씩 쪼갤수 없다. )
		 * 2. n씩 쪼갤건데 앞에서 n개로 쪼갠 문자열과 그 뒤의 n개로 쪼갠 문자열을 비교해서
		 * 	    같으면 cnt+1, 같지 않으면 compression에 추가한다. 
		 * 2-1. n = 1 , s.substring(0,1), s.substring(1,2), s.substring(2,3)...
		 * 		n = 2 , s.substring(0,2), s.substring(2,4), s.substring(4,6)...
		 * 	    n = 3 , s.substring(0,3), s.substring(3,6), s.substring(6,9)...
		 *      n = 4 , s.substring(0,4), s.substring(4,8)...
		 *      for(int n = 1; n<s.length() / 2 ; n++){
		 *      
		 *      	for(int i = 0;  ; i+n){
		 *      		if(s.substring(i,n)
		 *      
		 *      	}
		 *      
		 *      }
		 * 2. n을 1부터 1씩 늘려가며 compression의 길이와 result의 길이를 비교해 compression이 더 작으면 result에 저장한다.
		 * 3. compression
		 * 
		 * 
		 * **/
		
		for(int i=0;i<s.length()/2;i++) {
			
		}
		
		return result;
	}
}
