class A {

    String name = "akash";

    void getinfo(){
        System.out.println(name);
    }
}
class B {
    
    String lastname = "sable";
    int age =23;

    void getinfo(){
        System.out.println(lastname);
    }
    void getinfo(int age){
        System.out.println(lastname + age);
    }
}



class _4overloading_poly{

    public static void main(String[] args) {
        
        //  same method diff works
        // polymorphism

        // overrloading
        // method resolution takes place at compile time 
        // safe polymorphism is compile time 
        // bcz if we use run time poly 
        // it may chance ki errors at run time after deployed of app,while user use it 



        A ref =new A();
        ref.getinfo();

        B ref1 =new B();
        ref1.getinfo();
        ref1.getinfo(23_5);

        // overloaded method are resolved at compile time


    }
}