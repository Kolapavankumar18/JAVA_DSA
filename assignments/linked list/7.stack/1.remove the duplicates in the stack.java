import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(10);
        s.push(30);
        s.push(20);
        s.push(30);

        Stack<Integer> temp = new Stack<>();

        while (!s.isEmpty()) {

            int value = s.pop();

            if (!temp.contains(value)) {
                temp.push(value);
            }
        }

        System.out.println("Stack after removing duplicates:");

        while (!temp.isEmpty()) {
            System.out.print(temp.pop() + " ");
        }
    }
}
