
import java.util.LinkedList;
import java.util.Queue;

public class _4collection_framework {
    
    public static void main(String[] args) {
        

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}


//  diff for  using LinkedList and Arraydeque (interview que)