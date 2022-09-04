import java.util.Scanner;
public class _2input_output_variables {
    
    public static void main(String[] args) {
        
        //----------- output
        // System is class , print is function 
        System.out.println("akash");  // give next line to next print
        System.out.print("akash");
        System.out.print("akah is good  \n");
        System.out.println("boy");

        System.out.println("akash \nis \ngood boy");  // after \n no need to give space for word it will affect indent 


        //-----------variables
        // store in memory of computer ,having memory blocks
        String name ="tonay stark";
        int a=89;
        double d =12.34;
        name= "akash"; // we change vaiable valus also
        a=90;
        System.out.println(a);
        System.out.println(name);

        // -----------------datatype
        // java is typed langauge
        // before creating variable we need to give type of variable(which is must in java)
        // so size will get as its type needed
        // in js, var or let are  decide internally which is it (python aslo a non typed language)
        // primitive datatype -  short byte int long float double  char
        // non primtive datatype - array string interface class object

        int  num1 = 12; // num1 in memory
        int num2 =34 ; // num2 in memory
        int sum =num1+num2; // sum created in mmory
        System.out.println(sum); // sum fetched  from memory
        // priorities of operators 
        // * / % >>> - +
        //  ()  have  highest priority
        // calculation left to right
        // ----------------------input 

        Scanner sc = new Scanner(System.in);
        String namea  =sc.next(); // sc
        System.out.println(namea);
        int r = sc.nextInt(); // sc 
        // sc is same so if we give a line of words in first , then r will be of next to that word 
        // see error also
        System.out.println(r);

        // error , in which  no next input taken 
        System.out.println("enter age");
        int age = sc.nextInt();  
        System.out.println("enter name ");
        String name1 = sc.nextLine();
        // next() , nextline() , nextInt()


    }
}


//  auto promoton of variables in expression
// operator  calc (lef to right )
// memory working