import java.util.Stack;

public class _5insert_at_bottom_iterative {

    public static void pushAtBottom(Stack<Integer> s , int topush){

        Stack<Integer> temp  =new Stack<>();

        while (!s.empty()) {
            int p = s.peek();
            s.pop();
            temp.push(p);
        }

        s.push(topush);

        while (!temp.empty()) {
            int p =temp.peek();
            temp.pop();
            s.push(p);
        }

        while (!s.empty()) {
            
            System.out.println(s.peek());
            s.pop();
        }

    }
 
    public static void main(String[] args) {

        // O(n) time
        // O(n) space


        Stack<Integer> s = new Stack<>();

        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        pushAtBottom(s,5);
    }
}
