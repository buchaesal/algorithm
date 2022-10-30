package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BestAlbum {

	public static void main(String[] args) {
		solution(new String[] {"classic", "pop", "classic", "classic"}, new int[] {500, 600, 150, 800});
	}
	
	//return : [4, 1, 3, 0]
	  public static int[] solution(String[] genres, int[] plays) {
	        
	        class Music implements Comparable<Music>{
	        	
				int id;
	        	int plays;
	        	
	        	public Music(int i, int j) {
	        		this.id=i;
	        		this.plays=j;
				}

				@Override
				public int compareTo(Music o) {
					return this.plays<=o.plays?1:-1;
				}
				
	        }
	        
	        Map<String,Integer> map = new HashMap<String, Integer>();
	        Map<String,ArrayList<Music>> finalMap = new HashMap<String, ArrayList<Music>>();
	        
	        
	        for(int i=0;i<genres.length;i++) { //각 장르의 재생수의 총합을 구한다.
	        	 map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
	        	 
	        	 if(finalMap.containsKey(genres[i])){
	        		 finalMap.get(genres[i]).add(new Music(i,plays[i]));
	        	 }else {
	        		 ArrayList<Music> temp = new ArrayList<Music>();
	        		 temp.add(new Music(i,plays[i]));
	        		 finalMap.put(genres[i],temp);
	        	 }
	        }
	        
	        List<Integer> forSort = new ArrayList<Integer>();
	        Iterator<String> sortIter = map.keySet().iterator();
		       while(sortIter.hasNext()) {
		    	   forSort.add(map.get(sortIter.next()));
		       }
		       
		       Collections.sort(forSort, Collections.reverseOrder());
	        
//	        List<String> keySetList = new ArrayList<String>(map.keySet());//value기준 내림차순으로 정렬
//	        
//	        Collections.sort(keySetList, (o1,o2) -> (map.get(o2).compareTo(map.get(o1)))); 
	        
	        
	        int cnt=0;
	        
	        List<String> Musics = new ArrayList<String>();
	        Iterator<String> iter = map.keySet().iterator();
	        List<Integer> answerArr = new ArrayList<Integer>();
	        
	        while(iter.hasNext()) {
	        	
	        	String key = iter.next();
	        	System.out.println(map.get(key));
	        	cnt=0;
	        	ArrayList<Music> target = finalMap.get(key);
	        	Collections.sort(target);
	        	
	        	
	        	for(Music music : target) {
	        		answerArr.add(music.id);
	        		cnt++;
	        		if(cnt == 2) break;
	        	}
	        	
	        	
	        }
	        
	       int[] answer = new int[answerArr.size()];
	       
	      for(int i=0;i<answer.length;i++) {
	    	  answer[i] = answerArr.get(i);
	      }
	      
	      System.out.println(Arrays.toString(answer));
	       
	        return answer;
	    }

}
