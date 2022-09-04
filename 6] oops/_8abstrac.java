
abstract class Animal7{

  public abstract void walk();

  // non abstarct method of abstarct clas
  public void m(){
      System.out.println("non abstract method of abstract parent class");
  }

  //  abstarct class construcotr
  Animal7 ()
  {
    System.out.println("constructore of animal");
  }


  //  final to remains them same for all animals 
  // cant be overried 
  final public void herbious(){
      System.out.println("eats only  veg");
  }
 
}

class Horse extends Animal7 {

  Horse(){
    System.out.println("constructor of horse");
  }

  public void walk(){
    System.out.println("walks on 4 legs");
  }
}
class Chiken extends Animal7 {

  public void walk(){
    System.out.println("walks on 2 legs");
  }
}
public class _8abstrac {
  public static void main(String[] args) {

      

      Horse h =new Horse();
  
    
  }
}

// 1 ] abstract class must be declared with absract keyword ,even if at least a single method in class is absatract then class must be absarcat
// class can be abstarct without having absatrct method , YES if we do not want to have user obj of that class then we can declared it as abstarct
// 2 ] can have absatrct and non absaract methods too , non abstract methods which do not need to give if we want we can give (overriding) implement in child classes , or they get inherited into child directly also
// 3 ] cant have oj for abstract  class
// 4]  it can have final methods and variables too which do not allow child class to give new implementattion to method by overriding , and cant shadowed the variable if it is final
// 5]  abstract class can have , constructor and static methods too


//  constructor of parent class(concrete or absract ) do not get inherited but called when child class constructor inviokde
// called constructor chaining