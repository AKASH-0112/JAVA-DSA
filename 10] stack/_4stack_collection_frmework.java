
import java.util.Stack;

public class _4stack_collection_frmework {
    

    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();

        s.push(12);
        s.push(56);
        s.push(13);
        s.push(58);
        System.out.println(s.peek());
        System.out.println(s.pop());
        
        //  travel and printting
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
