import java.util.LinkedHashMap;
import java.util.Map;
public class _16LinkedHashMap {
    
    public static void main(String[] args) {
        


        Map<String ,Integer> m =new  LinkedHashMap<>();// in oredered hota as per put()
        m.put("two", 2);
        m.put("one", 1);
        m.put("fourtyfive", 45);
        m.put("three", 3);  


        System.out.println(m); 

        m.put("two", 22); 

        if ( !m.containsKey("two")) {
            m.put("two", 222);
        }
       
        System.out.println(m.containsValue(1));

        System.out.println(m.isEmpty());

        m.putIfAbsent("two", 2222);

        
        System.out.println(m); 

        
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
