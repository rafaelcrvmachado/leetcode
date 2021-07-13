import java.util.LinkedList;

public class Solution20 {

    public static boolean isValid(String s) {

        LinkedList<Character> openChars = new LinkedList<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    openChars.add(c);
                    break;
                case '}':
                    if (openChars.isEmpty()) return false;
                    if (openChars.getLast() == '{') openChars.removeLast();
                    else return false;
                    break;
                case ']':
                    if (openChars.isEmpty()) return false;
                    if (openChars.getLast() == '[') openChars.removeLast();
                    else return false;
                    break;
                case ')':
                    if (openChars.isEmpty()) return false;
                    if (openChars.getLast() == '(') openChars.removeLast();
                    else return false;
                    break;
            }

        }
        return openChars.isEmpty();
    }
}
