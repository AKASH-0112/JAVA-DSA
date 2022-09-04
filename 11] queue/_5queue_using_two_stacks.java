import java.util.Stack;

public class _5queue_using_two_stacks {
    
    static class Queue {
        
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {

            return s1.size() == 0;
        }
        
        // add 
        public void add(int data) {
            while (!s1.isEmpty()) {

                    s2.push(s1.pop());
                }

                s1.push(data);

                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            
        }
        
        // remove
        public int remove() {

            if (s1.isEmpty()) {
                return -1;
            }
            
            return s1.pop();
            
        }
        
        //peek
        public int peek() {
            if (s1.isEmpty()) {
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        
        //  by using two satcks we can implemennt queue
        // but the queue wll not fully eficiant 
        // add O(n)  or remove O(n)   , ek case rhegi 

        
        Queue q = new Queue();
        q.add(72);
        q.add(2);
        q.add(89);
        q.add(67);
        System.out.println(q.peek());
        
        System.out.println(q.remove());
        System.out.println(q.peek());

    }
}
