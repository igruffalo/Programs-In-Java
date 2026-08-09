import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public static Set<Character> duplicates(String input) {
        Set<Character> set = new HashSet<>();
        Set<Character> seen = new HashSet<>();
        char[] arr = input.toCharArray();
        for (char c : arr) {
            if(!seen.add(c)) {
                set.add(c);
            }
        }
        return set;
    }
}
