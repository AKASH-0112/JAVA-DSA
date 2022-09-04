import java.util.ArrayList;  // for using arraylist , we import class Arraylist
import java.util.Collections; // for using sort method for  arralist only

public class _1arraylist {
    public static void main(String[] args) {
        //  arraylst is one of the collectaion framework
        //  collection frameworks provides an achitecture to store and manipulate the grp of obj
        //  collection frameworks are pre made ds provided by java
        //  collection frameworsk are (classes  , inteface)
        //  classes - Arraylist 
        //  inteface - set

        // ----arraylist
        // array - contigious memory in heap  + fixed size   ,  we store primitives in array + objes too
        // arraylits -  contigous memory in heap +  variable size  ,  only obj stored ,arralist stored in heap
       
        //  initial size always 10 , if  entry cooming for 10th index  
        // size will bcm  =  n + ((((n/2 +1)))

        // **** colection frameworks only take obj to store

        // -------------------------------------------------------------------------------------------------------------------
        ArrayList<Integer> l = new ArrayList<Integer>();  // as we r storing objs so, Integer not int

        // add()
        l.add(12); // add as an obj  , internally it converts primitive to Integer class obj
        l.add(0);
        l.add(7); 
        System.out.println(l);// [12,0,7]

        // get()
        System.out.println(l.get(0));


        // add() inbetween
        l.add(1, 1000); // add in betwween at index   
        System.out.println(l);  

        // set()
        l.set(2, 1212);
        System.out.println(l);
        
        //delete()
        l.remove(3);// ele at index deleet
        l.remove(Integer.valueOf(12)) ;//  obj passing  , for element delete
        System.out.println(l);
        
        //size()
        System.out.println(l.size());

        //loops
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        //sort()
        ArrayList<Integer> l1 =  new ArrayList<Integer>();
        l1.add(34);
        l1.add(4);
        l1.add(3);
        Collections.sort(l1); // collections class is used for sorting arraylist ,not for array , present in util package
        System.out.println(l1);


    }
}

// Arraylist is mutable
// it change original only
// every intance(obj) of any class is mutable in java     ,,, except intance of string class  and string literals
// for sol of string , String builder is class , which give intance obj , which is mutable 