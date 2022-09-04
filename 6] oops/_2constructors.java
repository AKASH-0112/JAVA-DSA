

class Student{
    String  name;
    int age;
    public  void  getinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //1]
    Student(){
        System.out.println("constructor called..");
    }
}

class Student1{
    String  name;
    int age;
    public  void  getinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
//3]
    Student1(String name ,int age){
        this.name = name;
        this.age =age;
    }

    

}
public class _2constructors {
    public static void main(String[] args) {

        Student s1 =new Student(); // Student() is function called constructore
        // new creates heap obj
        s1.name="aaksh";
        s1.age =23;
        s1.getinfo();
        
        //3-4 types of constructors are in java
        // rules - same name as claass, no returntype, called once for any obj (unlike any other function can be called on same obj so many times) called when craeting obj
        // 1 ] non para constructor
        // 2 ] defalut constructor (which has nothing in paras and body ) , which can be ovrried
        // 3 ] paara constructor used for initilisation 
        // 4 ] copy constructor



        Student1 s2 =new Student1("AKASH", 76);
        s2.getinfo();



    }
}



// we cant use this keyword for , static method 
// bcz they are not obj related methods 
// they are independednt 
// and can called by class name