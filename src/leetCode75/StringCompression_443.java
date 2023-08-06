package leetCode75;

import java.util.ArrayList;
import java.util.List;

public class StringCompression_443 {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','a','b','b','c','c','c'}));
        System.out.println(compress(new char[]{'a','a','a','b','b','a','a'}));
        System.out.println(compress(new char[]{'a'}));
        System.out.println(compress(new char[]{'a','b','b','b'
                                                ,'b','b','b','b'
                                                ,'b','b','b','b','b'}));
    }

    public static int compress(char[] chars) {
        // convert char array to string
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s = s.concat(String.valueOf(chars[i]));
        }

        // find all substrings
        List<String> subStrings = new ArrayList<>();

        int begin = 0;
        for (int j = 0; j < s.length() - 1; j++) {
            if (s.charAt(j) != s.charAt(j + 1)) {
                subStrings.add(s.substring(begin, j + 1));
                begin = j + 1;
            }
        }
        subStrings.add(s.substring(begin, s.length()));

        // add chars and counts from substrings
        String result = "";

        for (String sub : subStrings) {
            result = result.concat(String.valueOf(sub.charAt(0)));
            if (sub.length() > 1) {
                result = result.concat(String.valueOf(sub.length()));
            }
        }

        // convert input array
        for (int i = 0; i < result.length(); i++) {
            chars[i] = result.charAt(i);
        }

        return result.length();
    }
}
