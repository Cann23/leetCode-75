package leetCode75;

public class CanPlaceFlowers_605 {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int availablePlot = 0;

        if (n == 0) {
            return true;
        }

        if (flowerbed.length == 1) {
            if ((flowerbed[0] == 0 && n == 1)
                    || (flowerbed[0] == 1 && n == 0) ) {
                return true;
            } else {
                return false;
            }
        } else {
            if (flowerbed[0] == 0
                    && flowerbed[1] == 0) {
                availablePlot++;
                flowerbed[0] = 1;
            }

            for(int plot = 1; plot < flowerbed.length - 1; plot++) {
                if (flowerbed[plot] == 0
                        && flowerbed[plot - 1] == 0
                        && flowerbed[plot + 1] == 0 ) {
                    availablePlot++;
                    flowerbed[plot] = 1;
                }
            }

            if (flowerbed[flowerbed.length - 1] == 0
                    && flowerbed[flowerbed.length - 2] == 0) {
                availablePlot++;
                flowerbed[0] = 1;
            }
        }

        return availablePlot >= n;
    }
}
