public class _3log_n_power {


      static int powercal(int x, int n){
            
      
            if (n==0) {
                  return 1;
            }

            int a = powercal(x, n/2);
            int ans =a*a;

            if (n%2==1) {
                  ans=ans*x;
            }
            
            return ans;
      
      }

      //  complexity porpostinal hoti h input size se so we ingnore ,const


      public static void main(String[] args) {
            



            // 6]  print x^n  ,   log n stack height
            //  stack ki heigh km mean , memory utilisation minimum
            // optimise recursion
            // in Dp we wil see thistype of optimise sol , by for optimising recursion (we use memorisation)
            // in Dp ,if we are solving by iteration, we use memorisation(table)\
            
            // in last ex , we were forming new stack for each power
            // drawa tree we can we  are calculating utp level of tree where x^1, levelof tress == stacks(ingnores the main() ka stack)
            // here we will , 
            // x^n  ---- x^n/2 * x^n/2   for even n
            // x^n  ---- x^n/2 * x^n/2 *x  if odd n  
            // here stack level reduces
            //eg ;  for 2^4 

            int y =powercal(2, 4);
            System.out.println(y);




      }
}
