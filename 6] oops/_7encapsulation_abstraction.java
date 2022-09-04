abstract class Animal{

  public abstract void walk();
  
}

class Horse extends Animal {

  public void walk(){
    System.out.println("walks on 4 legs");
  }
}
class Chiken extends Animal {

  public void walk(){
    System.out.println("walks on 2 legs");
  }
}


public class _7encapsulation_abstraction {
  public static void main(String[] args) {
    

    //  class is encapsulation(encapsulate the data)
    // encapsulation helps to data hiding by private keyword

    

    //  internal working hide and  shows the less specified things to users

    // abstraction achived by 2 ways -  abstarctkeyword ( class ,methods )   ,interface (bsically gui , or contract)


    Horse h =new Horse();
    h.walk();
    //  we could not create the animals obj
    // Animal a1 =new Animal(); run time error

    // in abstarct class , in sub class we overrride method
    // so parebnt ref allowed ven if it is of abstract type
    Animal a =new Horse();
    a.walk();

  }  
}


