package programmers;

public class ���ڿ����� {
	public static void main(String[] args) {
		int result = test("ababdedeababdede");
		System.out.println(result);
	}
	
	
	
	static int test(String s) {
		int result = s.length();
		String compare = ""; //�� ���ڿ��� �� ���ڿ� �� ����
		String compression = ""; //����� ���ڿ� ���� ����
		int cnt = 1; // �ߺ�Ȯ�ο�
		
		/**
		 * 1. ���ڿ�(s)�� n���� �ɰ��ǵ� n�� �Է¹��� ���ڿ� ����/2 �̻��� �� ����. (ex: ���ڿ� ���̰� 9�ΰ�� 5�� �ɰ��� ����. )
		 * 2. n�� �ɰ��ǵ� �տ��� n���� �ɰ� ���ڿ��� �� ���� n���� �ɰ� ���ڿ��� ���ؼ�
		 * 	    ������ cnt+1, ���� ������ compression�� �߰��Ѵ�. 
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
		 * 2. n�� 1���� 1�� �÷����� compression�� ���̿� result�� ���̸� ���� compression�� �� ������ result�� �����Ѵ�.
		 * 3. compression
		 * 
		 * 
		 * **/
		
		for(int i=0;i<s.length()/2;i++) {
			
		}
		
		return result;
	}
}
