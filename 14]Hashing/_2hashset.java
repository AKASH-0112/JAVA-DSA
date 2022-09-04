import java.util.HashSet;

public class _2hashset {
    
    public static void main(String[] args) {
        
        //  hashset is  bag , of randmoly placed elements

        HashSet<Integer> h = new HashSet<>(); // we can also declared size if know , it will be optimal way 
        h.add(23);
        h.add(456);
        h.add(267);
        h.add(267); // no duplicate added
        h.add(2789);

        System.out.println(h); // random order me print hoga
        
        if (h.contains(23)) {
            System.out.println("yes");
        }
        h.remove(23);
        System.out.println(h);
        
        if (h.isEmpty()) {
            System.out.println("yes empty");
        }
        else {

            System.out.println("no not empty");
        }
        
        System.out.println(h.size());
        h.clear();
    }
}

//