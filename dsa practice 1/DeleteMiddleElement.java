import java.util.Stack;

public class DeleteMiddleElement {
    public static void deleteMiddle(Stack<Integer> stack, int currentIndex, int size) {
        if (stack.isEmpty() || currentIndex == size / 2) {
            stack.pop();
            return;
        }
        
        int temp = stack.pop();
        deleteMiddle(stack, currentIndex + 1, size);
        stack.push(temp);
    }

    public static void deleteMiddle(Stack<Integer> stack) {
        int size = stack.size();
        if (size > 0) {
            deleteMiddle(stack, 0, size);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        deleteMiddle(stack);
        System.out.println("Stack after deleting middle element: " + stack);

        stack.clear();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        deleteMiddle(stack);
        System.out.println("Stack after deleting middle element: " + stack);
    }
}
