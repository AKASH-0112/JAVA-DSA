public class _8no_of_times_sorted_array_rotteted {
    

    public static void main(String[] args) {
    
        //  rottated sorted array given 
        // find no of time rotteted 
        // original might be like this , 2 4 6 8 10 14 16
        // given rotatted sorted array , 10 14 16 2 4 6 8

     
    //    int [] a = {4 ,5 ,1 ,2 ,3};
       int [] a = {44 ,1 ,2 ,3,5,6,8};

       System.out.println(shortestindex(a));

    }

    public static int shortestindex(int a[]){

        if(a[0] < a[a.length-1]){
            return 0;
        }

        int s =0;
        int l =a.length-1;

        while (s <l) {   // as s==l we will return ans ,that would be our ans 
            
            int mid = (s+l)/2;

            if (a[mid] > a[l]) {
                s =mid+1;
            }
            else{
                  
                l = mid;
            }
        }


        return  s ;// both s and l at same element so  return any thing
   
    }
}

// no of times sorted array rotated is ===  index of smallest ele
// smallest element in rottedted sorted array 