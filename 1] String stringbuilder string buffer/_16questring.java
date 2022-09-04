import java.util.*;
public class _16questring {
    public static void main(String[] args) {
        
        // ---------reverse a string
        String str = "aaksh";


        String rstr ="";
        for (int i = 0; i < str.length(); i++) {
            
            char ch = str.charAt(i);

            rstr = ch  + rstr; // each time new obj in pool for rstr string ref
        }

        System.out.println(rstr);


        // ---------lenght of string contnuous stred in array

        Scanner sc =new Scanner(System.in);

        int size =sc.nextInt();
        sc.nextLine();
        String st[] = new String[size];

        int lenght = 0;
        for (int i = 0; i < st.length; i++) {
            st[i] = sc.nextLine();
            lenght =lenght+st[i].length();
        }
        System.out.println("total lenght is :" + lenght);



        //  ---- replace letter  e with i in given inputed string

        String nstr = sc.nextLine();
        String result =new String(""); // heap and as updated , new created 

        for (int i = 0; i < nstr.length(); i++) {
            if (nstr.charAt(i) == 'e') {
            result =result+"i"; // new each time in heap ,old garbage collated
            } else {
                result=result+nstr.charAt(i);
            }
        }
        System.out.println(result);


        //-------username from email
    
        String  email = sc.next();
        String result2 ="";
        int i =0;
        boolean flag = true;
        while (flag == true) {
              
              if (email.charAt(i) == '@') {
                    flag =false;
              } else {
                    result2 =result2 +email.charAt(i);
              }
              i++;
        }
        System.out.println(result2);





        

    }
}

//  all que can be solved by string builder  , as we  make resut as builder and append in it 