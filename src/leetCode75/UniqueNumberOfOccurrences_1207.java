package leetCode75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class UniqueNumberOfOccurrences_1207 {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        System.out.println(uniqueOccurrences(new int[]{1,2}));
        System.out.println(uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> uniqueMap = new HashMap<>(countMap(arr));

        return uniqueMap.values().stream().distinct().count() == uniqueMap.values().size();
    }

    private static Map<Integer, Integer> countMap(int[] arr) {
        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (resultMap.containsKey(arr[i])) {
                resultMap.put(arr[i], resultMap.get(arr[i]) + 1);
            } else {
                resultMap.put(arr[i], 1);
            }
        }

        return resultMap;
    }
}
