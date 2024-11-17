public class MaximumProductSubarray {
    public static int maxProduct(int[] arr) {
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];

            if (current < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            maxProduct = Math.max(current, maxProduct * current);
            minProduct = Math.min(current, minProduct * current);
            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {-2, 6, -3, -10, 0, 2};
	int[] arr2 = {-1,-3,-10,0,60};

        System.out.println("Maximum product subarray for arr: " + maxProduct(arr1));
	System.out.println("Maximum product subarray for arr: " + maxProduct(arr2));
	
    }
}