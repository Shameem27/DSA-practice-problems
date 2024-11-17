import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};
        int[][] intervals2 = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};

        int[][] result1 = merge(intervals1);
        int[][] result2 = merge(intervals2);

        System.out.println("Merged intervals for intervals1: " + Arrays.deepToString(result1));
        System.out.println("Merged intervals for intervals2: " + Arrays.deepToString(result2));
    }
}