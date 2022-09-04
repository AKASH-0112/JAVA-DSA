import java.util.Scanner;

public class _24bitmanupulation {
      public static void main(String[] args) {
            // 1byte= 8bits (small boxex)
            // playing withis bits is bit manipulation

            // helps to reduce time complexity also in Cp

            // -- major operation 
            // get bit  = to know at any i the bit value(0 or 1)
            // set bit  = to set any ith bit to 1( if already 1 no change if 0 then make t 1)
            // clear bit  =  to make ith bit 0( if 1 then make 0 ,if 0 remains as it is)
            // update bit  = if any ith bit is 0 make it 1, if 1 make it 0

            //  every operation need , bit mask and then we do operation with number and bit mask


            // -------------------------------get bit
            // bit mask =    1<<i ,    i is posion at which we want to find bit value
            // AND operation betwwen number and this bit mask

            //  if output get , 0 then bit at posion is 0
            // if output gets 1 ,then bt ata that posion is 1
            // 1 = 0  0  0  1   , posion is from left to right , 0-n
            //  3rd bit == 3-1 position
            // logic( 1 has only 1 binary number at posion 0 , and the bit potion we want to check we left shift that 1 of 1 to that postion , and then do and opertion of that number with this shifted number ,only to result are posible ,0 or positive number )

            int a = 5;
            //  3rd bit or 2nd position bit
            int result = 1<<2 & a;
            System.out.println(result);
            if (result > 0) {
                  System.out.println("bit is 1");
            } else {
                  System.out.println("bit is 0");
            }


            // ---------------------------------set bit
            // set 1 at ith postion , if already present do nothing
            // 1<<i , i posiontion to set 1(i= nth bit -1)
            // OR operators  between bit maks and number
            // 5 =0101
            int result1 = 1<<1 | a; 
            System.out.println(result1); //7(0111)





            // --------------clear bit
            //to make 0 at i postion 
            // if already 0 rmains as it is, iif 1 make it 0
            // bt mask   ,    1<<i
            //,operation  AND  (betw not of bitmask AND number)

            int result3 = (~(1<<2) & a);
            System.out.println(result3);




            // --------update bit (toggles)
            //  in this we take input from user that what to make 
            // to make bit , 1 oor 0
            // we use same operation in if else (set and clear)

            Scanner sc = new Scanner(System.in);
            System.out.println("update to what (0 /1) :");
            int c = sc.nextInt();
            int i = 5;
            int position = 1;

            int bitmask = 1<<position;
            if (c == 1) {
                   int result4 = bitmask | i;
                   System.out.println(result4);

            } else {
                  int notbitmask =~(bitmask);
                  int result5 = notbitmask &i;
                  System.out.println(result5);
            }







            





      }
}
