import java.util.Stack;

public class NextGreaterElement {
    public static void printNextGreaterElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + nge[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 2, 25};
        System.out.println("Next Greater Elements for arr1:");
        printNextGreaterElements(arr1);

        int[] arr2 = {13, 7, 6, 12};
        System.out.println("Next Greater Elements for arr2:");
        printNextGreaterElements(arr2);
    }
}
