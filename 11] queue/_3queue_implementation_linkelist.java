public class _3queue_implementation_linkelist {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public boolean isEmpty() {
            return (head == null && tail == null);
        }
        
        // add
        public void add(int data) {
           
            Node newnode = new Node(data);
            if (tail == null) { // first element

                tail = head = newnode;
                return;
                
            }
            // if not first

            tail.next = newnode;
            tail = newnode;


        }
        //remove
        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            if (head == tail) { // in case one element
                tail = null;// we r not using return ,down steps will execute
            }
            int front = head.data;
            head = head.next;  // in case one element head also bcm null here
            return front;
        }

        //peek
        public  int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        
        // all operation in O(1)
        // size is also dynamic 

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}


//  most efficient queue O(1) all operations
