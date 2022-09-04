import java.util.Comparator;
import java.util.PriorityQueue;

public class _8priorityQueue {
    public static void main(String[] args) {
        
        // Queue with priority
        // we can defined priority 

        // Priorityqueue is class only 

        PriorityQueue<Integer> pq =new PriorityQueue<>();
        // Queue<Integer> pq =new PriorityQueue<>();
        //it is Queue only based on prioprity which is given by internally heap (minheap), so same function 

        pq.offer(12);
        pq.offer(67);
        pq.offer(1);
        pq.offer(18);
        pq.offer(2);
        System.out.println(pq);
        // priorityQuene internally use heap data structure
        // heap ds // minheap(small) is at top in heap which gives us this in queue--> [smallest , random fixed order , , , ,] 
        // priority bydefault to less zmount 
        // random order  is given by heapyfy function   of heap datastructure
        
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());



        //** to change priority we use Comparator
        PriorityQueue<Integer> pq1 =new PriorityQueue<>(Comparator.reverseOrder()); // for maxheap
        pq1.offer(12);
        pq1.offer(678);
        pq1.offer(2);
        pq1.offer(56);
        System.out.println(pq1);

    }
}


// if we want min heap , then mosttime use priorityqueue , so no heapyfy function to define