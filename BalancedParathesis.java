import java.util.Stack;

public class BalancedParathesis {

    public static Boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // step 1 : push all the open paratheses to the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // step 2 : compare all the close paratheses to top of the stack
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();

                // step 3 : comparing the top element from the stack to close paratheses
                if (!isMatching(top, ch)) {
                    return false;
                }
            }
        }
        // step 4 : Return True if Stack is Empty after comparsion
        return stack.isEmpty();
    }

    private static Boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static void main(String[] args) {

        String str = "{[()]}";

        Boolean result = isBalanced(str);

        System.out.println("\n The Result is :" + result);
    }

}
