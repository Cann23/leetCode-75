package leetCode75;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class ReverseVowelsOfAString_345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("aA"));
        System.out.println(reverseVowels("A man, a plan, a canal: Panama"));

    }

    public static String reverseVowels(String s) {

        String result = s;

        Map<Integer, Character> lettersMap = new TreeMap<>();

        Character[] vowels = new Character[]{'a', 'e', 'i', 'o', 'u'
                , 'A', 'E', 'I', 'O', 'U'};

        for (int index = 0; index < s.length(); index++) {
            int finalIndex = index;
            final Character[] temp = new Character[1];
            boolean anyMatch = Arrays.stream(vowels).anyMatch(vowel -> {
                temp[0] = vowel;
                return vowel.equals(s.charAt(finalIndex));
            });

            if (anyMatch) {
                lettersMap.put(index, temp[0]);
                result = result.replace(result.charAt(finalIndex), ' ');
            }
        }

        List<Integer> entryList = new ArrayList<>();
        List<Character> valueList = new ArrayList<>();

        for(Map.Entry<Integer, Character> entry : lettersMap.entrySet()) {
            entryList.add(entry.getKey());
            valueList.add(entry.getValue());
        }

        Collections.reverse(valueList);

        StringBuilder sb = new StringBuilder(result);

        for (int i = 0; i < lettersMap.size(); i++) {
            sb.setCharAt(entryList.get(i), valueList.get(i));
        }

        return sb.toString();
    }
}
