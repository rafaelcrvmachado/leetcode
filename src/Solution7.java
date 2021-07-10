public class Solution7 {
    public int reverse(int x) {
        long reverseX = 0;
        while (x != 0) {
            reverseX += x % 10;
            x /= 10;
            if (reverseX > Integer.MAX_VALUE || reverseX < Integer.MIN_VALUE) {
                return 0;
            }

            reverseX *= 10;
        }
        return (int) reverseX;
    }
}
