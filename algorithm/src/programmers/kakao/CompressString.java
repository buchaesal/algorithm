package programmers.kakao;
/**
 * 
 * @author user
 * 2020 KAKAO BLIND RECRUITMENT
 * 문자열 압축
 * https://programmers.co.kr/learn/courses/30/lessons/60057
 *
 */
public class CompressString {
	public static void main(String[] args) {
		int result = test("abcabcdede");
		System.out.println(result);
	}

	static int test(String s) {
		int result = s.length();
		
		int cnt = 1; // 중복 체크

		/**
		 * compression�� �߰��Ѵ�. 2-1. n = 1 , s.substring(0,1), s.substring(1,2),
		 * s.substring(2,3)... n = 2 , s.substring(0,2), s.substring(2,4),
		 * s.substring(4,6)... n = 3 , s.substring(0,3), s.substring(3,6),
		 * s.substring(6,9)... n = 4 , s.substring(0,4), s.substring(4,8)... 
		 * ===> s.substring(i * n, (i + 1) * n))
		 * 
		 * 핵심 : 입력받은 문자열을 1,2,3...n등분을 해가는데 등분하는 값의 최대는 문자열/2라는 것.
		 *  n을 문자열/2까지 for문을 돌려서 하나하나 비교해 작은 값은 int result에 대치시켜 return한다.
		 **/

		for (int n = 1; n <= s.length() / 2; n++) {
			
			String compression = ""; 
			String compare = ""; 
			String check = "";
			boolean isNum = false;
			
			for (int i = 0; i < s.length() / n; i++) {
				System.out.println("n=" + n + ",i=" + i + "::::" + (i * n) + "," + (i + 1) * n + ";;;;"
						+ s.substring(i * n, (i + 1) * n));
				
				if(s.substring(i * n, (i + 1) * n).equals(compare)){ 
					cnt++;
					isNum = true;
				}else if(cnt != 1) {
					compression += compare+cnt;
					cnt = 1;
				}else { //compare와 같지도 않고 cnt가 1일때.
					compression += compare;
				}

				compare = s.substring(i * n, (i + 1) * n);
				check += compare;
				System.out.println("compare="+compare);
				
				//for문 마지막으로 돌 때, 압축문자열에 추가
				if(i==s.length()/n-1) {
					if(cnt==1) compression += compare;
					else if(cnt != 1) {
						compression += compare+cnt;
						cnt = 1;
					}
					
					if(check.length() != s.length() && !isNum) compression = s; //온전히 안잘리고 숫자 없는 애들은 그냥 원래 string처리를 해버린다.
					else if(check.length() != s.length() && isNum) compression = compression+s.substring(check.length()); //온전히 안잘리고 숫자 있는 애들은 나머지를 붙여준다.
				}
				
			}
			System.out.println(compression);
			if(compression.length() < result) {
				result = compression.length();
			}
		}

		
		return result;
	}
}
