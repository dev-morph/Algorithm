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
                        shortestMap.put(k, i);
                    }else if(shortestMap.containsKey(k) && shortestMap.get(k) > i){
                        shortestMap.replace(key, i);
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
                System.out.println(answerIndex);
                answer[answerIndex] = count;
                count = 0;
            }
            System.out.println(answer);
            return answer;
        }

        public static void main(String[] args) {
            String[] keymap = {"ABACD", "BCEFD"};
            String[] targets = {"ABCD","AABB"};
            solution(keymap, targets);
        }
}
