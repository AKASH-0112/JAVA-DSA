class _2fact_fibo_power {

      static void sum( int x ,int n ,int sum){ // we cant store sum inside function
            // the values which , is pass to next stack ,that should be paras
            // stored memory of each function (local)
            //  x, sum will be updating as per stack level 

            // n will not but we need to take from use upto which number sum to print so we 
            // are wasting memory of seach stack by , n=user number

            if (x==n) {
                
                  sum=sum+x; //ading the lats number too 
                  System.out.println(sum);
                  return ;   // ends stack of x=5,functoion call from memory
            }


            sum=sum+x ;
            sum(x+1 ,n  ,sum);
            //System.out.println(x); /// return aate vkt print (but will not print 5 ,bcz return in if ends , x=5 stack function call) 
      }

      static int fact(int n){ // returning int so no need to any other storage ,in paramtere

            if(n==0 || n==1){
                  return 1; // return value of method / return type must be store also at function call
            }
            // we are calculationg while returning
            int fac_nm1 = fact(n-1); // bss call lagega , memory create nhi hogi for fac_i , store sirf n hoga
            int fact  = n*fac_nm1;
            return fact;

      }

      static void fibo(int a,int b ,int n){ // bc is on n so take para , vese bhi lgega hi vo

            if(n==0){
                  return;
            }
            int c =a+b;
            System.out.println(c);
            fibo(b, c, n-1);
      }

      static int power(int x, int p){
            
            if(x==0){
                  return 0;
            }
            if (p==0) {
                  return 1;
            }

            int powerm1 = power(x, p-1);
            int power = x * powerm1;

            

            return power;
      }
      public static void main(String[] args) {
            

            // 3]  sum of n natural  numbers 
            //  what to pass in paras of function call ( the thing which we will update in function + BC)
            //  what to do at base condtion return sum
            // what func will do (sum+= , x+1  uptill n)
            sum(1, 5,0); // pass initial sum  

            // uppar ja rhe ,sum cal by updating x
            // niche aa rhe tb printing x


            // 4]  factorial
            //  n ki value provide 
            //  kaam , each level we calculate  n-1 factorial and return to ist  call whic is in below stack ......n-1 bcms 1
            // at lst 5*4!-- 4 ! will come from n-1 call of function
            System.out.println(fact(5));

            // 5] fibonacci seriess till nth term

            int a =0;
            int b =1;
            System.out.println(a);
            System.out.println(b);
            int n =7;
            fibo(a,b,n-2);

            // 6] print x^n ( x height of stack , max number of methods in stack at a instance is height of stack)
            // stack heigh comes 6  ,  p =5 , but asymtotic me approx same hi h
            // bcz we consider , infifnity to measure (worste case)
            System.out.println(power(2,5));



      }
}