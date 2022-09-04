import java.util.Stack;

public class _8reverse_a_stack {
    public static void insertatbottom(Stack<Integer> s, int p){

        if (s.empty()) {
            
            s.push(p);
            return;
        }

        int i = s.pop();
        insertatbottom(s, p);
        s.push(i);

    }
    

    public static void reversed(Stack<Integer>s){
        if (s.empty()) {
            return;
        }

        int p =s.pop();

        reversed(s);

        insertatbottom(s, p);


    }
    public static void main(String[] args) {
        //  O(n)
        //  O(1) withou space

        Stack<Integer> s = new Stack<>();

        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        reversed(s);
    }
}
