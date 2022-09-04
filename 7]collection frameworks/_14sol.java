import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Students56 {

    String name;
    int rollnum ;

    Students56(String name  , int rollnum){
        this.name =name;
        this.rollnum = rollnum;
    }

    // /-------------------------
    @Override
    public String toString(){
        return name + " " + rollnum ;
    }
    @Override
    public boolean equals(Object o){
        if (o == this) { // this ref to objecetrefname holding object ,and o is inside () also a objectrefname holding objects   -->    objectrefnname.method(objectrefname)
            return true;// here compare both holded objects is same then true
        }
        if (o ==null || getClass() != o.getClass()) { // object ka class type (name)
            return false;
        }

        //  extra line by use 
        Students56 student = (Students56)o;
        return rollnum == student.rollnum;
    }
    @Override
    public int hashCode(){
        return Objects.hash(rollnum);
    }


}
public class _14sol {
    
    public static void main(String[] args) {
        
        Students56 s1 =new Students56("akash", 1);
        Students56 s2 =new Students56("Diven", 2);
        Students56 s3 =new Students56("Harsh", 3);
        Students56 s4 =new Students56("viraj", 1);

        Set<Students56> sset = new HashSet<Students56>();

        sset.add(s1);
        sset.add(s2);
        sset.add(s3);
        sset.add(s4); 
        System.out.println(sset);

        System.out.println(s1.equals(s4)); // true



        
    }
}

// System.out.println(s1.equals(s1)); // true ,here  as this=s1  and o =s1
// System.out.println(s1.equals(s4));// false as both have new , and diffly creted in heap

// toString of Arrays class  -- > [ ,  ,  , ]
// toString of user made class -- > hashcode of class (default)
// toString of user made class -- > class info (overriden )

// this  ref to obj -->    ref.methodname()  -- ref is this
// es ref ne jo object pkda h uska method execute kro