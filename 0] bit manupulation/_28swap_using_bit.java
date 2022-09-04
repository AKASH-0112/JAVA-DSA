public class _28swap_using_bit {
      public static void main(String[] args) {
            int a = 5 ;
            int b = 4 ;

            //  1]
            int temp = a; // extra memory used (of 32 bit)
            a = b;
            b = temp;
            System.out.println(a);
            System.out.println(b);

            // 2]

            int x =5;
            int y =4;
             x =x+y;  // this x=9 will need more bit to store ( increase in bit)
             y = x-y;
             x = x -y;
             System.out.println(x);
             System.out.println(y);

             //3]  bit manipulation (efficient way)

             int m =5;
             int n =4 ;
              m =m^n;
              n =m^n;
              m=m^n;
              System.out.println(m);
              System.out.println(n);




      }
}
