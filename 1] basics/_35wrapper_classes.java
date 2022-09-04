import java.util.ArrayList;

import java.lang.*; // wrappers clases are presnt in this package
public class _35wrapper_classes {
      public static void main(String[] args) {
            
            //1]  to convert primitives to obj (why we convert ? ==> oop java so each thig must be obj)

            ArrayList  L = new ArrayList();
            L.add(12); // before older version this 12 , will only accepted  if it is obj
            // but we have passed primitive datatype
            // so to convert primitive to obj we use wrapper class
            Integer I =new Integer(34); // it is old method , new version convert it autmatically
            L.add(I);

            System.out.println(L);

            //---------- unboxing
            Integer i = new Integer(23);
            int ans = i.intValue();

            //2] to use utility methods(which are static) of wrapper classes , on primitivex 

            // MAX_INT , MIN_INT
            // convert string to integer
            String st ="12";
            int a = Integer.parseInt(st);
            // convert intgeer to string
            int x =123;
            String str =Integer.toString(x);


      }
}

//  for every primitive type correspondingwrapper classes are present in java
// autoboxing = primitive to obj
// unboxing  = obj to primtive
