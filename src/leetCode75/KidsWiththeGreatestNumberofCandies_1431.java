package leetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class KidsWiththeGreatestNumberofCandies_1431 {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3},3));
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2},1));
        System.out.println(kidsWithCandies(new int[]{12,1,12},10));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resultList = new ArrayList<>();
        OptionalInt greatestNumberOfCandies = Arrays.stream(candies).max();
        Arrays.stream(candies).forEach(candyNumber -> {
            if (candyNumber + extraCandies >= greatestNumberOfCandies.getAsInt()) {
                resultList.add(true);
            } else {
                resultList.add(false);
            }
        });
        return resultList;
    }
}
