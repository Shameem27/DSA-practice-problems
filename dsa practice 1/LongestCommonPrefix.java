import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "-1";
        }

        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length - 1];
        int minLength = Math.min(first.length(), last.length());

        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        String prefix = first.substring(0, i);

        return prefix.isEmpty() ? "-1" : prefix;
    }

    public static void main(String[] args) {
        String[] arr1 = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(arr1));

        String[] arr2 = {"hello", "world"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(arr2));
    }
}
