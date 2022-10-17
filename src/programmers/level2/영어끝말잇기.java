package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12981
 */
public class 영어끝말잇기 {
    public static void main(String[] args) {
       int[] a = new 영어끝말잇기().solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
       System.out.println(Arrays.toString(a));
    }
    public int[] solution(int n, String[] words) {

        List<String> already = new ArrayList<>();
        String prev = words[0];
        already.add(prev);

        for(int i=1; i<words.length; i++){
            if(!prev.endsWith(String.valueOf(words[i].charAt(0))) || already.contains(words[i])){
                return new int[]{(i+1) % n == 0? n : (i+1) % n, (int) Math.ceil((double) (i+1) / n)};
            }
            prev = words[i];
            already.add(words[i]);
        }

        return new int[]{0, 0};
    }


}
