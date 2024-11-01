package programmers;

public class 저주의숫자3 {

    public static void main(String[] args) {
        int result = new 저주의숫자3().solution(40);
        System.out.println(result);
    }

    public int solution(int n) {
        int answer = 0;
        for(int i=0; i<n; i++) {
            do {
                answer++;
            } while (isCurseNumber(answer));
        }
        return answer;
    }

    private boolean isCurseNumber(int number) {
        return String.valueOf(number).contains("3") || number % 3 == 0;
    }
}
