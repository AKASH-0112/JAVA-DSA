
public class _2circular_queue_array {

    // front and rear are indexes
    static class Queue {

        int size;
        int arr[];
        int front = -1; // need to define in circular bcz it keeps changing
        int rear = -1;

            Queue(int n) {
            this.size = n;
            arr = new int[n];
        }

        public boolean isEmpty() {
            return (front == -1 && rear == -1);
        }


        // add
        public void add(int data) {
            if (front == (rear+1) % size) {
                System.out.println("full queue");
                return;
            }
            if (front == -1) {  // declared first front , while adding first element
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;

        }
        //remove
        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            int result = arr[front];
            // we think this condtion will aslo be for -1,-1 , no as we have check upside efirst is that empty
            if (rear == front) { //single element condition
                rear = -1;
                front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        //peek
        public  int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }

        
    }
    
    public static void main(String[] args) {
        
        // for O(1) for remove  operation
        // we can use circular queue
        
        System.out.println("-----------------------");
        Queue q = new Queue(5);
      
        q.add(12);
        q.add(55);
        q.add(34);
        q.add(78);
        q.add(98);
        
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println("-----------------------");
        q.add(12);
        q.add(55);
        q.add(34);
        q.add(78);
        q.add(98);
        
        q.remove();
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();

        }
        
        System.out.println("-----------------------");
        q.add(12);
        q.add(55);
        q.add(34);
        q.add(78);
        q.add(98);
        q.remove(); // front bcm 1st index
        q.add(10000); // added last on 0th index
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
