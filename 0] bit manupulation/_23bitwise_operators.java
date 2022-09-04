public class _23bitwise_operators {
      public static void main(String[] args) {
            // bitwise operator
            // & | ^    (binary bitswise operators)
            // ~ << >> (unary bitwise operatosr)

            //  1byte =8bits
            //  0 0 0 0 1 0 1 0  =10
            // 0 0 0 0 0 0 0 0   =0
            

            byte a =10; // takes 1 byte memory
            // means 8 bits
            byte b  =0 ;

            System.out.println(a & b);  // return  decimal values abut compute in binary number //0
            System.out.println(a | b); // 10

            //  ^  XOR  , similar values --> 0  , diff values --->1
            System.out.println(a ^ b); //10


            //  ~ compliment , toggle bits
            System.out.println(~b); // -1 
            //use for converting + to -ve or vic eversa


            //  << ,shift all bit to leff( as per given number)
            // and makes empty as 0
            System.out.println(a<<1);//20

            // >> right shift
            //  a>>can have any number of shifts
            System.out.println(a>>1);//5


         
      }
}

//  bitwise operators operates binary form of given number