package programmers.kakao;

import java.util.Arrays;

public class SecretMap {

	public static void main(String[] args) {
		solution(5, new int[] { 19, 20, 28, 18, 10 }, new int[] { 30, 41, 21, 17, 28 });
		// ["#####","# # #", "### #", "# ##", "#####"]
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		String[] binaryArr1 = new String[n];
		String[] binaryArr2 = new String[n];
		
		
		
		int addNum;
		
		for(int i=0;i<n;i++) {
			
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); //비트연산
		
			System.out.println(arr1[i] | arr2[i]);
//			binaryArr1[i] = Integer.toBinaryString(arr1[i]);
//			binaryArr2[i] = Integer.toBinaryString(arr2[i]);
//			
//			if(binaryArr1[i].length() != n) {
//				addNum = n - binaryArr1[i].length();
//				for(int j=0;j<addNum;j++) {
//					binaryArr1[i] = "0"+binaryArr1[i]; //이진수의 자리를 맞춰준다.
//				}
//			}
//			
//			if(binaryArr2[i].length() != n) {
//				addNum = n - binaryArr2[i].length();
//				for(int j=0;j<addNum;j++) {
//					binaryArr2[i] = "0"+binaryArr2[i]; //이진수의 자리를 맞춰준다.
//				}
//			}
		}
		
		//System.out.println(Arrays.toString(answer));

		String temp = "";
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(binaryArr1[i].charAt(j) == '0' && binaryArr2[i].charAt(j) == '0') {
//					temp += " ";
//				}else {
//					temp += "#";
//				}
//			}
//			answer[i] = temp;
//			temp = "";
//		}
		
		
		return answer;
	}
}
