package programmers.level2;
import java.util.HashMap;
import java.util.Map;

/**
 * 코딩테스트 연습 - 탐욕법(Greedy) - 조이스틱
 */
public class 조이스틱 {
    public int solution(String name) {
        int answer = 0;

        Map<Character, Integer> map = new HashMap<>();
        char a = 'A';
        char z = 'Z';

        for(int i=1; i<13; i++){
            map.put(++a, i);
            map.put(z--, i);
        }
        map.put('N', 13);

        int hasA = name.indexOf("A"); // A의 존재여부
        int lenOfA = -1;
        int firstIdxOfA = 0;

        if(hasA != -1 && hasA != name.length()-1){ // 존재한다면
            int cnt = 1; // A의 개수(길이)
            for(int i=hasA+1; i<name.length(); i++){ // 존재하는 시점부터 검사
                if(name.charAt(i) == 'A') {
                    cnt++;
                } else {
                    if(cnt > lenOfA) firstIdxOfA = i - cnt;
                    lenOfA = Math.max(lenOfA, cnt);
                    cnt = 0;
                }
            }
        }

        if(lenOfA != name.length()){
            for(char c : name.toCharArray()) if(c != 'A') answer += map.get(c);
            answer += name.length() - 1 - (lenOfA >= firstIdxOfA ? lenOfA - firstIdxOfA + 1 : 0);
        }

        return answer;
    }
}
