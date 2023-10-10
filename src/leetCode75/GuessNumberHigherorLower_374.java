package leetCode75;

public class GuessNumberHigherorLower_374 {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
        System.out.println(guessNumber(1));
        System.out.println(guessNumber(2));
    }

    public static int guess(int num) {
        int pick = 1;
        return Integer.compare(pick, num);
    }

    public static int guessNumber(int n) {
        if (n == 1) {
            return 1;
        } else if (guess(n) == 0) {
            return n;
        }

        int l = 1;
        int r = n;

        int middle;

        while (l < r) {
            middle = l + (r - l) / 2;

            if (guess(middle) == -1) {
                r = middle;
            } else if (guess(middle) == 1) {
                l = middle;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
