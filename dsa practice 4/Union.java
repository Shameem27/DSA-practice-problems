import java.util.HashSet;
import java.util.ArrayList;

class Union {
    static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : set) {
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 2, 1 };
        int[] b = { 3, 2, 2, 3, 3, 2 };
        ArrayList<Integer> result = findUnion(a, b);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
