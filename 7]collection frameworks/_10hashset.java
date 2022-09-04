import java.util.HashSet;
import java.util.Set;

// O(n) me hote operations find , contains ..etc

public class _10hashset {
    public static void main(String[] args) {
        

        // set interface , derived from collection interface 
        // hashset ,Linkedhshedset ,Treeset follow a single property of set interface that , no duplicates 

        // no ordered , and no duplicates
        Set<Integer> set = new HashSet<>();

        set.add(12);
        set.add(87);
        set.add(90);
        set.add(16);
        System.out.println(set); // random ordered
        //bcz internally hashing cl rhi h
        // first element hash generated then added to framework  as hash(code)
        // each element have unique hash
        // and on basis of this hash , framework only adds unique hash in framework ,which means unnique element


        set.remove(12);
        System.out.println(set);


        System.out.println(set.contains(90));
        
        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
    }
}
