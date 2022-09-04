public class _16starecase_ways_toreach {
    
    //  no of ways 
    // think same as maze proble , matrix top left to right bottonm

    static int ways(int n){


        if (n==0) {
            return 1;
        }   // think for while abt bc  , by drwaing 
        if (n<0) {
            return 0;
        }


        return ways(n-1)+ways(n-2); // two entery points  ,  cal to reach them 
    }
    public static void main(String[] args) {
        
        //  a boy stand at 0 the stare, ground floor 
        // find ways to reach n the stare ,if boy can have 1 step and 2 step jumps only
        

        System.out.println(ways(3));
        // we can alos give the steps that ca take while climbingn boy have in actual paras
    }
}


//  1 , 2  ,3 steps are more interesting problem 
// base cases diff



// 2^n