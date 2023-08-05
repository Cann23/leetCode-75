package leetCode75;

public class ProductofArrayExceptSelf_238 {
    public static void main(String[] args) {
        System.out.println(productExceptSelf(new int[]{1, 2, 3, 4}));
        System.out.println(productExceptSelf(new int[]{-1,1,0,-3,3}));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] resultArray = new int[nums.length];

        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];

        leftProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }

        rightProduct[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            resultArray[i] = leftProduct[i] * rightProduct[i];
        }

        return resultArray;
    }
}
