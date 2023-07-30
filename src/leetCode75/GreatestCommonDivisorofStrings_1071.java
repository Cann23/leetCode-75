package leetCode75;

public class GreatestCommonDivisorofStrings_1071 {
    public static void main(String[] args) {
        GreatestCommonDivisorofStrings_1071 greatestCommonDivisorofStrings_1071 = new GreatestCommonDivisorofStrings_1071();
        System.out.println(greatestCommonDivisorofStrings_1071.gcdOfStrings("ABCABC", "ABC"));
        System.out.println(greatestCommonDivisorofStrings_1071.gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(greatestCommonDivisorofStrings_1071.gcdOfStrings("LEET", "CODE"));
    }

    public String gcdOfStrings(String str1, String str2) {

        if (str1.concat(str2).equals(str2.concat(str1))) {
            // great common divisor
            int gcd = greatCommonDivisor(str1.length(), str2.length());
            return str1.substring(0, gcd);
        } else {
            return "";
        }

    }

    private int greatCommonDivisor(int length1, int length2) {
        if (length2 == 0) {
            return length1;
        } else {
            return greatCommonDivisor(length2, length1 % length2);
        }
    }
}
