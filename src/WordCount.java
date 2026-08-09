import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = sentence.split("\\W+");
        for (String word : words) {
            map.put(word.toLowerCase(), map.getOrDefault(word.toLowerCase(), 0) + 1);
        }
        return map;
    }
}
