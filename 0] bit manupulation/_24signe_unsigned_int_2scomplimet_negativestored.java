public class _24signe_unsigned_int_2scomplimet_negativestored {
      public static void main(String[] args) {
            //  an integer can be signed or unsigned number

            // signed is either + or  -   , in this one bit is reserved for sign ,  0 for + number , 1 for nrgative number , range is from  -ve number to +number
            // eg for 3bits
            /*

            0 0 0   =+0
            0 0 1   =+1
            0 1 0   =+2
            1 0 0   =-0            leftmost bit is for sign(_ or +)
            1 1 0   =-2             (-3  -  3)   =   (- 2^(n-1 )+1  - 2^(n-1)-1)
            1 0 1   =-1
            0 1 1   =+3
            1 1 1   =-3
             
             */

            // unsigned means only +   , no bit is reserve for + ness , range is from 0 - +number
            // eg for 3 bit
            /*
            0 0 0   =0
            0 0 1   =1
            0 1 0   =2
            1 0 0   = 4            no bit is for sign(_ or +)
            1 1 0   = 6             (0 -7)   -   (0  - 2^n-1)
            1 0 1   = 5
            0 1 1   = 3
            1 1 1   = 7
             */


            // in java intgeers are signed (no unsisgned )
            // drawbacck of signed  number is the 0 counts 2 times in it range
            // -0  + 0
            // 1 0 0  and  0 0 0
            
      }
}
//  only negative store in 2s compliment (so that operatio  can be done in a single circuit)

//  vese hote  to apna  number hi  , but for calculation perpose

//  2s compliment use hota h calculation ke liye (add sub etc) 
// and numbers stored 2s complimnet me hote h

//  adding  1 to any number 
// is like adding binary of number  with binary of 1 which is 1
// if rightmost bit of number is 0 then we add 1 at that postion only
// if not we for 1-1 , we write 0 and pass 1 to next bit of number



// -4 stores as
// 0100
// 1011   1s
// 1011+1  1s+1
// 1100  --------------- which rperesent  4 and left most bit reperesnt sign which is -ve as there is 1







//  range of byte datatype is -127 -128
// this is dur to java use signed inttegrt
// so range is  - 2^7 +1  ------  2^7-1
//       -127 to 128






// why we need 2s compliment to store -ve
// bit overflow problem
