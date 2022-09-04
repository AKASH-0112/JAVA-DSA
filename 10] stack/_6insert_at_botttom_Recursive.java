import java.util.Stack;
public class _6insert_at_botttom_Recursive {
    
    public static void insertAtBottom(Stack<Integer> s ,int topush){

        if(s.empty()){

            s.push(topush);
            return ;
        }

        int p =s.peek(); // store bhi krke rkho so add kr sko
        s.pop(); // pop krte jao uptill empty  , uske bad apna topush dalo  ,again
        insertAtBottom(s, topush);
        s.push(p);
    }

    public static void main(String[] args) {
        
        // O(1) space
        // O(n) time
        
        Stack<Integer> s = new Stack<>();

        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        
        insertAtBottom(s,5);

        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
