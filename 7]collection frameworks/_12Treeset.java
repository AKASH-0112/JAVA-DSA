import java.util.TreeSet;
import java.util.Set;
public class _12Treeset {
    

    public static void main(String[] args) {
        
        // BST  ke upr implememttaion kr rha hota h internally 
        // so , operation compelxity is  O(logn) , eg .contains ,remove , size

        // Treeset implements all sets property
        // in sorted form works
        // unique


        Set<Integer> tset = new TreeSet<>();

        tset.add(12);
        tset.add(87);
        tset.add(90);
        tset.add(16);
        System.out.println(tset); //ordered +sorted
 
        tset.remove(12);
        System.out.println(tset);


    
        System.out.println(tset.contains(90));
        
        System.out.println(tset.isEmpty());

        System.out.println(tset.size());

        tset.clear();

    }
}
