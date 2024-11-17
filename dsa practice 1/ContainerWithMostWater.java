public class ContainerWithMostWater {
    public static int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;

        while (left < right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 4, 3};

        System.out.println("Maximum area of water that can be contained: " + maxArea(arr1));
	int[] arr2 = {3,1,2,4,5};
        System.out.println("Maximum area of water that can be contained: " + maxArea(arr2)); 
 
    }
}