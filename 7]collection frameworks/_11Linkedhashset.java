import java.util.LinkedHashSet;
import java.util.Set;
// O(n) me hote operations find , contains ..etc

public class _11Linkedhashset {
    public static void main(String[] args) {
 

        // same all property of hashset
        Set<Integer> lhset = new LinkedHashSet<>();

        lhset.add(12);
        lhset.add(87);
        lhset.add(90);
        lhset.add(16);
        System.out.println(lhset); //ordered hota h maintain
 
        lhset.remove(12);
        System.out.println(lhset);


        System.out.println(lhset.contains(90));
        
        System.out.println(lhset.isEmpty());

        System.out.println(lhset.size());

        lhset.clear();
    }
}

