import java.util.Arrays;

public class Paint {
    static public int solution(int n, int m, int[] section) {
        int answer = 0;
        // 정렬은 이미 되어 있음.
        int paintedWall = 0;
        for(int s : section){
            if(paintedWall < s){
                paintedWall = s + m -1;
                answer ++;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arg1 = {2, 3, 6};
        solution(8, 4, arg1);
    }
}
