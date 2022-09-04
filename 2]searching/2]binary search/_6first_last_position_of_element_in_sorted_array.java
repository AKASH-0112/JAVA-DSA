import java.util.Arrays;

public class _6first_last_position_of_element_in_sorted_array {
    public static void main(String[] args) {
            //  sortted array , with duplicate number 
        // find first occurance an dlast occurance      
        

        // ******bruite force 
        //means worste case solution
        // first while interview 
        // search from start and at same time from end 
        // when element get return index
        // complexity  O(n)


        //here we need log(n)
        // we will  use binary search twice 
        // but still time complexity will remain same 
        // log(n) + log(n)  === log(n) only bcz in time complexity contant are ignored
        // firts binary serach for first occurance 
        // second for last occurance

        int[] ary ={2,4,6,6,6,8,10};

        int[] aryf =show(ary,6);
        int[] aryf1 =show(ary,8);
        int[] aryf12=show(ary,82);
    
        System.out.println(Arrays.toString(aryf));
        System.out.println(Arrays.toString(aryf1));
        System.out.println(Arrays.toString(aryf12));
    }

    static int[] show(int[]array ,int target){
        int A []  ={-1,-1};
        A[0] = occurance(array, target, true);
        A[1] = occurance(array,target, false);
        return A;

    }
    static int occurance(int a[] , int target,boolean firstocc){

        int ans =-1;  // bcause agr ek h cocurance hoga to ans return hoga na , second occurance ke khoj me so ,-1

        int start =0;
        int end =a.length-1;

        while (start<=end) { 

            int mid = start + (end-start)/2 ; 

            if(a[mid]==target){
                if (firstocc) {
                    ans =mid; // may posioble ans ,for first occurance
                    end =mid-1;
                } else {
                     ans =mid; // may posioble ans ,for last occurance
                     start =mid+1;
                 }

            }
            else if(target >a[mid] ){
                start = mid+1;
            }
            else if(target <a[mid]){
                end =mid -1;
            }
            
        }
        return ans; 
    
    }




      
}
