package programmers.level1;

public class SquareRoot {
public static void main(String[] args) {
		solution(121);
}

public static long solution(long n) {
    Double answer = Math.sqrt(n);
    
    if(answer == answer.intValue()) return (long)Math.pow(answer, 2);
    else return -1;
    	
    
}

}
