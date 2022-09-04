

class AAA{
      static int a;
      
       void meth(){
           a=213123;
      }

      int x =32;
      static void meth2(){
            AAA ref  =new AAA();  // x craeted inside box of obj , so we need to create the ox to take x
           ref.x=4545; // and we updated that obj x only
      }
}


public class _6memory_static_intance_local {


      public static void main(String[] args) {
            AAA ref =new AAA();
            System.out.println(AAA.a); //0
            ref.meth();
            System.out.println(AAA.a); // 213123
      }
}

//  instance avriables- 1] get if not given any , default value is 0 
// 2]  cannot update it in class ,ouside method
// 3] can update inside method ( which changes  for that object only)

// static - 1]1] get if not given any , default value is 0 
//2]  cannot update it in class ,ouside method(reinitilised
// 3] can update inside method ..(chanegs original if we use  that method(if meth is attic  by class name , if method is insatnce then by obj craetion)  in main method ,and then  print the static var ) 


//  local - 1] no defaault values 
//2] can only accesible withing method  , not ooutside