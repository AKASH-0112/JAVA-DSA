// used for copiyng entire obj

class Student3 {

    String  name;
    int age;
    public  void  getinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student3(Student3 obj){
        this.name =obj.name;
        this.age =obj.age;
    }
    Student3(){

        // default // nonpara  constructor
    }

}
public class _3copy_Contructor {
    public static void main(String[] args) {
        
        Student3 s1 =new Student3();
        s1.name ="deepak";
        s1.age =23;

        Student3 s2 = new Student3(s1);
        s2.getinfo();
    }
}


// in cpp destructor for garbage colection
// manually to write destructor in cpp classes if obj ref do not hav e any obj to it it will called destructore function of that class

//java auto garbage collection automatically (ref having null and no obj in heap)