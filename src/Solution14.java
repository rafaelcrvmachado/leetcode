import java.util.Arrays;

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {

        int smallestLength = Arrays.stream(strs)
                .map(String::length)
                .sorted()
                .findFirst()
                .get();
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < smallestLength; i++) {
            char c = strs[0].charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != c) return prefix.toString();
            }
            prefix.append(c);
        }
        return prefix.toString();

        /*
SOLUÇÃO DO SITE: usa indexOf de uma substring!
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return "";
            String prefix = strs[0];
            for (int i = 1; i < strs.length; i++)
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) return "";
                }
            return prefix;
        }
*/

    }
}