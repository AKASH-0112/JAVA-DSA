
public class _1time {
    
    public static void main(String[] args) {
        

        // time to run algoritham as function of imput length
        // time complexity count as function of input length

        //high processing programe -  slow  -  run on fast good machine -seems like programes fast
        //low processing programe  - fast   -runs on slow machine  - seems like programe slow

        // this is why we need to find , programmes itself time , otherwise it will be varies according to machine

        // O() upper bound  ,  omega() lower bound , theta() - avg case

        // O(1)  constant   --  for loop with exact size  , comared one element
        for (int i = 0; i < 10; i++) {
             
        }
        // O(n) linear  -- for loop with n size
        for (int i = 0; i < args.length; i++) {
            
        }

        // O(1)<O(log n)<O(n)<O(n log n)<O(n^2)<O(n^3)<O(2^n)<O(n!)
        // ignore constant in function and lower complexities

        // nested hoga to multiple ,if not add
        //O(m*n) , O(n+m)

        for (int i = 0; i < args.length; i++) {
            
            //if here we call any other funtion which have for which runs n time  
            // tb O(n^2) hogi 

            //  if here , consatnt time me print ho rha h 
            // like sout("sdf")  , O(1)
            // ===> O(1 * n ) == = O(n)

        }

        //  nowdays computer runs 10^ 8 operation per sec
        // contrains on inputs
        //  0 <  n  < 10^8
        /*
         
        < 10 -11  , O(n!) , O(n^6)
        <15-18   , O(2^n * n^2)
        <100     ,O(n^4)
        <400      , O(n^3)
        < 2000   ,   O(n^2 * log n)
        < 10^4    ,  O(n^2)
        < 10^6   ,  O(n log n)
        < 10^8  ,  O(n), O(log n)
         */
    }
}

// TLE =  time limit exceed
