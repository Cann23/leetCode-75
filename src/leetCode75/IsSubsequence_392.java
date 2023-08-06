package leetCode75;

public class IsSubsequence_392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int counter = 0;

        if (s.length() == 0) {
            return true;
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(counter)) {
                counter++;
            }
            if (counter == s.length()) {
                return true;
            }
        }

        return false;
    }
}
