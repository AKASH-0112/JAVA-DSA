import java.util.Scanner;

public class _14string {
    public static void main(String[] args) {
        //  string is non primtive datatype in java
        // user can defined length(any)

        String st ="AKASH IS GOOD BOY";

        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(s);

        
        //-------concatationation
        String fname ="Akash";
        String Lname = "Sable";
        String Fullname = fname+" "+Lname;
        System.out.println(Fullname);
        // basically + concate two diff string
        int b=12;
        System.out.println("AKASH" + b); // b is also string in this
        String aa ="aaaakash";
        String bb="saaaable";
        String c = aa.concat(bb);
        System.out.println(c);


        // -----length()
        System.out.println(fname.length());


        //---- charat()
        for (int i = 0; i < fname.length(); i++) {
            System.out.print(fname.charAt(i)+" ");
        }


        //---compareTo()    most preferable in use (less errror only compare string not reference ,== compares both)
        /* 
        s1>s2 ===>  return +ve 
        s1 <s2 ===>  return -ve
        s1==s2 ===>  0
         compare both string word by word
         and if disimilar occurs, it will give big to higher alphabet and as per it  will give -ve or +ve
         hellow< wellow  aahellow> aagellow   
        */
        String s1 ="helllow";
        String s2 ="gellow";
        System.out.println(s1.compareTo(s2));
        String s3 ="helllow";
        if (s1.compareTo(s3)==0) {
            System.out.println("yes equal");
        } else {
            System.out.println("not equal");
        }

        //-----  equlas() ,only check string not ref   , is boolean return  


        //----substring()
        String sen ="akash is good boy";
        String nw = sen.substring(8, sen.length());  // end index  excluded
        System.out.println(nw); 
        //if no last index pass it is s.lenght()



        // ----------------conversion of int to string and string integer to integer

        int a =123;
        String si =Integer.toString(a);
        System.out.println(si.length()); // if si is string then only we can use lenght()

        String in ="123";
        int o = Integer.parseInt(in);
        System.out.println(o);


      




    }
}
