package leetCode75;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString_151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> wordList = new ArrayList<>();
        wordList = List.of(s.strip().split(" "));
        for (int word = wordList.size() - 1; word >= 0; word--) {
            if (!wordList.get(word).isBlank()) {
                sb.append(wordList.get(word));
                if (word != 0) {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}
