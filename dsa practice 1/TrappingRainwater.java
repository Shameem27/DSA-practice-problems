public class TrappingRainwater {
    public static int trapRainwater(int[] arr) {
        int n = arr.length;
        if (n <= 2) return 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 0, 1, 0, 4, 0, 2};
        int result1 = trapRainwater(arr1);
        System.out.println("Total trapped rainwater: " + result1);
	int[] arr2 = {1,2,3,4};
	int result2 = trapRainwater(arr2);
	System.out.println("Total trapped rainwater: " + result2);
    }
}