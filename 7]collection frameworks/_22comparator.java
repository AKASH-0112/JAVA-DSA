import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students90  {



    String name;
    int rollnum ;

    Students90(String name  , int rollnum){
        this.name =name;
        this.rollnum = rollnum;
    }

    
    @Override
    public String toString(){
        return name + " " + rollnum ;
    }
}


public class _22comparator {
    public static void main(String[] args) {
      
        Students90 s1 =new Students90("akash", 1);
        Students90 s2 =new Students90("shubham", 2);
        Students90 s4 =new Students90("harsh", 4);
        Students90 s3 =new Students90("tejas", 3);
        ArrayList<Students90> l = new ArrayList<>(); 
 
        l.add(s1);
        l.add(s3);
        l.add(s4);
        l.add(s2);

        System.out.println(l);
     
        Collections.sort(l , new Comparator<Students90>() {
            @Override
            public int compare(Students90 o1 ,Students90 o2){ /// compare method to overrride

                return o1.name.compareTo(o2.name);
            }
         
        });
        System.out.println(l);

    }
}


// comparable interface allow one of the attribute to sort
// but Comparartor interface help to dynamic sorting with the help of annonomous
// passing Comparartor







//  Object class
// tostring() , equlas() ,hashcode(),getclass(), finalize() for collecting garbage ref var of that class type