import java.util.Arrays;

class minidiffheight {
    // Method to calculate the minimized maximum height difference
    static int getMinDiff(int[] arr, int k) {
        int n = arr.length;

        // Edge case: If there is only one element, the difference is 0
        if (n == 1) {
            return 0;
        }

        // Sort the array to get the smallest and largest elements
        Arrays.sort(arr);

        // Initial difference between max and min height
        int result = arr[n - 1] - arr[0];

        // Traverse the array and calculate the minimized difference
        for (int i = 1; i < n; i++) {
            // Skip the element if subtracting k would result in a negative height
            if (arr[i] - k < 0) {
                continue;
            }

            // Calculate the potential new min and max heights after adjusting with k
            int minH = Math.min(arr[0] + k, arr[i] - k);
            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            // Update the result to store the minimized difference
            result = Math.min(result, maxH - minH);
        }

        return result;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Provide a value for k and an array of heights (as an example)
        int k = 6;
        int[] arr = {12, 6, 4, 15, 17, 10};

        // Call the getMinDiff method to get the result
        int ans = getMinDiff(arr, k);

        // Output the result
        System.out.println("Minimized Maximum Difference: " + ans);
    }
}
