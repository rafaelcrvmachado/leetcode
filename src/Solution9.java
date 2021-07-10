public class Solution9 {
    public boolean isPalindrome(int x) {

        String stringX = Integer.toString(x);

        for (int i = 0; i < stringX.length(); i++) {

            if (stringX.charAt(i) != stringX.charAt(stringX.length() - 1 - i))
                return false;

        }
        return true;

    }
}
