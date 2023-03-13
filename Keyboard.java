import java.util.HashMap;
import java.util.Map;

public class Keyboard {
        static public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int [targets.length];
            Map<String, Integer> shortestMap = new HashMap<>();

            for(String key : keymap){
                for(int i = 0; i < key.length(); i++){
                    String k = key.substring(i, i + 1);

                    if(!shortestMap.containsKey(k)){
                        shortestMap.put(k, i+1);
                    }else if(shortestMap.containsKey(k) && shortestMap.get(k) > i+1){
                        shortestMap.replace(k, i+1);
                    }
                }
            }
            int answerIndex = 0;
            for( String target : targets ){
                int count = 0;
                for( int i = 0; i < target.length(); i++){
                    String s = target.substring(i, i+1);
                    if(!shortestMap.containsKey(s)){
                        count = -1;
                        break;
                    }
                    count += shortestMap.get(s);
                }
                answer[answerIndex] = count;
                answerIndex++;
                count = 0;
            }
            System.out.println(answer[0]);
            System.out.println(answer[1]);
            return answer;
        }

        public static void main(String[] args) {
            String[] keymap = {"ABACD", "BCEFD"};
            String[] targets = {"ABCD","AABB"};
            solution(keymap, targets);
        }
}
