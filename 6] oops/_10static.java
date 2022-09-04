

class Studento{

    String name;
    static String  schoolname  = "JNV";

    static public void changeschool(String newname){
        schoolname = newname;
    }
}

public class _10static {
    public static void main(String[] args) {
        
        // all obj's  comman prpoert and method

       System.out.println(Studento.schoolname);  // can be accesed by class directly

       // we make them static so updation will be one time at onces 
       Studento s1 =new Studento();
       System.out.println(s1.schoolname);

       Studento.changeschool("JDKM");
       System.out.println(s1.schoolname);





    }
}

// 4 ways to use static
// var , method , block , inner class
// static memory once given (which also save memory) avoid agian agian obj memory


//  use oops concept in programming  , so that sestamatic implememntation happens
// and comparison to real world gets easy