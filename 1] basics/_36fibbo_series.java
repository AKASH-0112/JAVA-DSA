import java.util.Scanner;

public class _36fibbo_series {
      public static void main(String[] args) {
            
            //  0 1 1 2 3 5 8
            //  0 1 2 3 4 5 6



            Scanner sc =new Scanner(System.in);
            int x =sc.nextInt(); // print upto nth fibo number
            int a=0;
            int b=1;
            System.out.print(a +" "+b);

            for (int i = 1; i <= x-1; i++) {
                  
                  int c =a+b;
                  System.out.print(c+" ");
                  a=b;
                  b =c;

            }

      }
}
