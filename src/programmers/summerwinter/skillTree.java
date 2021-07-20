package programmers.summerwinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/49993 Summer/Winter
 * Coding(~2018) 스킬트리
 * 
 * @author danbi
 *
 */
public class skillTree {

	public static void main(String[] args) {
		System.out.println(solution2("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA" }));

	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;

		String mySkill = "";
		boolean successFlag = true;

		for (String str : skill_trees) { // "BACDE", "CBADF", "AECB", "BDA"
			mySkill = "";
			successFlag = true;
			char[] treeArr = str.toCharArray();

			for (char c : treeArr) {
				if (skill.indexOf(c) != -1) { // target 스킬에 있는 스킬이라면(검토대상) "CBD"
					if (skill.indexOf(c) != 0) { // 필요 선행 스킬이 있다면
						if (mySkill.contains(skill.substring(0, skill.indexOf(c)))) { // 그 스킬을 이미 배웠다면. 스킬트리에 추가가능.
							mySkill += c;
						} else { // 선행스킬을 배우지 않았다면
							successFlag = false;
							break;
						}
					} else { // 선행 스킬이 필요 없다면
						mySkill += c;
					}
				}
			}

			if (successFlag)
				answer++;
		}
		return answer;
	}
	
	 public static int solution2(String skill, String[] skill_trees) {
	        int answer = 0;
	        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
	        //ArrayList<String> skillTrees = new ArrayList<String>();
	        Iterator<String> it = skillTrees.iterator();

	        while (it.hasNext()) {
	            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
	                it.remove();
	            }
	        }
	        answer = skillTrees.size();
	        return answer;
	    }

}
