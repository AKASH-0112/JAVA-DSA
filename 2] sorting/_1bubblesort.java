import java.util.Arrays;

public class _1bubblesort {

      // bubble sort
      // O(n^2)  // we ignnore the constants
      static void sort(int a[]){
            
            for (int i = 0; i < a.length -1; i++) { // for each pass, in each pass largest among array placed at last
                  // and we need to run this till   n-1  as first element will remians sorted at last
                  
                  for (int j = 0; j < a.length-1-i; j++) { // this is for comparion and swaping in  each pass
                        //this is upto  n-1 - i ,each time last one ignore
                        if (a[j] >a[j+1]) {// j start from index o of array
                              // and also accesing j+1
                              swap(a,j, j+1);
                        }
                  }
            }
         // outer loop for pass  -- so upto  < lenght-1
         // inner for compariong (j ,j+1) ---  so upto  < lenght-1
         // inner loop have i also as in each pass we ignore last sorted element
      }
      static void swap(int A[] ,int a  ,int b){
            int temp = A[a];
            A[a]= A[b];
            A[b]=temp;

            
      }
      public static void main(String[] args) {
            //  technique of sorting
            // java has inbuild function for sorrting array
            // but we still learn this , gives idea

            int a[] ={3,5,1,2,9};
            sort(a);
            System.out.println(Arrays.toString(a));
         

      }
}


//  Arrays.tostring()   ---- to print array as aarray ,  innerly it use string builder aand append s [ , and elements  , return type is string
// Integer.parseInt()  ------wrapper class method
// Integer.MAX_VALUE , Integer.MIN_VALUE  ---- wrapper class method

