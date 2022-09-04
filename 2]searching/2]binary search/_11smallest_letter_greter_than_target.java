public class _11smallest_letter_greter_than_target {
    public static void main(String[] args) {
       
        //  given that , array is sorted in accending order
        // find smallest letter greater than target 
        // letters wraap aroud  condition
        char[] c ={'a','d','f','p'};

        // System.out.println(seiling(c,'g')); // bich me
        System.out.println(seiling(c,'b')); // bich me
        // System.out.println(seiling(c, 'y')); // next greter  not in array  return 0th inde
        // System.out.println(seiling(c, 'z')); // next greter not in array return 0th inde
        // System.out.println(seiling(c, 'p')); // next greter  not in  array , for array last element  return 0th inde
 
    }


    static char seiling(char [] a ,char target){  //change returntype as we need valus this time

        int start =0;
        int end =a.length-1;

        while (start<=end) {

            int mid = start + (end-start)/2 ; 
       
            //  removed  == condition  taget == a[mid]


            if(target < a[mid]){ // we will reach to next by s , when e < s 
                end =mid -1;
            }
            else{
                start = mid+1;    
                // target == a[mid ] also solve in this else

                // else me kiya h condition , bcz while target is last element only , it should update 
                // if we reamisn same  if else then  it will never update 
                // as p is not greater than p itself
            }
            
        
        }
        return  a[start%a.length]; // need to return values

    }
}


//  if the letter is not in the array 
// start will have value , last index+1 === size  always 
// so we need to return that time index 0 

// 2 ways 
//  if , start == A.lenght , retunr index 0
//   violated condition , return start% A.length   , if the letter is not then start always same as size ,which gives us  0 ,(which we need index 0)