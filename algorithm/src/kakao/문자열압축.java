package kakao;

public class ���ڿ����� {
	public static void main(String[] args) {
		int result = test("ababdedeababdede");
		System.out.println(result);
	}
	
	
	
	static int test(String s) {
		String first_letter = s.substring(0, 1);
		if(!s.substring(1).contains(first_letter)) { //�� ù�ڸ��� ���ڰ� ó�� �ѹ��� ������ ���
			return s.length();
		}
		return 0;
	}
}
