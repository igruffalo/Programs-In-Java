public class ReverseString {
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder result = new StringBuilder();
        int len = str.length();
        for (int i = len-1; i >=0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
