package programmers.level1;

public class 최소직사각형 {

    public static void main(String[] args) {
//        solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}});
    }

    public static int solution(int[][] sizes) {

        int firstMax = 0, secondMax = 0;

        for(int[] size : sizes){
            firstMax = Math.max(Math.max(size[0], size[1]), firstMax);
            secondMax = Math.max(Math.min(size[0], size[1]), secondMax);
        }

        return firstMax * secondMax;
    }
}
