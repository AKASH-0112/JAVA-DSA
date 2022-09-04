import java.util.ArrayList;
import java.util.Collections;


class Students98 implements Comparable<Students98> {

    //  Comparable interface have a  method  , which we need to override
    @Override
    public int compareTo(Students98 that) {
        
        return this.rollnum -that.rollnum;

    }

    String name;
    int rollnum ;

    Students98(String name  , int rollnum){
        this.name =name;
        this.rollnum = rollnum;
    }

    
    @Override
    public String toString(){
        return name + " " + rollnum ;
    }
}


public class _21Comparable_interface_touseCollection_sort_on_custom_class_obj {
    public static void main(String[] args) {
        
        Students98 s1 =new Students98("akash", 1);
        Students98 s2 =new Students98("shubham", 2);
        Students98 s4 =new Students98("harsh", 4);
        Students98 s3 =new Students98("tejas", 3);

        ArrayList<Students98> l = new ArrayList<>(); // inside any coll frm , obj are stored
        // it might be inbuild classes objectss , Integer , String
        // it might be user defined classes objects
        l.add(s1);
        l.add(s3);
        l.add(s4);
        l.add(s2);

        System.out.println(l);
        
        //  how to sort this type of arraylist , like on what basis and else
        // Collections.sort(l);   // on what basis to compare

        // error bcz it is not implemeted comparable interface
        // which is by default implremted in Integer , String classes
        // where we add in list and by using that compareTo() of comparable interface , which is implemetd in wrapper classes like Integer ,String 
        // by default so there we do not need  create that methdod there 
        // but here we are adding obj only but of custom class , user defined classes
        // which have no compareTo method , which is present in comparable interface
        
        //  String also have bydefault compareTo() , as it is prdefined in class in java
        // java have implemented comparable interfcae in it allready

        // so to use use compareTo() method on any to objects of any user defined class
        // implement comparble interface in that class and override the compareTo()
        //which basically checks , object holded by that ref (do not chekc ref pointng like ==)
    
        Collections.sort(l);
        System.out.println(l);

        //  collection fremework me jo obj dalne vale h hm
        // uske class me , compareTo() method hona cahiye ,bcz Collection.sort(l) internally use that method to
        // sort (on what basisi it decide mostly)
      
    }
}









//  Object class
// tostring() , equlas() ,hashcode(),getclass(), finalize() for collecting garbage ref var of that class type