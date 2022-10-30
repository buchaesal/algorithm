package codility;

import java.util.Arrays;
import java.util.Comparator;

public class LongestPassword {
    public static void main(String[] args) {
        boolean result = new LongestPassword().solution(new int[]{1,1,2,3,5}, 5);
        System.out.println(result);
    }

    public boolean solution(int[] A, int K){
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                break;
        }
        if (A[0] != 1 && A[n - 1] != K)
            return false;
        else
            return true;
    }

//    public int solution(int N) {
//
//        int goal = getSumOfDigit(N), start = N+1;
//
//        while(goal != getSumOfDigit(start)){
//            start++;
//        }
//
//        return start;
//    }

    private int getSumOfDigit(int number){
        int sum = 0;
        while(number>0){
            sum += number%10;
            number /= 10;
        }
        return sum;
    }

    private boolean isValid(String word){
        int alphabet=0, number=0;

        for(int i=0; i<word.length(); i++){

            char ch = word.charAt(i);
            if(ch >= 'A' && ch <= 'z') alphabet++;
            else if(ch >= '0' && ch <='9') number++;
            else return false;

        }

        return alphabet % 2 == 0 && number % 2 != 0;
    }
}
