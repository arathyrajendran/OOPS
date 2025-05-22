import java.util.Stack;

public class RemoveStackEle {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int n : new int[]{-4, 6, 16, 46, 66, 88}) stack.add(n);

        System.out.println("Stack: " + stack);
        System.out.println("Removed element: " + stack.remove(5));
        System.out.println("Final Stack: " + stack);
    }
}