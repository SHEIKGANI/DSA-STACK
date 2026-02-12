import java.util.Stack;

public class GreaterElement {

    public static void findNGE(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            // If current element is greater, pop all smaller elements

            while (!stack.isEmpty() && arr[i] > stack.peek()) {
                stack.pop();
                System.out.println("---------->" + arr[i]);
            }
            stack.push(arr[i]);
        }

        // Remaining elements in stack don't have next greater

        while (!stack.isEmpty()) {

            int ele = stack.pop();
            System.out.println("-1" + "removed " + ele);

        }

    }

    public static void main(String[] args) {

        int[] arr = { 4, 5, 2, 10 };
        findNGE(arr);

    }
}