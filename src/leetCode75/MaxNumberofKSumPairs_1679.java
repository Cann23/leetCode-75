package leetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxNumberofKSumPairs_1679 {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1,2,3,4}, 5));
        System.out.println(maxOperations(new int[]{3,1,3,4,3}, 6));
    }

    public static int maxOperations(int[] nums, int k) {
        int numberOfOperation = 0;

        List<Integer> numsList = new ArrayList<>();

        for (Integer num : nums) {
            numsList.add(num);
        }

        int left = 0;
        int right = numsList.size() - 1;
        int sum = 0;

        Collections.sort(numsList);

        while (left < right) {
            sum = numsList.get(left) + numsList.get(right);

            if (sum < k) {
                left++;
            } else if (sum > k) {
                right--;
            } else {
                left++;
                right--;
                numberOfOperation++;
            }
        }

        return numberOfOperation;
    }
}
