import java.util.*;

public class EquilibriumIndexofanArray {
    public static int equilibriumPoint(long[] arr) {
        int n = arr.length;
        long leftsum, rightsum;
        for (int i = 0; i < n; ++i) {
            leftsum = 0;
            for (int j = 0; j < i; j++) {
                leftsum += arr[j];
            }

            rightsum = 0;
            for (int j = i + 1; j < n; j++) {
                rightsum += arr[j];
            }
            if (leftsum == rightsum)
                return i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        long[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println(equilibriumPoint(arr));
    }
}
