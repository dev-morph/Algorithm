import java.util.Arrays;

public class Paint {
    static public int solution(int n, int m, int[] section) {
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(section);
        int targetWidth = section[section.length -1] - section[0] + 1;
        answer = targetWidth % m == 0 ? targetWidth/m : targetWidth/m + 1;
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arg1 = {2, 3, 6};
        solution(8, 4, arg1);
    }
}
