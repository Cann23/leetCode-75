package leetCode75;

import java.util.Arrays;

public class FindPivotIndex_724 {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(pivotIndex(new int[]{1,2,3}));
        System.out.println(pivotIndex(new int[]{2,1,-1}));
        System.out.println(pivotIndex(new int[]{1,-1,3}));
    }

    public static int pivotIndex(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        int rightSum;

        if (nums.length == 1 ) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            leftSum = i > 0 ? leftSum + nums[i - 1] : 0;
            rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}
