import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {

        Stack<Integer> marks = new Stack<>();

        marks.push(100);
        marks.push(200);
        marks.push(300);
        marks.push(400);
        marks.push(500);
        marks.push(600);

        System.out.println("Stack :" + marks);

        marks.pop();

        System.out.println("Modified array: " + marks);

        int res = marks.peek();

        System.out.println("Peek :" + res);

        int size = marks.size();

        System.out.println("Size :" + size);

        Boolean result = marks.isEmpty();

        System.out.println("Empty ? :" + result);
    }
}
