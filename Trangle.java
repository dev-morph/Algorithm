import java.util.Arrays;

public class Trangle {
    static public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if(sides[2] < sides[0] + sides[1]) answer =1;
        else answer = 2;
        
        return answer;
    }

    public static void main(String[] args) {
        int[] test = {5, 4, 3};
        Trangle.solution(test);
    }
}
