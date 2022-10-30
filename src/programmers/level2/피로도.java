package programmers.level2;

public class 피로도 {

    public int[][] dungeonArray;
    boolean[] visited;
    public int hp;
    public int count;

    public static void main(String[] args) {
        new 피로도().solution(80, new int[][]{{80,20},{50,40},{30,10}});
    }
    public int solution(int k, int[][] dungeons) {

        dungeonArray = dungeons;
        visited = new boolean[dungeons.length];
        count = 0;
        hp = k;

        dfs(0);

        return 0;
    }

    private void dfs(int index){

        if(hp < dungeonArray[index][0]) return;
        hp -= dungeonArray[index][1];

       for(int i=0; i<dungeonArray.length; i++){
           if(!visited[i]){
               visited[i] = true;
               dfs(i);
               visited[i] = false;
           }
       }

    }

}
