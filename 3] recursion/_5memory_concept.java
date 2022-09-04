class d {
      static int a=-1;
      
      static void meth(){
            a=213; // a in heap , gets update
            System.out.println(a);
      }
      
      int z =123;
      void meth2(){
            z=456;
            System.out.println(z);
      }
      // a was not in stack of meth , so it given new value , updation done  fo a=213
}

public class _5memory_concept {
      public static void main(String[] args) {
            

            //--------------------
            //static update hoti h to sbhi obj ke liye hoti h
            System.out.println(d.a); //-1
            d.meth();//213 // heap ka a use kiya and update mara , meth ke stack me no memory created while updating  , so original static varibale of clas updated 
            System.out.println(d.a);  //213

            //---------------------------------------------------------
            d ref =new d();
            System.out.println(ref.z);// 123
            ref.meth2(); // 456 make obj ka updation
            System.out.println(ref.z); //456

            d ref2 =new d();// for new ref it will be original
            System.out.println(ref2.z);   


            // --------------sattic var also can be  fetch by ref and class name
            System.out.println("---------------");
            System.out.println(d.a);
            System.out.println(ref.a);  /// but see the suggestion , you should acces them by static way 


      }
}
