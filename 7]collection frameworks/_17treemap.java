import java.util.Map;
import java.util.TreeMap;
public class _17treemap {
    public static void main(String[] args) {
        Map<String ,Integer> m =new  TreeMap<>();// binary serach trees implement hota nternall so O(log n) for operations
        m.put("two", 2);
        m.put("one", 1);
        m.put("fourtyfive", 45);
        m.put("three", 3);  



        m.put("two", 22);

        if ( !m.containsKey("two")) {
            m.put("two", 222);
        }
       
        System.out.println(m.containsValue(1));

        System.out.println(m.isEmpty());

        m.putIfAbsent("two", 2222);

        
        System.out.println(m); // Trees h so sorted order me hote andar , sorted based on keys 

        // iteration for Treemap
        for (Map.Entry<String ,Integer> e:  m.entrySet()) {   // m to set
            
            System.out.println(e);
        }
        for (Map.Entry<String ,Integer> e:  m.entrySet()) {   // m to set
            
            System.out.println(e.getKey());
        }
        for (Map.Entry<String ,Integer> e:  m.entrySet()) {   // m to set
            
            System.out.println(e.getValue());
        }

        System.out.println("-----------------");
        for (String value : m.keySet()) {
            System.out.println(value);
        }
        for (Integer value : m.values()) {
            System.out.println(value);
        }


        m.remove("one"); 
        
        m.clear(); 
    }
}
