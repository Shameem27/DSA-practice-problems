import java.util.Arrays;

public class ChocolateDistribution {
    public static int findMinDifference(int[] arr, int m) {
        int n = arr.length;
        if (m == 0 || n == 0) return 0;

        // Sort the array to get the chocolates in increasing order
        Arrays.sort(arr);
        // If there are fewer packets than students, it's impossible to distribute
        if (n < m) return -1;
        int minDifference = Integer.MAX_VALUE;

        
        for (int i = 0; i + m - 1 < n; i++) {
            int difference = arr[i + m - 1] - arr[i];
            minDifference = Math.min(minDifference, difference);
        }

        return minDifference;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        int result = findMinDifference(arr, m);
        System.out.println("Minimum difference is " + result);
    }
}