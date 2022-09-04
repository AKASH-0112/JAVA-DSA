public class _1queue_implementation_array {
    

    static class Queues{
         int arr[];
         int size;
         int rear =-1;
        // no need to make , front bcz it will always be at 0 index

        // constructor
        public Queues(int n){
            arr =new int[n];
            this.size =n;
        }

        public boolean isEmpty(){
            return rear==-1;
        }

        // add 
        public  void add(int data){
            if(rear == arr.length-1){
                System.out.println("queue is full!");
                return;
            }

            rear++;
            arr[rear] =data;

        
        }

        // remove
        public  int remove(){
            if(isEmpty()){
                System.out.println("nothing to remove");
                return -1;
            }

            int front = arr[0];

            
            for (int i = 0; i < rear; i++) {
                arr[i] =arr[i+1];
            }
            
            rear--;


            return front;
            
        }

        // peek
        public  int peek(){
            if(isEmpty()){
                System.out.println("nothing to remove");
                return -1;
            }
            return arr[0];
        }
    }


    public static void main(String[] args) {
        
        // front{head}
        // rear
        // FIFO  principles
        // add from last , remove from front 

        // add (enque)
        // remove (dequeue)
        // front   (peek)


        // implementation , using  Array
        // fixed size so we need to store size in var 
        // rare and front initially -1
        // front is always 0th index
        // rear will be movving untill size reach


        // not recocmanded as it has fixed size and  , add O(1)  but remove and peek takes O(n)

        Queues q =new Queues(5);

        q.add(21);
        q.add(6);
        q.add(56);

        
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();

        }

    }
}
