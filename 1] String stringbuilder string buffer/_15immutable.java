class _15immutable{
    public static void main(String[] args) {
        
        //  strings are immutable in java
        // immutable = not updatable and changable

        //string object litteral are in heap(string pool)
        //  string contant pool === string pool
        

        String str ="akash";
        String str1 ="akash"; // both  ref variables are pointing to same litteral in pool as strings are same

        str.concat("sable"); // new litteral created (akash sable)
        //but will lost and collected by java garbage collector as it has no ref variable
        // still str is "akash"
        System.out.println(str);

        str = str.concat("sable"); // so here new obj created and old ref variable is just changed its reference
        // the old literall will be lost and collected by garbage collector automatically

        //------so above we see the original literall or object do not change or updated 
        // new created and old ref variable is assigned to it 
        System.out.println(str);

        // -----------------------------------------------why--------------------------------------------------------


     /*   As Java uses the concept of String literal. Suppose there are 5 reference variables, all refer to one object "Sachin". If one reference variable changes the value of the object, it will be affected by all the reference variables. That is why String objects are immutable in Java.*/
     // 3 logo ka naam akash h , and after some yr 1 one of them update its name to aakash
     // so if we update its name by its ref variable , baki 2 logo ka bhi chnage hoga so ,for avoiding this  strings rae immutable in java
     //which is called secuity perpose 




    /*Why String objects are immutable in Java?
As Java uses the concept of String literal. Suppose there are 5 reference variables, all refer to one object "Sachin". If one reference variable changes the value of the object, it will be affected by all the reference variables. That is why String objects are immutable in Java.

Following are some features of String which makes String objects immutable.

1. ClassLoader:

A ClassLoader in Java uses a String object as an argument. Consider, if the String object is modifiable, the value might be changed and the class that is supposed to be loaded might be different.

To avoid this kind of misinterpretation, String is immutable.

2. Thread Safe:

As the String object is immutable we don't have to take care of the synchronization that is required while sharing an object across multiple threads.

3. Security:

As we have seen in class loading, immutable String objects avoid further errors by loading the correct class. This leads to making the application program more secure. Consider an example of banking software. The username and password cannot be modified by any intruder because String objects are immutable. This can make the application program more secure.

4. Heap Space:

The immutability of String helps to minimize the usage in the heap memory. When we try to declare a new String object, the JVM checks whether the value already exists in the String pool or not. If it exists, the same value is assigned to the new object. This feature allows Java to use the heap space efficiently.

Why String class is Final in Java?
The reason behind the String class being final is because no one can override the methods of the String class. So that it can provide the same features to the new String objects as well as to the old ones. */

    }
}




//  str  = str +"sable"   this is alternative for concate()