import java.util.*;

class LongestConsecutiveSubsequence {
    static int findLongestConseqSubseq(int[] arr, int n) {
        Set<Integer> s = new HashSet<>();
        for (int num : arr) {
            s.add(num);
        }

        int longestStreak = 0;
        for (int num : arr) {
            if (!s.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (s.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of longest subsequence: " + findLongestConseqSubseq(arr, arr.length));
    }
}
