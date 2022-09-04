import java.util.Scanner;

public class _29odd_even {
      public static void main(String[] args) {
            
            //  agr rightmst bit of number is 0   then even 
            // as  we multiple each bit by power of 2
            // the only postion that gives odd value to add in total is , righmost bit of any number
            // just need to check that

            Scanner sc  =new Scanner(System.in);
            int a =sc.nextInt();

            if ((a & 1) == 0) {
                 System.out.println("number is even"); 
            } else {
                  
                  System.out.println("number is odd"); 
            }
      }
}
