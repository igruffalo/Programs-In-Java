import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {
    public static Map<Character, Integer> duplicateChars(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> duplicateMap = new HashMap<>();
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                duplicateMap.put(entry.getKey(), entry.getValue());
            }
        }
        return duplicateMap;
    }
}
