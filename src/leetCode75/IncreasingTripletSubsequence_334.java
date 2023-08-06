package leetCode75;

import java.util.ArrayList;
import java.util.List;

public class IncreasingTripletSubsequence_334 {
    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1,2,3,4,5}));
        System.out.println(increasingTriplet(new int[]{5,4,3,2,1}));
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
        System.out.println(increasingTriplet(new int[]{0,4,2,1,0,-1,-3}));
        System.out.println(increasingTriplet(new int[]{20,100,10,12,5,13}));
        System.out.println(increasingTriplet(new int[]{1,1,1,1,1,1,1,1,1,1,1
                ,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1
                ,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1
                ,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1
                ,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1
                ,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1
                ,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}));
        System.out.println(increasingTriplet(new int[]{1,5,0,4,4,3}));
        System.out.println(increasingTriplet(new int[]{4,5,2147483647,1,2}));
        System.out.println(increasingTriplet(new int[]{5,1,6}));
    }

    public static boolean increasingTriplet(int[] nums) {
        int leftMin = nums[0];
        int rightMax = Integer.MAX_VALUE;


        for (int i = 1; i < nums.length; i++) {

            if (leftMin >= nums[i]) {
                leftMin = nums[i];
            } else if (rightMax >= nums[i]) {
                rightMax = nums[i];
            } else {
                return true;
            }
        }

        return false;
    }
}
