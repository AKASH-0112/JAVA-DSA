class AA{

      int a =12;  // instance aavriable
      static int b =34; // static variable

      void display(String str ){ // instaance method
            System.out.println(str); 
      }
      static void display1(String str ){ //static method
           int c =23 ; //local variable
            System.out.println(str);
            System.out.println(_33two_class_.p); // we can do like this also

      }

}

public class _33two_class_ {
      
      int w =34; // instaance variable
      static int p =4; // static variable

      void printTTT(String str){ // instance method
            System.out.println(str); // instance area
      }
      public static void main(String[] args) {  
            
            //static area
            
            System.out.println(AA.b);

            int g =23; //;local variable for main()

            AA.display1("akash");  // araea same h but clases change so , class name se lana pdta hep se usko
      
      
            
      }
      
}
