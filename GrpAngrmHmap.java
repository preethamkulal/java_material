import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GrpAngrmHmap {
    public static void findAgGrp(String arr[]){
        HashMap<String, List<String> > map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            if (map.containsKey(newWord)){
                //map.get(newWord).add(word);
                // another method
                List<String> anagram = map.get(newWord);
                anagram.add(word);

            }
            else {
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord,words);
            }
        }
        for(String s: map.keySet()){
            List<String> values = map.get(s);
            if(values.size() > 1){
                System.out.print(values);
            }
        }

    }

    public static void main(String[] args){
        String arr[] = {"god","dog","cat","tac"};
        findAgGrp(arr);
    }
}
