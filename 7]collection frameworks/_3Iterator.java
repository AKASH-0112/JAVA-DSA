import java.util.ArrayList;
import java.util.Iterator;  // Iterator interface also in util package

public class _3Iterator {
    public static void main(String[] args) {
        

        // java have 3 cursors  , one of it is Iterator 

        // Iterator cursor is used in collection framework

        // in collection framework it s interface 

        // to create obj of Interator interface ,  we need to call iterator() on any collection framework

        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(56);
        list.add(345);
        list.add(676);

        Iterator<Integer> it = list.iterator();

        // Iterator  interface provide  3 methods
        //  next() -- > return element , hasNext() ---boolean , remove() 

        while (it.hasNext()) {
            
            System.out.println(it.next());
        }
    }
}

//  all classes(Arraylist ,hashSet ..) + interfaces(Collection, iteratble) + Iterator interface 
// are in util package only