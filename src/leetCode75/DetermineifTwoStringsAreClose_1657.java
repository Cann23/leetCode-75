package leetCode75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class DetermineifTwoStringsAreClose_1657 {
    public static void main(String[] args) {
        System.out.println(closeStrings("abc", "bca"));
        System.out.println(closeStrings("a", "aa"));
        System.out.println(closeStrings("cabbba", "abbccc"));
        System.out.println(closeStrings("abbzzca", "babzzcz"));
    }

    public static boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        map1 = countMap(word1);
        map2 = countMap(word2);

        if (map1.size() != map2.size()
                || word1.length() != word2.length()) {
            return false;
        }

        List<Integer> valuesList = new ArrayList<>(map1.values());
        valuesList = valuesList.stream().sorted().toList();

        List<Integer> valuesList2 = new ArrayList<>(map2.values());
        valuesList2 = valuesList2.stream().sorted().toList();

        for (int i = 0; i < valuesList.size(); i++) {
            if (valuesList.get(i).intValue() != valuesList2.get(i).intValue()) {
                return false;
            }
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                return false;
            }

        }

        return true;
    }

    private static Map<Character, Integer> countMap(String word) {
        Map<Character, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (resultMap.containsKey(word.charAt(i))) {
                resultMap.put(word.charAt(i), resultMap.get(word.charAt(i)) + 1);
            } else {
                resultMap.put(word.charAt(i), 1);
            }
        }

        return resultMap;
    }
}
