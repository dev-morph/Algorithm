public class CleanDesktop {
    static public int[] solution(String[] wallpaper) {
        int[] answer = {51, 51, -1, -1};

        int rowLength = wallpaper.length;
        int colLength = wallpaper[0].length();
        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j < colLength; j++){
                String target = wallpaper[i].substring(j, j+1);
                if(target.equals("#")){
                    if(answer[0] > i) answer[0] = i;
                    if(answer[1] > j) answer [1] = j;
                    if(answer[2] < i+1) answer[2] = i+1;
                    if(answer[3] < j+1) answer[3] = j+1; 
                }
            }
        }
        for(int i : answer){
            
            System.out.println(i);
        }
        System.out.println("***");
        return answer;
    }

    public static void main(String[] args) {
        String[] testArgs= {".#...", "..#..", "...#."};
        String[] testArgs2= {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        String[] testArgs3= {"..", "#."};
        String[] testArgs4= {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        CleanDesktop.solution(testArgs);
        CleanDesktop.solution(testArgs2);
        CleanDesktop.solution(testArgs3);
        CleanDesktop.solution(testArgs4);
    }
}
