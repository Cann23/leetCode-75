package leetCode75;

import java.util.ArrayList;
import java.util.List;

public class FindtheHighestAltitude_1732 {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }

    public static int largestAltitude(int[] gain) {
        List<Integer> altitudes = new ArrayList<>();
        int height = 0;

        altitudes.add(0);

        for (int i = 0; i < gain.length; i++) {
            height += gain[i];
            altitudes.add(height);
        }

        return altitudes.stream().max(Integer::compare).get();
    }
}
