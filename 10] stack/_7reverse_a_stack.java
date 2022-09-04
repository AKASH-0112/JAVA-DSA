import java.util.Stack;

public class _7reverse_a_stack {
    
    public static void main(String[] args) {
        
        //  O(n) time 
        // O(n) space

          
        Stack<Integer> s = new Stack<>();

        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        Stack<Integer> temp = new Stack<>();

        while (!s.empty()) {
            int p = s.pop();
            temp.push(p);
        }

        while (!temp.empty()) {
            System.out.println(temp.peek());
            temp.pop();
        }


    }
}
//  pop() return int + remove element