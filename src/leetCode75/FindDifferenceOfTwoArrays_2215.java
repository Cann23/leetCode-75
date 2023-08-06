package leetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDifferenceOfTwoArrays_2215 {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();

        Arrays.stream(nums1).forEach(element1 -> {
            boolean anyMatch = Arrays.stream(nums2).anyMatch(element2 -> (element1 == element2));
            if (!anyMatch && !answer1.contains(element1)){
                answer1.add(element1);
            }
        });

        Arrays.stream(nums2).forEach(element1 -> {
            boolean anyMatch = Arrays.stream(nums1).anyMatch(element2 -> (element1 == element2));
            if (!anyMatch && !answer2.contains(element1)){
                answer2.add(element1);
            }
        });

        result.add(answer1);
        result.add(answer2);

        return result;
    }


}
