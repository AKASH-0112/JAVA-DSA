public class _2stack_by_linkedlist {
    
    static class Node{
         int data;
        Node next;

        Node(int data){
            this.data =data;
            next =null;
        }
    }

     static class Stack{
        public  Node head;

        public  boolean isEmpty(){
            return head==null;
        }

        public void push(int data){
            Node newnode =new Node(data);

            if(isEmpty()){

                head=newnode;
                return;
            }
            else{

                newnode.next =head;
                head=newnode;
            }
        }
        public  int pop(){
            if (head==null) {
                return -1;
            }
            int topdata = head.data;
            
            head =head.next;
            return topdata;
        }
        
        public  int peek(){
            
            if (head==null) {
                return -1;
            }
            int topdata  =head.data;

            return topdata;
        }
    }


    public static void main(String[] args) {
        
        //  imagine that
        // first node is at bottom of stack , and as next node pushed
        // head is given to it and the node .next will be to previous nhead which is previous node only
        // so that head will be always at top

        Stack  s =new Stack(); // here we are creating inner class obj , in sattic area f main() , so Stack must be static
        // as stack is static we are using obj of node in it so Node also must have to be static
        s.push(12);
        s.push(34);
        s.push(2);
        s.push(98);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
