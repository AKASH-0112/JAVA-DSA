import java.util.Map;
import java.util.HashMap;

public class _15Hashmap {
    
    public static void main(String[] args) {
        
        //  map , key values
        // map is interface 
        
        HashMap<String ,Integer> m =new HashMap<>();

        m.put("two", 2);
        m.put("one", 1);
        m.put("fourtyfive", 45);
        m.put("three", 3);  // unoredered hota

        // duplicate key wil override old value

        m.put("two", 22);

        if ( !m.containsKey("two")) {
            m.put("two", 222);
        }
       
        System.out.println(m.containsValue(1));

        System.out.println(m.isEmpty());

        m.putIfAbsent("two", 2222);

        
        System.out.println(m);

        // iteration for map
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


        m.clear(); // line wise excute hota any thing in java so , clear at last  , it is not java script
    }
}


