import java.util.LinkedList;
import java.util.Queue;

public class _6Queue {
    public static void main(String[] args) {
        

        //  LinkedList class is implements List interface + Queue interface also 
        // a class can implements multiple interfaces 

        //Queue - FIFO principle , frond end(delection od ele)  ------------ rear end (addingtion of ele)

        //Collection frameworks  or ds are interfaces + classes not only classes
        // so Queue is also ds
        // Queue is interface (we use as ds ) ,implemented by Array and LinkedLIst


        Queue<Integer> q =new LinkedList<>();

        // offer()  to add                 , boolean returntype , if added true or false
        q.offer(12); //front
        q.offer(23);
        q.offer(65); //rear
        System.out.println(q);
        
        //poll()  to delete   front             ,     also returns value of poped elemet ,null if empty
        // q.poll();
        System.out.println(q.poll());
        System.out.println(q);
        
        //peek()  frontmost element          ,  frontmoost element  , null is empty
        System.out.println(q.peek());



        // same to above but dangerous , do notgive null 
        // throws exceptions
        // offer() --- add() in this if tas suscessfull return true ,otherwise exception
        //  poll()--- remove()  null ke liye exception
        // peek() - --- element() null ke liye exception
    }
}
