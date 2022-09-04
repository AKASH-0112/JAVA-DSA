

public class _1fiveToone_oneToFive {

      public static void print(int x){   

            if (x==0) {  // base case
                  return; // recursive call breaks
            }
            System.out.println(x+" ");//outer function work is this (step) //print before call

            print(x-1);  // inner function work on this , calculate new value and provide to outer

            // we can write statem here for retuning from stack 
      }

      public static void prinT(int x){   

            if (x>=6) {  
                  return; 
            }
            System.out.println(x+" ");
            prinT(x+1); 
      }
      public static void main(String[] args) {
            
            //  loop and recursion do same work 
            // but if looping code or iteration code is big we can use recursion

            // also which one is more suitable we have to use as per que

            //--- use in sortig tech , graaph , trees 

            // recursion is function only
            // function calling it self

            //f(f(x))-----> outer function  just do work on value given by inner(inner functio  value is calculated)
            // outer funtion take a step+ ek cheese krta h , assume that inner will do remaining work
            // inner function provide  value to outer to do work and step

            //  stopping condtion for recursive call is base condtion
            
            //  like in basic function we come back to main() after function ends or return
            // same in recursion comes to previous function  by ending last first

            
            /***************************************************************************
             
             we can print  while going or cooming back of call
             for priting while going , defined step of outer function before recursive call
             for printing while cooming , deifned step of outer function after recursive call
             
             // retuurn means end function 
             // void return recusrive fun must haveretun statment in bc
             // function call make stackk frame 


             // base case condtion ka function stack also created ,but due , condition is inside function and at 1 st line function ends(by return keyword,
             // so first function stack pop out of stack or first function call end while recursion is of base condtion's function call


            *************************************************************************** */
           
            // 1 ]  ------------------print number from 5 to 1

            // outer function just  do printing
            // inner will calculate and give new value
            
            //  here  we are returning only control while returning form stack
            print(5);  // in recursion , we are creating new fun stack each time , and function local var and all are declared in it only,
            // so jitne function callls honge uptill base condtion
            // utni baar memeory(stack) me  , n dikhega
            // for print(5) ke liye n=5  ...... print(1) n=1
            for (int i = 5; i > 0; i--) {
                  System.out.println(i+" "); // for iteration i crated in main stack only and updateing each time 
                  //so less memory needed
            }
            //  if recurtion funtion have no base condtion, stack memory(as it is fixed sized) at a point will be full
            // and that time Stackoverflow problem comes ,error
            //  so to avoid  stackoverflow  , we need base condtion
            System.out.println("------------------------");

         

            // 2] ------------print 1to 5
            prinT(1);

          



           


      }
     
}






