import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _20Collection_class {
    public static void main(String[] args) {
        
        //  Collection is  class also present  , it is not that collection interface
        // use on collection freameowrks

        ArrayList<Integer> l =new ArrayList<>();// for any collection fremaeowrks

        l.add(12);
        l.add(12);
        l.add(34);
        l.add(78);
        l.add(7);

        System.out.println(Collections.min(l));
        System.out.println(Collections.max(l));
        System.out.println(Collections.frequency(l, 12));

        Collections.sort(l);// accending sort
        System.out.println(l);
        Collections.sort(l ,Comparator.reverseOrder()); // decending order
        System.out.println(l);
    }
}


// Comparator is interface ( which have rveerseOrder method which is default so we can use it directly with interface name)
// Comparable is interface