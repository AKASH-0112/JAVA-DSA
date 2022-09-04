public class _4ceiling_of_number {
    public static void main(String[] args) {
        
        //  ceiling of given number means
        // smallest element in array greter or equal to target element 


        // O(log n)
        int[] array ={2,6,9,13,56};

        System.out.println(seiling(array,12));

        
    }

    static int seiling(int [] a ,int target){

        int start =0;
        int end =a.length-1;
        while (start<=end) { // = make sure that last midle will include

            int mid = start + (end-start)/2 ; ///efficinet way to calculate  mid index

            if(a[mid]==target){
                return mid;
            }
            else if(target >a[mid] ){
                start = mid+1;
            }
            else if(target <a[mid]){
                end =mid -1;
            }
            
        }
        return start; // if non of above return ,means no element is there 

        //  we can also return index value

    }
}


//  concept is that , as we minimize search space , we are getting close to ans 
// at last we left with greter than and less than value ,which have ans between them(imaginary )
// on basis of this we return things
// when condition violated ,end < strat



//  voilated condition,  end <start
// start =end +1
// end start  -----sequence traget is between this , but not present 
// so end is floor and start is ceiling

