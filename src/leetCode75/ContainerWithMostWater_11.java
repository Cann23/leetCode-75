package leetCode75;

public class ContainerWithMostWater_11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int l = 0; // left side
        int r = height.length - 1; // right side

        int area = 0;

        while (l < r) {
            area = Math.max(area, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else if (height[l] > height[r]){
                r--;
            } else {
                l++;
                r--;
            }
        }

        return area;
    }
}
