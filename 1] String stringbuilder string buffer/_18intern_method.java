public class _18intern_method {
      public static void main(String[] args) {
            //  string pool is created in java bcz creating obj every time is costly 
            //  time consuming process 
            // so java developer s comes with idea string pool(which contain unique string literals)

            // intern() is use to put string into pool
            // strings which are not creted in pool ( created by string contructor method)

            String str1 = new String("akash"); // diff memeory in heap
            String str2 = new String("akash"); // diff memory in heap
            System.out.println(str1.compareTo(str2)); // same (0)
            System.out.println(str1==str2);// false  // checks  ref to saem obj or not (truw or fasle)


            String str3 = str1.intern();
            String str4 = str2.intern();
            System.out.println(str3==str4);




            // ----------------------------
            String s1=new String("hello");   // ony in heap 
             String s2="hello";   // only in string pool (in heap bt in diff location)

             String s3=s1.intern();  // s3 string is only in pool 
             System.out.println(s1==s2);
             System.out.println(s2==s3);

             //------------------
             String q = new String("whats upp bro!").intern();

             
            
      }
}
