package programmers.kakao.techinternship2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class 성격유형검사하기 {

    public static Map<Character, Integer> scoreMap = new HashMap<>();

    public static void main(String[] args) {

        String result = solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});

        System.out.println(result);

    }

    public static String solution(String[] survey, int[] choices) {

        String answer = "";

//        Map<Character, Integer> scoreMap = new HashMap<>();

        for(int i=0; i<survey.length; i++){

            int choice = choices[i];
            if(choice == 4) continue;

            if(choice<4){ // 앞 유형 득점
                Character frontStr = survey[i].substring(0,1).charAt(0);
                scoreMap.put(frontStr, scoreMap.getOrDefault(frontStr, 0) + (4-choice));
            }else if(choice>4){ // 뒷 유형 득점
                Character backStr = survey[i].substring(1,2).charAt(0);
                scoreMap.put(backStr, scoreMap.getOrDefault(backStr, 0) + (choice-4));
            }

        }

        answer += decideCharacterType('R', 'T');
        answer += decideCharacterType('C', 'F');
        answer += decideCharacterType('J', 'M');
        answer += decideCharacterType('A', 'N');

        return answer;
    }

    private static Character decideCharacterType(Character type1, Character type2){

        int count1 = Optional.ofNullable(scoreMap.get(type1)).orElse(0);
        int count2 = Optional.ofNullable(scoreMap.get(type2)).orElse(0);

        return count1 == count2 ? (type1 > type2 ? type2 : type1) : count1 > count2 ? type1 : type2;

    }

}
