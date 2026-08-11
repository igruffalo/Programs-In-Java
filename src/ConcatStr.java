import java.util.Arrays;

public class ConcatStr {

    public static String getSortAndConcatStr(String str) {
        String[] strArr = str.split(",");
        Arrays.sort(strArr);
        return String.join(",", strArr);
    }
}
