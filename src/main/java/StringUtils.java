public class StringUtils {
    public static boolean isEquals(String first, String second) {
        return first.equals(second);
    }
    public static String combine(String first, String second) {
        return first + second;
    }
    public static int indexOf(String haystack, String needle) {
        boolean issueFound = false;
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (/*i + j >= haystack.length() ||*/ haystack.charAt(i + j) != needle.charAt(j)) {
                    issueFound = true;
                    break;
                }
            }
            if (!issueFound) return i;
            issueFound = false;
        }
        return -1;
    }
}
