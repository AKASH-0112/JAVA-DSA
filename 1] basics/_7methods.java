public class _7methods {

    public static void  MyName(String name){

        System.out.println(name);
        return; // nothing means void
        // it indicates that function is terminated
        //  optinal h vese for void

        // but if we donot need to check below line of function of void type write return to end

        
    }

    public static int fact(int a){
        int ans =a;
        if(ans==0 || ans==1)  { 
             return 1;
            }
        else if(ans<0){
            return -1;
        }
        else{
            for (int i = a-1; i >=1; i--) {
                ans = ans*i;
            }
            return ans;
        }
        

    }
    public static void main(String[] args) {
        // method is block of code which take input do operation return result 
        // return type
        // public static must if it is in main class
        // function name (numst be in camel case (all pre declared are in this only))
        // arguments (can ahve multiple arguments of difff dtatatype)
        // returntype can be any of primitive or non primtive
        // void means no return type 


        MyName("Akash"); // function call


        //  functios in memry
        // each function put into stack 
        //each function have diff stack frame 
        // each stack function ,have there variables 
        // after returning value of function the  function in stack gets poped


        System.out.println(fact(4));
        System.out.println(fact(1));
        System.out.println(fact(-1));


    }
}



// *********** method vs function
//function  call without obj of class
//method is with help of obj of class