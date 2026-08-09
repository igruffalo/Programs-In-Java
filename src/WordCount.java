import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (map.containsKey(word.toLowerCase())) {
                map.put(word.toLowerCase(), map.get(word.toLowerCase()) + 1);
            } else  {
                map.put(word.toLowerCase(), 1);
            }
        }
        return map;
    }
}
