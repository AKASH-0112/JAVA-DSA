
public class _8space_time_comp {
    public static void main(String[] args) {
        //  we want apps which , have less memory and load quickly
        // code is called real when it takes less time to load things and takes less memory
        // more efficiency

        // time complexity =  realtion between input size and  running time (operation)
        // like for scanner input n , how many operation need to perform
        for (int i = 0; i < 5; i++) {
            
            System.out.println("printing "); // this will execute 5 time 
            // n unit time 
        }
        // print sattement need 1 unit time ,but this type of time is so neglizible so we ignore it

        // time cople direclt propo to n
        // this relation can be  linear .quadratic, cubic ,exopnetial ,log ,sqroot
        // if  we increase input size by 10 ,then time also increase by 10 unit(for linear)
        // for cubic it is 1000 unit time
        //  if we want  less time in computation , we need small relation betwwen input size and operation

        // -------------------------------examples

        // three type of time comlexity
        //1] best case
        //2] avrg case
        //3] worste case (will not take more than this time)

        //  for linear search
        // best case is at index 1 ==>  1 comparion  ==     omega(1)
        // avg case   1 +2+3...+n /n == n+1/2   ===         theta(n)
        // worste case                        ===           big O(n)

        //****************and for any code we consider worste case only **************

        int n= 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("o");
            }
        }
        /*
        i=0    1 2
        i=1    3 4
        */
        // above  shows that for n=5 , compariosn 25
        // for n=2 ,compariso  4
        // so O(n^2)

        int m=4;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("p");
            }
        }
        // O(m*n)

        for (int i = 0; i < m; i++) {
            System.out.println("ss");
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
        // O(m+n)
        // if m=3 and n= 10^6
        // then O(n)
        //  final time complexity depend on  big input( exponential  values like ^10)
        // final time complexity , as m is neglisible



        // ---------------------------------------------------------------------------
        /*
        compare      O(n)      O(n^2)    O(n^3)
        n=1           1          1          1
        n=2           2          4          8
        n=3           3          9           27
        .
        .
        n=10^5       10^5        10^10       10^30

        O(n^2)----  O shows worste case , n^2 shows that as input n increases the time of code will effect  quadratic

        // running time (n^2)

        */
        // ------------------------
    }
}

//  how many times it will print * per printing time (we consider 1 unit)



//  and  while cnsidering the time complexuty(we assume max possibility)
// upper bound 