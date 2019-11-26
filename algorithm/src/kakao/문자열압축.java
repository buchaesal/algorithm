package kakao;

public class 문자열압축 {
	public static void main(String[] args) {
		int result = test("ababdedeababdede");
		System.out.println(result);
	}
	
	
	
	static int test(String s) {
		String first_letter = s.substring(0, 1);
		if(!s.substring(1).contains(first_letter)) { //맨 첫자리의 문자가 처음 한번만 나오는 경우
			return s.length();
		}
		return 0;
	}
}
