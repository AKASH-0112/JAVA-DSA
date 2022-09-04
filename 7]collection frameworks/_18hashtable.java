import java.util.Map;
import java.util.Hashtable;
public class _18hashtable {
    public static void main(String[] args) {
         
        // map interface  , inherted class  hashtable

        // same methods as Hashmap has 
        // use hashcode inside  so , stored in any order 


        // major diff between hashMap and Hashtable

        /*         HashMap                 HashTable(most used when old version  )
         * - non syncronized
         * (many threads can acces a single method at a time)      -Sycronised (one thread can acces a single method at a time )
         * -thread unsafe                                          - thread safe           
         * -high performance                                       - low performance
         * - key can have max 1 null. values can be have null      - no null allowed 
         * any no of times
         * 
         * 
         * 
         * 
         *
         */

         Map<String ,Integer> ht =new Hashtable<>();
         ht.put("a", 1);
         ht.put("b", 2);
         System.out.println(ht);
    }
}
