import java.util.HashMap;

public class _2missing_number_in_zero_n_array {
    public static void swap(int a[] ,int i ,int currect_index){
        int temp = a[i];

        a[i] =a[currect_index];
        a[currect_index] =temp;
    }
    
    // only one element is missing
    public static void main(String[] args) {
        
        // give  n  , array
        // have [0,n] numbers
        // find missing from it
        //  n =3 , [0,3] ,  --- [0,1,3]  missing is 2
        //  n= 3 ,  [0,3] ,  --- [0,1,2]  missing is 3

        // n=3 , so array must be [0,1,2,3]
        // sum of real -give will be our ,missing number

        // approach 1 , O(n)
        int n =3;
        int a [] = {0,1,3};
        int realsum = 0;
        for (int i = 0; i <= n; i++) { // even if n is not given , we can add upto a.length 1+2+3
            realsum =realsum+i;
        }
        int givenarraysum = 0;
        for (int i = 0; i < a.length; i++) {
            givenarraysum =givenarraysum+a[i];
        }
        System.out.println(realsum-givenarraysum);


        // approch 2 , cyclic sort 
        // cyclic sort lgao ,+ agr any number ka currect index  > than nums.length h to aage bdho
        int arr[] = {2,0,1,3};
        int  ii = 0 ;
        while ( ii < arr.length) {
            
            if ( arr[ii] < arr.length && arr[ii] != arr[arr[ii]]) {
                swap(arr,ii,arr[ii]);
            }
            else{
                ii++;
            }
        }
        // search insortetd array
        //where is the condtion that ,the index i != arr[i]
        // that means  index i , have not its eleemnt which is basically i only
        // if not found return arr.length ()  ,  n=3 , [0,1,2] we will not get index which is not having same index value element

        for (int j = 0; j < arr.length; j++) {
            
            if (j != arr[j]) {
                System.out.println(j);
                break;
            }

            if (j==arr.length-1) {  // in case last element is missing
                System.out.println(arr.length);
            }
        }





        // approch 3 , hashmap
        //O(n)
        // O(n) space
        HashMap<Integer ,Boolean> m = new HashMap<>();
        int k = 3 ;
        int arry [] = { 0,1,2};
        for (int i = 0; i <= k; i++) {
            m.put(i, false);
        }
        for (int i : arry) {
            if (m.containsKey(i)) {
                m.put(i, true);
            }
        }
        for (Integer b : m.keySet()) {
            if (m.get(b)==false) {
                System.out.println(b);
            }
        }
    }
    
  
}


// n =5 , means array ahs 6 element