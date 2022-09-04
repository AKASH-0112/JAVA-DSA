public class _27rightmostsetbit_mask {
      public static void main(String[] args) {
            //  if  the binary of any integer is 
            // 100111 
            // consider it as 3 set
            //  1 0---  0  ----- 111 
            // if we add 1 to it it will changes all right section 1 to 0
            // and first 0 from right ,which is at centre to 1
            // 39 --- 100111
            //  1 ----     1
            //  39+1 =40 ( 101000)


            // 1s compiment is  ~int
            //2s compliment  =  ~int+1

            // rightmost set bit mask - is an int number (which alwyas in 2 s power)
            // only rsb will be in binary repersentation , and its values in int is rsb mask
            // if int is 39 
            // 100111
            // its right most set bit is  posion 0
            // 000001 this is the int value =1  
            //1 is rsb maks of 39 

            
            // 1 ]

            //  logic is for rsb mask of aany int x  is,
            // int a =  x & x'' (x 2s compliment)
            // x'' =  x' + 1   (x' ==  ~x)

            /*
             x  =         A 1s and  0s ---  [1]----  B 0s
             ~x(x')  =    A 0s  and 1s -----[0]------B 1s
            (~x+1)(x'')=  A 0s and  1s  ----[1]------B 0s

            x & x''  =  0 0 0 0 0 0 1 0 0 0 0 

             */

            int x = 39 ;
            int rbs_mask = (x & (~ x + 1));
            System.out.println(x);
            System.out.println(rbs_mask);
            System.out.println("binary comparisons");
            System.out.println(Integer.toBinaryString(x));
            System.out.println(Integer.toBinaryString(rbs_mask));

            System.out.println("+=========================+");
            
            
            //2]
            // 2s compliment of any number x is -x (~x +1)
            int x1 = 10 ;
            int rbs_mask1 = (x1 & -x1);
            System.out.println(x1);
            System.out.println(rbs_mask1);
            System.out.println("binary comparisons");
            System.out.println(Integer.toBinaryString(x1));
            System.out.println(Integer.toBinaryString(rbs_mask1));
          

            





      }
}

//  x and ist 2s compiment me AND kiya to just rsb remians in binary 