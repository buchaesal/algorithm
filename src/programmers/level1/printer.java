package programmers.level1;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class printer {
	public static void main(String[] args) {
		solution(new int[] {2, 1, 3, 2}, 2); //return : 1
	}
	 public static int solution(int[] priorities, int location) {
		 
		 class Doc implements Comparable<Doc> {
			 int id;
			 int priority;
			 
			 public Doc(int id, int priority) {
				 this.id = id;
				 this.priority = priority;
			}
			 
			@Override
			public int compareTo(Doc doc) {
				return this.priority<=doc.priority?1:-1;
			}
			
			
		 }
		 
		 PriorityQueue<Doc> preQue = new PriorityQueue<Doc>();
		 LinkedList<Doc> que = new LinkedList<Doc>();
		 
		 for(int i=0;i<priorities.length;i++) {
			 Doc doc = new Doc(i, priorities[i]);
			 preQue.offer(doc);
			 que.offer(doc);
		 }
		 
		 Doc target;
		 Doc tempDoc;
		 int order = 0;
		 
		 target = preQue.poll(); // 우선순위가 가장 높은 문서가 담긴다.
		 
		 while(!que.isEmpty()) {
			 
			 tempDoc = que.poll();
			 
			 if(tempDoc.id != target.id && tempDoc.priority != target.priority) {
				 que.offer(tempDoc);
			 }else{
				 order++;
				 if(tempDoc.id == location) {
					 break;
				 }
				 target = preQue.poll(); // 우선순위가 가장 높은 문서가 담긴다.
			 }
		 }
		 
		 return order;
		 
	    }
}
