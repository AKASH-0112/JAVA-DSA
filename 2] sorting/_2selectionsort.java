import java.util.Arrays;

public class _2selectionsort {

      //  define samllest index 
      // then smallest index front of that defined one
      // and at last swaps
      //  each pass have 1 swap

      // O(n^2)
      //  smallest at first , in each pass we swap onces only once 
      

      static void sort(int[]a){
            for (int i = 0; i < a.length-1; i++) {
                  
                  int smallest_index= i;  // consider smallest index elemet

                  for (int j = i+1; j < a.length; j++) { // start from i +1   --- < a.length
                        if (a[smallest_index]>a[j]) {
                              smallest_index =j;  // update smallest index 
                        }
                  }
                  swap(a, i, smallest_index); // swap with smallest index updaated and considered smallest index
                  
                  
                  // if considered smallest index have leeast element in array ,
                  //at that time (a,i,i)
            } 
      }
      static void swap(int A[] ,int a  ,int b){
            int temp = A[a];
            A[a]= A[b];
            A[b]=temp;
      }
      public static void main(String[] args) {
            // smallest find in a pass and put at first

            int []a ={3,2,7,1,8};
            sort(a);
            System.out.println(Arrays.toString(a));

      }
}
