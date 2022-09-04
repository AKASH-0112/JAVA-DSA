import java.util.ArrayDeque;

public class _9ArrayDeque { // array Dek // used in sliding window technique
    public static void main(String[] args) {
        
        // two headed queue
        // offer() from both side
        // poll() from both side
        // peek() from both side


        ArrayDeque<Integer> ad =new ArrayDeque<>();


        // queue all offer ,peek ,poll+ additional methods are in ad

        ad.offer(12);
        ad.offer(134);// normal queue last offer()

        ad.offerFirst(98); // additional method to offer at first/front
        ad.offerLast(34);
        System.out.println(ad);

        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());// aditional methods to peek at first /front  or last /rear
        System.out.println(ad.peekLast());


        System.out.println(ad);
        ad.poll(); //front /first
        
        ad.pollFirst();// addtional mthods to poll last and first
        ad.pollLast();
        System.out.println(ad);


    }
}

//  by Arraydeque we can implement , stack and queue also 
// for stack , by using  offerlast() ,peeklast() ,polllast()
// for queue , by using  offerlast(),peekfirst()  , pollfirst()